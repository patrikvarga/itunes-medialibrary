package net.kemitix.itunes.medialibrary;

import net.kemitix.itunes.medialibrary.v4.DbVersion4;
import net.kemitix.itunes.medialibrary.v5.DbVersion5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.PropertySource;

public class ITunesMediaLibrary {

    private static class BeanAccessor {

        @Autowired
        @ReadOnly
        @DbVersion4
        @Lazy
        private MediaLibrary readonlyLib4;
        @Autowired
        @Writable
        @DbVersion4
        @Lazy
        private WritableMediaLibrary writableLib4;
        @Autowired
        @ReadOnly
        @DbVersion5
        @Lazy
        private MediaLibrary readonlyLib5;
        @Autowired
        @Writable
        @DbVersion5
        @Lazy
        private WritableMediaLibrary writableLib5;

        private <T extends MediaLibrary> T get(Class<T> clazz, boolean v4) {
            final boolean writable = WritableMediaLibrary.class.isAssignableFrom(clazz);
            if (writable) {
                if (v4) {
                    return (T) writableLib4;
                } else {
                    return (T) writableLib5;
                }
            } else if (v4) {
                return (T) readonlyLib4;
            } else {
                return (T) readonlyLib5;
            }
        }
    }

    private static <T extends MediaLibrary> T createLibrary(String mediaLibraryFileName, Class<T> clazz, boolean v4) {
        final AnnotationConfigApplicationContext cx
                = new AnnotationConfigApplicationContext();
        cx.getEnvironment()
                .getPropertySources()
                .addFirst(
                        new PropertySource<String>("medialibrary") {

                    @Override
                    public String getProperty(String name) {
                        if (name.equals("medialibrary.filename")) {
                            return mediaLibraryFileName;
                        }
                        return null;
                    }
                });
        cx.register(LibraryConfiguration.class);
        cx.refresh();

        final BeanAccessor beanAccessor = new BeanAccessor();
        cx.getAutowireCapableBeanFactory().autowireBean(beanAccessor);
        final T bean = beanAccessor.get(clazz, v4);

        return bean;
    }

    public static MediaLibrary createV5Library(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, MediaLibrary.class, false);
    }

    public static WritableMediaLibrary createWritableV5Library(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, WritableMediaLibrary.class, false);
    }

    public static MediaLibrary createV4Library(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, MediaLibrary.class, true);
    }

    public static WritableMediaLibrary createWritableV4Library(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, WritableMediaLibrary.class, true);
    }

}

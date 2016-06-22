package net.kemitix.itunes.medialibrary;

import java.lang.annotation.Annotation;
import net.kemitix.itunes.medialibrary.files.FileSystem;
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
        @Autowired
        @ReadOnly
        @FileSystem
        @Lazy
        private MediaLibrary readonlyFsLib;

        private <T extends MediaLibrary, A extends Annotation> T get(Class<T> clazz, Class<A> annotation) {
            final boolean writable = WritableMediaLibrary.class.isAssignableFrom(clazz);
            if (writable) {
                if (annotation == DbVersion4.class) {
                    return (T) writableLib4;
                } else if (annotation == DbVersion5.class) {
                    return (T) writableLib5;
                }
            } else if (annotation == DbVersion4.class) {
                return (T) readonlyLib4;
            } else if (annotation == DbVersion5.class) {
                return (T) readonlyLib5;
            } else if (annotation == FileSystem.class) {
                return (T) readonlyFsLib;
            }
            throw new IllegalArgumentException("Unknown library type: " + annotation.getSimpleName());
        }
    }

    private static <T extends MediaLibrary, A extends Annotation> T createLibrary(String mediaLibraryFileName, Class<T> clazz, Class<A> annotation) {
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
        final T bean = beanAccessor.get(clazz, annotation);

        return bean;
    }

    public static MediaLibrary createV5Library(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, MediaLibrary.class, DbVersion5.class);
    }

    public static WritableMediaLibrary createWritableV5Library(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, WritableMediaLibrary.class, DbVersion5.class);
    }

    public static MediaLibrary createV4Library(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, MediaLibrary.class, DbVersion4.class);
    }

    public static WritableMediaLibrary createWritableV4Library(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, WritableMediaLibrary.class, DbVersion4.class);
    }

    public static MediaLibrary createFileSystemLibrary(String mediaLibraryPath) {
        return createLibrary(mediaLibraryPath, MediaLibrary.class, FileSystem.class);
    }

}

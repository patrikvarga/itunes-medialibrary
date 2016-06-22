package net.kemitix.itunes.medialibrary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

public class ITunesMediaLibrary {

    private static <T extends MediaLibrary> T createLibrary(String mediaLibraryFileName, Class<T> clazz, String profile) {
        final AnnotationConfigApplicationContext cx
                = new AnnotationConfigApplicationContext();
        final ConfigurableEnvironment env = cx.getEnvironment();
        env.setActiveProfiles(profile);
        env.getPropertySources()
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

        final T bean = cx.getBean(clazz);

        return bean;
    }

    public static MediaLibrary createV5Library(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, MediaLibrary.class, "v5/ro");
    }

    public static WritableMediaLibrary createWritableV5Library(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, WritableMediaLibrary.class, "v5/rw");
    }

    public static MediaLibrary createV4Library(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, MediaLibrary.class, "v4/ro");
    }

    public static WritableMediaLibrary createWritableV4Library(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, WritableMediaLibrary.class, "v4/rw");
    }

    public static MediaLibrary createFileSystemLibrary(String mediaLibraryPath) {
        return createLibrary(mediaLibraryPath, MediaLibrary.class, "fs/ro");
    }

}

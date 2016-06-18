package net.kemitix.itunes.medialibrary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.PropertySource;

public class ITunesMediaLibrary {

    private static MediaLibrary createLibrary(String mediaLibraryFileName, Class<? extends MediaLibrary> beanClass) {
        AnnotationConfigApplicationContext cx
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

        return cx.getBean(beanClass);
    }

    public static MediaLibrary createLibrary(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, MediaLibrary.class);
    }

    public static MediaLibrary createWritableLibrary(String mediaLibraryFileName) {
        return createLibrary(mediaLibraryFileName, WritableMediaLibrary.class);
    }

}

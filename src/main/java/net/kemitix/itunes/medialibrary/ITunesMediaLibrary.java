package net.kemitix.itunes.medialibrary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ITunesMediaLibrary {

    public static MediaLibrary createLibrary() {
        AnnotationConfigApplicationContext cx
                = new AnnotationConfigApplicationContext(LibraryConfiguration.class);
        return cx.getBean(MediaLibrary.class);
    }
}

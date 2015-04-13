package net.kemitix.itunes.medialibrary;

import java.io.File;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ITunesMediaLibrary {

    private final AnnotationConfigApplicationContext cx;
    private final MediaLibrary mediaLibrary;

    public ITunesMediaLibrary(File mediaLibraryFile) {
        cx = new AnnotationConfigApplicationContext(LibraryConfiguration.class);
        mediaLibrary = cx.getBean(MediaLibrary.class);
    }

    List<Album> getAlbums() {
        return mediaLibrary.getAlbums();
    }
}

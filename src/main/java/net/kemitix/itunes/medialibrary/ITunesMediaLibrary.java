package net.kemitix.itunes.medialibrary;

import java.io.File;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Setter
@Getter
public class ITunesMediaLibrary {

    private final ApplicationContext cx;

    private final MediaLibrary mediaLibrary;

    public ITunesMediaLibrary(File mediaLibraryFile) {
        cx = new AnnotationConfigApplicationContext(LibraryConfiguration.class);
        mediaLibrary = cx.getBean(MediaLibrary.class);
        mediaLibrary.setLibraryFile(mediaLibraryFile);
    }

    public boolean isLibraryConnected() {
        return mediaLibrary.isLibraryConnected();
    }
}

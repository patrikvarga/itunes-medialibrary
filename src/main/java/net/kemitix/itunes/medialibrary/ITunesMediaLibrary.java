package net.kemitix.itunes.medialibrary;

import java.io.File;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ITunesMediaLibrary {

    private final MediaLibrary mediaLibrary;

    public ITunesMediaLibrary(File mediaLibraryFile) {
        mediaLibrary = new MediaLibraryImpl();
        mediaLibrary.setLibraryFile(mediaLibraryFile);
    }

    public boolean isLibraryConnected() {
        return mediaLibrary.isLibraryConnected();
    }
}

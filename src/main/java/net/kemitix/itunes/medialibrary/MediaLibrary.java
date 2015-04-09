package net.kemitix.itunes.medialibrary;

import java.io.File;

interface MediaLibrary {

    void setLibraryFile(File sqliteFile);

    boolean isLibraryConnected();

}

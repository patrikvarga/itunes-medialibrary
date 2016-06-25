package net.kemitix.itunes.medialibrary.examples;

import net.kemitix.itunes.medialibrary.ITunesMediaLibrary;
import net.kemitix.itunes.medialibrary.MediaLibrary;
import net.kemitix.itunes.medialibrary.LibraryMigrator;
import net.kemitix.itunes.medialibrary.WritableMediaLibrary;

public class SyncFileSystemToV5DatabaseExample {

    private static final String MUSIC_DIR = "/mnt/iPhone/iTunes_Control/Music";
    private static final String FILE = "/mnt/iPhone/iTunes_Control/iTunes/MediaLibrary.sqlitedb";

    public static void main(String[] args) {
        final MediaLibrary fsLibrary = ITunesMediaLibrary.createFileSystemLibrary(MUSIC_DIR);
        final WritableMediaLibrary dbLibrary = ITunesMediaLibrary.createWritableV5Library(FILE);
        final LibraryMigrator migrator = new LibraryMigrator(fsLibrary, dbLibrary);
        migrator.updateNewTracks();
    }

}

package net.kemitix.itunes.medialibrary.examples;

import java.util.List;
import net.kemitix.itunes.medialibrary.ITunesMediaLibrary;
import net.kemitix.itunes.medialibrary.MediaLibrary;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;

public class ListFileSystemContentsExample {

    private static final String MUSIC_DIR = ".";

    public static void main(String[] args) {
        final MediaLibrary library = ITunesMediaLibrary.createFileSystemLibrary(MUSIC_DIR);
        final List<AlbumTrack> allTracks = library.getAlbumTracks();

        allTracks.forEach(System.out::println);
        System.out.println();

        ListContentsExample.printAlbumTracks(allTracks);
    }
}

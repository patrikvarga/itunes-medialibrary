package net.kemitix.itunes.medialibrary.examples;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.List;
import net.kemitix.itunes.medialibrary.ITunesMediaLibrary;
import net.kemitix.itunes.medialibrary.MediaLibrary;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;

public class SyncFileSystemToV5DatabaseExample {

    private static final String MUSIC_DIR = "/mnt/iPhone/iTunes_Control/Music";
    private static final String FILE = "/mnt/iPhone/iTunes_Control/iTunes/MediaLibrary.sqlitedb";

    public static void main(String[] args) {
        final MediaLibrary fsLibrary = ITunesMediaLibrary.createFileSystemLibrary(MUSIC_DIR);
        final List<AlbumTrack> fsTracks = fsLibrary.getAlbumTracks();
        System.out.println("Found " + fsTracks.size() + " tracks in file system");
        fsTracks.forEach(t -> {
            t.setBaseLocation(t.getBaseLocation().substring(t.getBaseLocation().indexOf("iTunes_Control")));
            printTrack(t);
        });
        System.out.println("\n");

        final MediaLibrary dbLibrary = ITunesMediaLibrary.createWritableV5Library(FILE);
        final List<AlbumTrack> dbTracks = dbLibrary.getAlbumTracks();
        Collections.sort(dbTracks, comparing(AlbumTrack::getBaseLocation).thenComparing(AlbumTrack::getFileLocation));
        System.out.println("Found " + dbTracks.size() + " tracks in database");
        dbTracks.forEach(SyncFileSystemToV5DatabaseExample::printTrack);
        System.out.println("\n");

        final List<AlbumTrack> newFsTracks = new ArrayList<>(fsTracks);
        newFsTracks.removeAll(dbTracks);

        System.out.println("Found " + newFsTracks.size() + " new tracks in file system");
        newFsTracks.forEach(SyncFileSystemToV5DatabaseExample::printTrack);
    }

    private static void printTrack(AlbumTrack t) {
        System.out.println(t.getBaseLocation() + "\t" + t.getFileLocation() + "\t\t" + t.getTrackArtist() + ": " + t.getTrackTitle());
    }

}

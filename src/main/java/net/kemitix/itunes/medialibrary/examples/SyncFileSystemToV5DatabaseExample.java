package net.kemitix.itunes.medialibrary.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.kemitix.itunes.medialibrary.ITunesMediaLibrary;
import net.kemitix.itunes.medialibrary.MediaLibrary;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import static java.util.Comparator.comparing;
import java.util.Optional;
import net.kemitix.itunes.medialibrary.WritableMediaLibrary;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.Artist;

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

        final WritableMediaLibrary dbLibrary = ITunesMediaLibrary.createWritableV5Library(FILE);
        final List<AlbumTrack> dbTracks = dbLibrary.getAlbumTracks();
        Collections.sort(dbTracks, comparing(AlbumTrack::getBaseLocation).thenComparing(AlbumTrack::getFileLocation));
        System.out.println("Found " + dbTracks.size() + " tracks in database");
        dbTracks.forEach(SyncFileSystemToV5DatabaseExample::printTrack);
        System.out.println("\n");

        final List<AlbumTrack> newFsTracks = new ArrayList<>(fsTracks);
        newFsTracks.removeAll(dbTracks);

        System.out.println("Found " + newFsTracks.size() + " new tracks in file system");
        newFsTracks.forEach(SyncFileSystemToV5DatabaseExample::printTrack);

        final List<Artist> allDbAlbumArtists = dbLibrary.getAlbumArtists();
        final List<Artist> allDbArtists = dbLibrary.getArtists();
        final List<Album> allDbAlbums = dbLibrary.getAlbums();

        for (AlbumTrack newFsTrack : newFsTracks) {
            final Optional<Album> matchingAlbum = allDbAlbums.stream().filter(a
                    -> a.getTitle().equals(newFsTrack.getAlbumTitle())
                    && a.getArtist().getTitle().equals(newFsTrack.getAlbumArtist())
                    && a.getYear() == newFsTrack.getYear()).findFirst();
            final Optional<Artist> matchingAlbumArtist = allDbAlbumArtists.stream().filter(a
                    -> a.getTitle().equals(newFsTrack.getAlbumArtist())).findFirst();
            final Optional<Artist> matchingArtist = allDbArtists.stream().filter(a
                    -> a.getTitle().equals(newFsTrack.getTrackArtist())).findFirst();

            if (!matchingArtist.isPresent()) {
                final Artist artist = new Artist();
                artist.setTitle(newFsTrack.getTrackArtist());
                artist.setSortTitle(newFsTrack.getTrackArtist());
                dbLibrary.createArtist(artist);
            }
            if (!matchingAlbumArtist.isPresent()) {
                final Artist artist = new Artist();
                artist.setTitle(newFsTrack.getAlbumArtist());
                artist.setSortTitle(newFsTrack.getAlbumArtist());
                dbLibrary.createAlbumArtist(artist);
            }

            if (!matchingAlbum.isPresent()) {
                final Album album = new Album();
                album.setTitle(newFsTrack.getAlbumTitle());
                album.setSortTitle(newFsTrack.getAlbumTitle());
                album.setYear(newFsTrack.getYear());
                dbLibrary.createAlbum(album);
            }
        }
    }

    private static void printTrack(AlbumTrack t) {
        System.out.println(t.getBaseLocation() + "\t" + t.getFileLocation() + "\t\t" + t.getTrackArtist() + ": " + t.getTrackTitle());
    }

}

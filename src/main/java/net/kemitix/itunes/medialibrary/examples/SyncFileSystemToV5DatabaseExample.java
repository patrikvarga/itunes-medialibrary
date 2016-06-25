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
import net.kemitix.itunes.medialibrary.items.Item;

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
            final long itemArtistId = findOrCreateArtist(allDbArtists, newFsTrack, dbLibrary);
            final long albumArtistId = findOrCreateAlbumArtist(allDbAlbumArtists, newFsTrack, dbLibrary);
            final long albumId = findOrCreateAlbum(allDbAlbums, newFsTrack, dbLibrary, albumArtistId);
            final long itemId = dbLibrary.createItem(toItem(newFsTrack, itemArtistId, albumArtistId, albumId, dbLibrary));
            dbLibrary.updateRepresentativeItemIds(itemId, itemArtistId, albumArtistId, albumId);
        }
    }

    private static long findOrCreateArtist(final List<Artist> allDbArtists, final AlbumTrack newFsTrack, final WritableMediaLibrary dbLibrary) {
        final Optional<Artist> matchingArtist = allDbArtists.stream().filter(a
                -> a.getTitle().equals(newFsTrack.getTrackArtist())).findFirst();
        if (!matchingArtist.isPresent()) {
            final Artist artist = new Artist();
            artist.setTitle(newFsTrack.getTrackArtist());
            artist.setSortTitle(newFsTrack.getTrackArtist());
            dbLibrary.createArtist(artist);
            return artist.getId();
        } else {
            return matchingArtist.get().getId();
        }
    }

    private static long findOrCreateAlbumArtist(final List<Artist> allDbAlbumArtists, final AlbumTrack newFsTrack, final WritableMediaLibrary dbLibrary) {
        final Optional<Artist> matchingAlbumArtist = allDbAlbumArtists.stream().filter(a
                -> a.getTitle().equals(newFsTrack.getAlbumArtist())).findFirst();
        if (!matchingAlbumArtist.isPresent()) {
            final Artist artist = new Artist();
            artist.setTitle(newFsTrack.getAlbumArtist());
            artist.setSortTitle(newFsTrack.getAlbumArtist());
            dbLibrary.createAlbumArtist(artist);
            return artist.getId();
        } else {
            return matchingAlbumArtist.get().getId();
        }
    }

    private static long findOrCreateAlbum(final List<Album> allDbAlbums, final AlbumTrack newFsTrack, final WritableMediaLibrary dbLibrary, long albumArtistId) {
        final Optional<Album> matchingAlbum = allDbAlbums.stream().filter(a
                -> a.getTitle().equals(newFsTrack.getAlbumTitle())
                && a.getArtist() != null && a.getArtist().getTitle().equals(newFsTrack.getAlbumArtist())
                && a.getYear() == newFsTrack.getYear()).findFirst();
        if (!matchingAlbum.isPresent()) {
            final Album album = new Album();
            album.setTitle(newFsTrack.getAlbumTitle());
            album.setSortTitle(newFsTrack.getAlbumTitle());
            album.setYear(newFsTrack.getYear());
            album.setAlbumArtistPid(albumArtistId);
            dbLibrary.createAlbum(album);
            return album.getId();
        } else {
            return matchingAlbum.get().getId();
        }
    }

    private static void printTrack(AlbumTrack t) {
        System.out.println(t.getBaseLocation() + "\t" + t.getFileLocation() + "\t\t" + t.getTrackArtist() + ": " + t.getTrackTitle());
    }

    private static Item toItem(AlbumTrack newFsTrack, long itemArtistId, long albumArtistId, long albumId, WritableMediaLibrary dbLibrary) {
        final Item item = new Item();
        // TODO item transform
        return item;
    }

}

package net.kemitix.itunes.medialibrary;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.Optional;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Item;

public class LibraryMigrator {

    private final MediaLibrary source;
    private final WritableMediaLibrary dest;

    public LibraryMigrator(MediaLibrary source, WritableMediaLibrary dest) {
        this.source = source;
        this.dest = dest;
    }

    public void updateNewTracks() {
        final List<AlbumTrack> newTracksInSource = findNewTracks();

        newTracksInSource.stream().forEach(newTrack -> {
            final long itemArtistId = findOrCreateArtist(newTrack);
            final long albumArtistId = findOrCreateAlbumArtist(newTrack);
            final long albumId = findOrCreateAlbum(newTrack, albumArtistId);
            final long itemId = dest.createItem(toItem(newTrack, itemArtistId, albumArtistId, albumId));
            dest.updateRepresentativeItemIds(itemId, itemArtistId, albumArtistId, albumId);
        });

    }

    private List<AlbumTrack> findNewTracks() {
        final List<AlbumTrack> sourceTracks = source.getAlbumTracks();
        System.out.println("Found " + sourceTracks.size() + " tracks in file system");
        sourceTracks.forEach(t -> {
            t.setBaseLocation(t.getBaseLocation().substring(t.getBaseLocation().indexOf("iTunes_Control")));
            printTrack(t);
        });
        System.out.println("\n");
        final List<AlbumTrack> destTracks = dest.getAlbumTracks();
        Collections.sort(destTracks, comparing(AlbumTrack::getBaseLocation).thenComparing(AlbumTrack::getFileLocation));
        System.out.println("Found " + destTracks.size() + " tracks in database");
        destTracks.forEach(LibraryMigrator::printTrack);
        System.out.println("\n");
        final List<AlbumTrack> newTracksInSource = new ArrayList<>(sourceTracks);
        newTracksInSource.removeAll(destTracks);
        System.out.println("Found " + newTracksInSource.size() + " new tracks in file system");
        newTracksInSource.forEach(LibraryMigrator::printTrack);
        return newTracksInSource;
    }

    private long findOrCreateArtist(final AlbumTrack newFsTrack) {
        final List<Artist> allArtistsInDest = dest.getArtists();
        final Optional<Artist> matchingArtist = allArtistsInDest.stream().filter(a
                -> a.getTitle().equals(newFsTrack.getTrackArtist())).findFirst();
        if (!matchingArtist.isPresent()) {
            final Artist artist = new Artist();
            artist.setTitle(newFsTrack.getTrackArtist());
            artist.setSortTitle(newFsTrack.getTrackArtist());
            dest.createArtist(artist);
            return artist.getId();
        } else {
            return matchingArtist.get().getId();
        }
    }

    private long findOrCreateAlbumArtist(final AlbumTrack newFsTrack) {
        final List<Artist> allAlbumArtistsInDest = dest.getAlbumArtists();
        final Optional<Artist> matchingAlbumArtist = allAlbumArtistsInDest.stream().filter(a
                -> a.getTitle().equals(newFsTrack.getAlbumArtist())).findFirst();
        if (!matchingAlbumArtist.isPresent()) {
            final Artist artist = new Artist();
            artist.setTitle(newFsTrack.getAlbumArtist());
            artist.setSortTitle(newFsTrack.getAlbumArtist());
            dest.createAlbumArtist(artist);
            return artist.getId();
        } else {
            return matchingAlbumArtist.get().getId();
        }
    }

    private long findOrCreateAlbum(final AlbumTrack newFsTrack, long albumArtistId) {
        final List<Album> allAlbumsInDest = dest.getAlbums();
        final Optional<Album> matchingAlbum = allAlbumsInDest.stream().filter(a
                -> a.getTitle().equals(newFsTrack.getAlbumTitle())
                && a.getArtist() != null && a.getArtist().getTitle().equals(newFsTrack.getAlbumArtist())
                && a.getYear() == newFsTrack.getYear()).findFirst();
        if (!matchingAlbum.isPresent()) {
            final Album album = new Album();
            album.setTitle(newFsTrack.getAlbumTitle());
            album.setSortTitle(newFsTrack.getAlbumTitle());
            album.setYear(newFsTrack.getYear());
            album.setAlbumArtistPid(albumArtistId);
            dest.createAlbum(album);
            return album.getId();
        } else {
            return matchingAlbum.get().getId();
        }
    }

    private static void printTrack(AlbumTrack t) {
        System.out.println(t.getBaseLocation() + "\t" + t.getFileLocation() + "\t\t" + t.getTrackArtist() + ": " + t.getTrackTitle());
    }

    private static Item toItem(AlbumTrack newTrack, long itemArtistId, long albumArtistId, long albumId) {
        final Item item = new Item();
        // TODO item transform
        return item;
    }

}

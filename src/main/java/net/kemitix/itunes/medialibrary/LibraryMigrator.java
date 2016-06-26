package net.kemitix.itunes.medialibrary;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.BaseLocation;
import net.kemitix.itunes.medialibrary.items.Genre;
import net.kemitix.itunes.medialibrary.items.Item;
import net.kemitix.itunes.medialibrary.items.ItemExtra;

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
            final long genreId = findOrCreateGenre(newTrack);
            final long baseLocationId = findOrCreateBaseLocation(newTrack);
            final Item newItem = toItem(newTrack, itemArtistId, albumArtistId, albumId, genreId, baseLocationId);
            final long itemId = dest.createItem(newItem);
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
        final List<AlbumTrack> destTracks = dest.getAlbumTracks().stream()
                .filter(t -> t.getBaseLocation() != null && t.getFileLocation() != null)
                .collect(Collectors.toList());
        Collections.sort(destTracks,
                comparing(AlbumTrack::getBaseLocation).
                thenComparing(AlbumTrack::getFileLocation));
        System.out.println("Found " + destTracks.size() + " tracks in database");
        destTracks.forEach(LibraryMigrator::printTrack);
        System.out.println("\n");
        final List<AlbumTrack> newTracksInSource = new ArrayList<>(sourceTracks);
        newTracksInSource.removeAll(destTracks);
        System.out.println("Found " + newTracksInSource.size() + " new tracks in file system");
        newTracksInSource.forEach(LibraryMigrator::printTrack);
        return newTracksInSource;
    }

    private long findOrCreateArtist(final AlbumTrack track) {
        final List<Artist> allArtistsInDest = dest.getArtists();
        final Optional<Artist> matchingArtist = allArtistsInDest.stream().filter(a
                -> a.getTitle().equals(track.getTrackArtist())).findFirst();
        if (!matchingArtist.isPresent()) {
            final Artist artist = new Artist();
            artist.setTitle(track.getTrackArtist());
            artist.setSortTitle(track.getTrackArtist());
            dest.createArtist(artist);
            return artist.getId();
        } else {
            return matchingArtist.get().getId();
        }
    }

    private long findOrCreateAlbumArtist(final AlbumTrack track) {
        final List<Artist> allAlbumArtistsInDest = dest.getAlbumArtists();
        final Optional<Artist> matchingAlbumArtist = allAlbumArtistsInDest.stream().filter(a
                -> a.getTitle().equals(track.getAlbumArtist())).findFirst();
        if (!matchingAlbumArtist.isPresent()) {
            final Artist artist = new Artist();
            artist.setTitle(track.getAlbumArtist());
            artist.setSortTitle(track.getAlbumArtist());
            dest.createAlbumArtist(artist);
            return artist.getId();
        } else {
            return matchingAlbumArtist.get().getId();
        }
    }

    private long findOrCreateAlbum(final AlbumTrack track, long albumArtistId) {
        final List<Album> allAlbumsInDest = dest.getAlbums();
        final Optional<Album> matchingAlbum = allAlbumsInDest.stream().filter(a
                -> a.getTitle().equals(track.getAlbumTitle())
                && a.getArtist() != null && a.getArtist().getTitle().equals(track.getAlbumArtist())
                && a.getYear() == track.getYear()).findFirst();
        if (!matchingAlbum.isPresent()) {
            final Album album = new Album();
            album.setTitle(track.getAlbumTitle());
            album.setSortTitle(track.getAlbumTitle());
            album.setYear(track.getYear());
            album.setAlbumArtistPid(albumArtistId);
            dest.createAlbum(album);
            return album.getId();
        } else {
            return matchingAlbum.get().getId();
        }
    }

    private long findOrCreateGenre(AlbumTrack track) {
        if (track.getGenre() == null) {
            return 0;
        }
        final List<Genre> allGenresInDest = dest.getGenres();
        final Optional<Genre> matchingGenre = allGenresInDest.stream().filter(g
                -> g.getGenre().equals(track.getGenre())).findFirst();
        if (!matchingGenre.isPresent()) {
            final Genre genre = new Genre();
            genre.setGenre(track.getGenre());
            dest.createGenre(genre);
            return genre.getId();
        } else {
            return matchingGenre.get().getId();
        }
    }

    private long findOrCreateBaseLocation(AlbumTrack track) {
        final List<BaseLocation> allBaseLocationsInDest = dest.getBaseLocations();
        final Optional<BaseLocation> matchingBaseLocation = allBaseLocationsInDest.stream().filter(bl
                -> bl.getPath().equals(track.getBaseLocation())).findFirst();
        if (!matchingBaseLocation.isPresent()) {
            final BaseLocation baseLocation = new BaseLocation();
            baseLocation.setPath(track.getBaseLocation());
            dest.createBaseLocation(baseLocation);
            return baseLocation.getId();
        } else {
            return matchingBaseLocation.get().getId();
        }
    }

    private static void printTrack(AlbumTrack t) {
        System.out.println(t.getBaseLocation() + "\t" + t.getFileLocation() + "\t\t" + t.getTrackArtist() + ": " + t.getTrackTitle());
    }

    private static Item toItem(AlbumTrack t, long itemArtistId, long albumArtistId, long albumId, long genreId, long baseLocationId) {
        final Item item = new Item();
        item.setAlbumArtistPid(albumArtistId);
        item.setAlbumArtistOrder(0);
        item.setAlbumArtistOrderSection(0);
        item.setAlbumPid(albumId);
        item.setAlbumOrder(0);
        item.setAlbumOrderSection(0);
        item.setBaseLocationId(baseLocationId);
        item.setDiscNumber(t.getDiscNumber());
        item.setGenreId(genreId);
        item.setGenreOrder(0);
        item.setGenreOrderSection(0);
        item.setItemArtistPid(itemArtistId);
        item.setItemArtistOrder(0);
        item.setItemArtistOrderSection(0);
        item.setMediaType(8); // 8 == mp3
        item.setRemoteLocationId(0);
        item.setSeriesNameOrder(0);
        item.setSeriesNameOrderSection(0);
        item.setTitleOrder(0);
        item.setTitleOrderSection(0);
        item.setTrackNumber(t.getTrackNumber());
        item.setExtra(toItemExtra(t));
        return item;
    }

    private static ItemExtra toItemExtra(AlbumTrack t) {
        final ItemExtra extra = new ItemExtra();
        extra.setComment(t.getComment());
        extra.setLocation(t.getFileLocation());
        extra.setTitle(t.getTrackTitle());
        extra.setSortTitle(t.getTrackTitle());
        extra.setBpm(t.getBpm());
        extra.setFileSize(t.getFileSize());
        extra.setTotalTimeMs(t.getTotalTimeMs());
        extra.setYear(t.getYear());
        return extra;
    }

}

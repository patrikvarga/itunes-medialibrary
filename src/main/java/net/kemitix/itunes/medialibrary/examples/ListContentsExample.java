package net.kemitix.itunes.medialibrary.examples;

import java.util.List;
import static java.util.stream.Collectors.groupingBy;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.ITunesMediaLibrary;
import net.kemitix.itunes.medialibrary.MediaLibrary;

/**
 * Displays all the tracks in the test media library, grouped by artist and album.
 *
 * Where an individual track has a different artist the album, that is listed beside the song title.
 *
 * @author pcampbell@kemitix.net
 */
public class ListContentsExample {

    private static final String FILE = "src/test/resources/MediaLibrary.sqlitedb";

    public static void main(String[] args) {
        final MediaLibrary library = ITunesMediaLibrary.createV5Library(FILE);
        final List<AlbumTrack> allTracks = library.getAlbumTracks();

        System.out.format("Found %d album tracks\n\n", allTracks.size());

        printAlbumTracks(allTracks);
    }

    static void printAlbumTracks(final List<AlbumTrack> allTracks) {
        allTracks.stream()
                .collect(groupingBy(AlbumTrack::getAlbumArtist))
                .forEach((String albumArtist, List<AlbumTrack> artistsTracks) -> {
                    System.out.println(albumArtist);
                    artistsTracks.stream()
                            .collect(groupingBy(AlbumTrack::getAlbumTitle))
                            .forEach((String albumTitle, List<AlbumTrack> albumTracks) -> {
                                System.out.println("\t" + albumTitle);
                                albumTracks.stream()
                                        .forEach((AlbumTrack albumTrack) -> {
                                            if (albumArtist.equals(albumTrack.getTrackArtist())) {
                                                System.out.format("\t\t%02d. %s\n", albumTrack.getTrackNumber(), albumTrack.getTrackTitle());
                                            } else {
                                                System.out.format("\t\t%02d. %s - %s\n", albumTrack.getTrackNumber(), albumTrack.getTrackArtist(), albumTrack.getTrackTitle());
                                            }
                                        });
                            });
                });
    }
}

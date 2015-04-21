package net.kemitix.itunes.medialibrary.examples;

import java.sql.SQLException;
import java.util.List;
import static java.util.stream.Collectors.groupingBy;
import net.kemitix.itunes.medialibrary.AlbumTracks;
import net.kemitix.itunes.medialibrary.ITunesMediaLibrary;
import net.kemitix.itunes.medialibrary.MediaLibrary;

/**
 * Displays all the tracks in the test media library, grouped by artist and
 * album.
 *
 * Where an individual track has a different artist the album, that is listed
 * beside the song title.
 *
 * @author pcampbell@kemitix.net
 */
public class ListContents {

    private static final String FILE = "src/test/resources/MediaLibrary.sqlitedb";

    public static void main(String[] args) throws SQLException {
        MediaLibrary library = ITunesMediaLibrary.createLibrary(FILE);
        List<AlbumTracks> allTracks = library.getAlbumTracks();
        System.out.format("Found %d album tracks\n", allTracks.size());
        allTracks.stream()
                .collect(groupingBy(AlbumTracks::getAlbumArtist))
                .forEach((String albumArtist, List<AlbumTracks> artistsTracks) -> {
                    System.out.println(albumArtist);
                    artistsTracks.stream()
                    .collect(groupingBy(AlbumTracks::getAlbumTitle))
                    .forEach((String albumTitle, List<AlbumTracks> albumTracks) -> {
                        System.out.println("\t" + albumTitle);
                        albumTracks.stream()
                        .forEach((AlbumTracks albumTrack) -> {
                            if (albumArtist.equals(albumTrack.getTrackArtist())) {
                                System.out.format("\t\t- %s\n", albumTrack.getTrackTitle());
                            } else {
                                System.out.format("\t\t- %s [[%s]]\n", albumTrack.getTrackTitle(), albumTrack.getTrackArtist());
                            }
                        });
                    });
                });
    }
}

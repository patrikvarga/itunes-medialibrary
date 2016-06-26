package net.kemitix.itunes.medialibrary.files;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import net.kemitix.itunes.medialibrary.MediaLibrary;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.BaseLocation;
import net.kemitix.itunes.medialibrary.items.Genre;
import net.kemitix.itunes.medialibrary.items.Item;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("fs/ro")
public class MediaLibraryFilesSystemImpl implements MediaLibrary {

    @Value("${medialibrary.filename}")
    private String mediaLibraryFilePath;

    @Override
    public List<Album> getAlbums() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Artist> getAlbumArtists() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Artist> getArtists() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Genre> getGenres() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<BaseLocation> getBaseLocations() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Item> getItems() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<AlbumTrack> getAlbumTracks() {
        final List<Path> files = listFiles(Paths.get(mediaLibraryFilePath));
        Collections.sort(files);
        return files.stream()
                .filter(MediaLibraryFilesSystemImpl::isMediaFile)
                .map(MediaLibraryFilesSystemImpl::toAlbumTrack)
                .collect(Collectors.toList());
    }

    private static boolean isMediaFile(Path path) {
        return path.getFileName().toString().endsWith(".mp3");
    }

    private static AlbumTrack toAlbumTrack(Path path) {
        try {
            final AlbumTrack track = new AlbumTrack();
            track.setBaseLocation(path.getParent().toString());
            track.setFileLocation(path.getFileName().toString());
            final File f = path.toFile();
            final Mp3File file = new Mp3File(f);
            track.setAlbumArtist(getAlbumArtistSafely(file));
            track.setAlbumTitle(file.getAlbum());
            track.setBpm(getBpmSafely(file));
            track.setComment(file.getComment());
            track.setDiscNumber(getDiscNumberSafely(file));
            track.setFileSize(f.length());
            track.setGenre(file.getGenreDescription());
            track.setTotalTimeMs(file.getLengthInMilliseconds());
            track.setTrackArtist(file.getArtist());
            track.setTrackNumber(getTrackNumberSafely(file));
            track.setTrackTitle(file.getTitle());
            track.setYear(getYearSafely(file));
            return track;
        } catch (IOException | UnsupportedTagException | InvalidDataException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static int getDiscNumberSafely(final Mp3File file) {
        String trackNumberString = file.getTrack();
        if (trackNumberString != null && trackNumberString.contains("/")) {
            final String discNumberString = trackNumberString.split("/")[1];
            return Integer.valueOf(discNumberString);
        }
        return 1;
    }

    private static int getTrackNumberSafely(final Mp3File file) {
        String trackNumberString = file.getTrack();
        if (trackNumberString != null) {
            if (trackNumberString.contains("/")) {
                trackNumberString = trackNumberString.split("/")[0];
            }
            return Integer.valueOf(trackNumberString);
        } else {
            return 0;
        }
    }

    private static int getYearSafely(final Mp3File file) {
        String yearString = file.getYear();
        if (yearString != null) {
            return Integer.valueOf(yearString);
        } else {
            return 0;
        }
    }

    private static String getAlbumArtistSafely(final Mp3File file) {
        String albumArtist = null;
        if (file.hasId3v2Tag()) {
            if (file.getId3v2Tag().getAlbumArtist() != null) {
                albumArtist = file.getId3v2Tag().getAlbumArtist();
            } else if (file.getId3v2Tag().getArtist() != null) {
                albumArtist = file.getId3v2Tag().getArtist();
            }
        }
        if (albumArtist == null && file.hasId3v1Tag() && file.getId3v1Tag().getArtist() != null) {
            albumArtist = file.getId3v1Tag().getArtist();
        }
        return albumArtist;
    }

    private static int getBpmSafely(Mp3File file) {
        return file.hasId3v2Tag() ? file.getId3v2Tag().getBPM() : 0;
    }

    @Override
    public AlbumTrack findAlbumTrack(File file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private List<Path> listFiles(Path path) {
        final List<Path> files = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path entry : stream) {
                if (Files.isDirectory(entry)) {
                    files.addAll(listFiles(entry));
                }
                files.add(entry);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return files;
    }
}

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
    public List<Artist> getArtists() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Item> getItems() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<AlbumTrack> getAlbumTracks() {
        // TODO getAlbumTracks from directories
        return listFiles(Paths.get(mediaLibraryFilePath)).stream()
                .filter(MediaLibraryFilesSystemImpl::isMediaFile)
                .map(MediaLibraryFilesSystemImpl::toAlbumTrack)
                .collect(Collectors.toList());
    }

    private static boolean isMediaFile(Path path) {
        return path.getFileName().endsWith(".mp3");
    }

    private static AlbumTrack toAlbumTrack(Path path) {
        try {
            final AlbumTrack track = new AlbumTrack();
            track.setBaseLocation(path.getParent().toString());
            track.setFileLocation(path.getFileName().toString());
            final Mp3File file = new Mp3File(path.toFile());
            track.setTrackArtist(file.getArtist());
            track.setTrackTitle(file.getTitle());
            track.setTrackNumber(Integer.valueOf(file.getTrack()));
            track.setYear(Integer.valueOf(file.getYear()));
            track.setAlbumTitle(file.getAlbum());
            return track;
        } catch (IOException | UnsupportedTagException | InvalidDataException ex) {
            throw new RuntimeException(ex);
        }
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
                    listFiles(entry);
                }
                files.add(entry);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        Collections.sort(files);
        return files;
    }
}

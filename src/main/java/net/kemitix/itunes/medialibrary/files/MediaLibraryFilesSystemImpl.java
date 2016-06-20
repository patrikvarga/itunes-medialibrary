package net.kemitix.itunes.medialibrary.files;

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
import net.kemitix.itunes.medialibrary.ReadOnly;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Item;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ReadOnly
@FileSystem
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
        return true;
    }

    private static AlbumTrack toAlbumTrack(Path path) {
        final AlbumTrack track = new AlbumTrack();
        track.setBaseLocation(path.getParent().toString());
        track.setFileLocation(path.getFileName().toString());
        // TODO read ID3 tag and fill info
        return track;
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

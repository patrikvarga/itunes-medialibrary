package net.kemitix.itunes.medialibrary.files;

import java.io.File;
import java.util.List;
import net.kemitix.itunes.medialibrary.MediaLibrary;
import net.kemitix.itunes.medialibrary.ReadOnly;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Item;
import net.kemitix.itunes.medialibrary.v5.DbVersion5;
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public AlbumTrack findAlbumTrack(File file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

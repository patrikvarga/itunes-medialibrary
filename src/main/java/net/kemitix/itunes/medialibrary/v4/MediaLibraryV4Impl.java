package net.kemitix.itunes.medialibrary.v4;

import java.io.File;
import java.util.List;
import net.kemitix.itunes.medialibrary.MediaLibrary;
import net.kemitix.itunes.medialibrary.ReadOnly;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Item;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ReadOnly
@DbVersion4
@Profile("v4/ro")
public class MediaLibraryV4Impl implements MediaLibrary {

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
        // TODO getAlbumTracks from iTunesDB.ext
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public AlbumTrack findAlbumTrack(File file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

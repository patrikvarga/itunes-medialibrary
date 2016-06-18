package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.v5.DbVersion5;
import java.sql.SQLException;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Item;
import net.kemitix.itunes.medialibrary.Writable;
import net.kemitix.itunes.medialibrary.WritableMediaLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Writable
@DbVersion5
public class WritableMediaLibraryV5Impl extends MediaLibraryV5Impl implements WritableMediaLibrary {

    @Autowired
    public WritableMediaLibraryV5Impl(AlbumDao albumDao, ArtistDao artistDao, ItemDao itemDao, AlbumTrackDao albumTracksDao) {
        super(albumDao, artistDao, itemDao, albumTracksDao);
    }

    @Override
    public long createAlbum(Album album) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long createArtist(Artist artist) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long createItem(Item item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

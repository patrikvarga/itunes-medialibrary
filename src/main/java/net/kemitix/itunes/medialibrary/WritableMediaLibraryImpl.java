package net.kemitix.itunes.medialibrary;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;

public class WritableMediaLibraryImpl extends MediaLibraryImpl implements WritableMediaLibrary {

    @Autowired
    public WritableMediaLibraryImpl(AlbumDao albumDao, ArtistDao artistDao, ItemDao itemDao, AlbumTrackDao albumTracksDao) {
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

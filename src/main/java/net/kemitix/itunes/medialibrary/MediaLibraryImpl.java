package net.kemitix.itunes.medialibrary;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class MediaLibraryImpl implements MediaLibrary {

    private final AlbumDao albumDao;
    private final ArtistDao artistDao;
    private final ItemDao itemDao;
    private final AlbumTracksDao albumTracksDao;

    @Autowired
    public MediaLibraryImpl(
            AlbumDao albumDao,
            ArtistDao artistDao,
            ItemDao itemDao,
            AlbumTracksDao albumTracksDao
    ) {
        this.albumDao = albumDao;
        this.artistDao = artistDao;
        this.itemDao = itemDao;
        this.albumTracksDao = albumTracksDao;
    }

    @Override
    public List<Album> getAlbums() throws SQLException {
        return albumDao.selectAll();
    }

    @Override
    public List<Artist> getArtists() throws SQLException {
        return artistDao.selectAll();
    }

    @Override
    public List<Item> getItems() throws SQLException {
        return itemDao.selectAll();
    }

    @Override
    public List<AlbumTracks> getAlbumTracks() throws SQLException {
        return albumTracksDao.selectAll();
    }
}

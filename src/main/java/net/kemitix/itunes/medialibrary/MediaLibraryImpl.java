package net.kemitix.itunes.medialibrary;

import java.io.File;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ReadOnly
@DbVersion5
class MediaLibraryImpl implements MediaLibrary {

    private final AlbumDao albumDao;
    private final ArtistDao artistDao;
    private final ItemDao itemDao;
    private final AlbumTrackDao albumTracksDao;

    @Autowired
    public MediaLibraryImpl(
            AlbumDao albumDao,
            ArtistDao artistDao,
            ItemDao itemDao,
            AlbumTrackDao albumTracksDao
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
    public List<AlbumTrack> getAlbumTracks() throws SQLException {
        return albumTracksDao.selectAll();
    }

    @Override
    public AlbumTrack findAlbumTrack(File file) {
        return albumTracksDao.find(file);
    }
}

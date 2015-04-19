package net.kemitix.itunes.medialibrary;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class MediaLibraryImpl implements MediaLibrary {

    private final AlbumDao albumDao;
    private final ArtistDao artistDao;

    @Autowired
    public MediaLibraryImpl(
            AlbumDao albumDao,
            ArtistDao artistDao,
    ) {
        this.albumDao = albumDao;
        this.artistDao = artistDao;
    }

    @Override
    public List<Album> getAlbums() throws SQLException {
        return albumDao.selectAll();
    }

    @Override
    public List<Artist> getArtists() throws SQLException {
        return artistDao.selectAll();
    }
    }
}

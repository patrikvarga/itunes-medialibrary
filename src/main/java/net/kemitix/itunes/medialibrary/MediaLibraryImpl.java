package net.kemitix.itunes.medialibrary;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class MediaLibraryImpl implements MediaLibrary {

    private final AlbumDao albumDao;

    @Autowired
    public MediaLibraryImpl(AlbumDao albumDao) {
        this.albumDao = albumDao;
    }

    @Override
    public List<Album> getAlbums() throws SQLException {
        return albumDao.selectAll();
    }
    }
}

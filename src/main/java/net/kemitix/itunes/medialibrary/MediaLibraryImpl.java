package net.kemitix.itunes.medialibrary;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public List<Album> getAlbums() {
        try {
            return albumDao.selectAll();
        } catch (SQLException ex) {
            Logger.getLogger(MediaLibraryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

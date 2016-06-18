package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.v5.DbVersion5;
import java.io.File;
import java.sql.SQLException;
import java.util.List;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Item;
import net.kemitix.itunes.medialibrary.MediaLibrary;
import net.kemitix.itunes.medialibrary.ReadOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ReadOnly
@DbVersion5
class MediaLibraryV5Impl implements MediaLibrary {

    private final AlbumDao albumDao;
    private final ArtistDao artistDao;
    private final ItemDao itemDao;
    private final AlbumTrackDao albumTracksDao;

    @Autowired
    public MediaLibraryV5Impl(
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

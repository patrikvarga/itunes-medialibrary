package net.kemitix.itunes.medialibrary.v5;

import java.io.File;
import java.util.List;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Item;
import net.kemitix.itunes.medialibrary.MediaLibrary;
import net.kemitix.itunes.medialibrary.ReadOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ReadOnly
@DbVersion5
@Profile("v5/ro")
class MediaLibraryV5Impl implements MediaLibrary {

    protected final AlbumDao albumDao;
    protected final ArtistDao artistDao;
    protected final ItemDao itemDao;
    protected final GenreDao genreDao;
    private final AlbumTrackDao albumTracksDao;

    @Autowired
    public MediaLibraryV5Impl(
            AlbumDao albumDao,
            ArtistDao artistDao,
            ItemDao itemDao,
            AlbumTrackDao albumTracksDao,
            GenreDao genreDao
    ) {
        this.albumDao = albumDao;
        this.artistDao = artistDao;
        this.itemDao = itemDao;
        this.albumTracksDao = albumTracksDao;
        this.genreDao = genreDao;
    }

    @Override
    public List<Album> getAlbums() {
        return albumDao.selectAll();
    }

    @Override
    public List<Artist> getArtists() {
        return artistDao.selectAll();
    }

    @Override
    public List<Item> getItems() {
        return itemDao.selectAll();
    }

    @Override
    public List<AlbumTrack> getAlbumTracks() {
        return albumTracksDao.selectAll();
    }

    @Override
    public AlbumTrack findAlbumTrack(File file) {
        return albumTracksDao.find(file);
    }
}

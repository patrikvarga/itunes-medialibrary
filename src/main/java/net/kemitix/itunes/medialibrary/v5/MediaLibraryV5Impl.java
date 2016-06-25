package net.kemitix.itunes.medialibrary.v5;

import java.io.File;
import java.util.List;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Item;
import net.kemitix.itunes.medialibrary.MediaLibrary;
import net.kemitix.itunes.medialibrary.ReadOnly;
import net.kemitix.itunes.medialibrary.items.BaseLocation;
import net.kemitix.itunes.medialibrary.items.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ReadOnly
@DbVersion5
@Profile("v5/ro")
class MediaLibraryV5Impl implements MediaLibrary {

    protected final AlbumDao albumDao;
    protected final AlbumArtistDao albumArtistDao;
    protected final ItemArtistDao itemArtistDao;
    protected final ItemDao itemDao;
    protected final GenreDao genreDao;
    protected final BaseLocationDao baseLocationDao;
    private final AlbumTrackDao albumTracksDao;

    @Autowired
    public MediaLibraryV5Impl(
            AlbumDao albumDao,
            AlbumArtistDao albumArtistDao,
            ItemArtistDao itemArtistDao,
            ItemDao itemDao,
            AlbumTrackDao albumTracksDao,
            GenreDao genreDao,
            BaseLocationDao baseLocationDao
    ) {
        this.albumDao = albumDao;
        this.albumArtistDao = albumArtistDao;
        this.itemArtistDao = itemArtistDao;
        this.itemDao = itemDao;
        this.albumTracksDao = albumTracksDao;
        this.genreDao = genreDao;
        this.baseLocationDao = baseLocationDao;
    }

    @Override
    public List<Album> getAlbums() {
        return albumDao.selectAll();
    }

    @Override
    public List<Artist> getAlbumArtists() {
        return albumArtistDao.selectAll();
    }

    @Override
    public List<Artist> getArtists() {
        return itemArtistDao.selectAll();
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

    @Override
    public List<Genre> getGenres() {
        return genreDao.selectAll();
    }

    @Override
    public List<BaseLocation> getBaseLocations() {
        return baseLocationDao.selectAll();
    }

}

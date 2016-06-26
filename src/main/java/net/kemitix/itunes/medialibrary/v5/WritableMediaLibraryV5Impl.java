package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Item;
import net.kemitix.itunes.medialibrary.Writable;
import net.kemitix.itunes.medialibrary.WritableMediaLibrary;
import net.kemitix.itunes.medialibrary.items.BaseLocation;
import net.kemitix.itunes.medialibrary.items.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Writable
@DbVersion5
@Profile("v5/rw")
class WritableMediaLibraryV5Impl extends MediaLibraryV5Impl implements WritableMediaLibrary {

    @Autowired
    public WritableMediaLibraryV5Impl(
            AlbumDao albumDao,
            AlbumArtistDao albumArtistDao,
            ItemArtistDao itemArtistDao,
            ItemDao itemDao,
            AlbumTrackDao albumTrackDao,
            GenreDao genreDao,
            BaseLocationDao baseLocationDao
    ) {
        super(albumDao, albumArtistDao, itemArtistDao, itemDao, albumTrackDao, genreDao, baseLocationDao);
    }

    @Override
    public long createAlbum(Album album) {
        return albumDao.insert(album);
    }

    @Override
    public long createArtist(Artist artist) {
        return itemArtistDao.insert(artist);
    }

    @Override
    public long createAlbumArtist(Artist artist) {
        return albumArtistDao.insert(artist);
    }

    @Override
    public long createItem(Item item) {
        return itemDao.insert(item);
    }

    @Override
    public long createGenre(Genre genre) {
        return genreDao.insert(genre);
    }

    @Override
    public long createBaseLocation(BaseLocation baseLocation) {
        return baseLocationDao.insert(baseLocation);
    }

    @Override
    public void updateRepresentativeItemIds(long itemId, long itemArtistId, long albumArtistId, long albumId, long genreId) {
        itemArtistDao.update(itemArtistId, "representative_item_pid", itemId);
        albumArtistDao.update(albumArtistId, "representative_item_pid", itemId);
        albumDao.update(albumId, "representative_item_pid", itemId);
        genreDao.update(genreId, "representative_item_pid", itemId);
    }

}

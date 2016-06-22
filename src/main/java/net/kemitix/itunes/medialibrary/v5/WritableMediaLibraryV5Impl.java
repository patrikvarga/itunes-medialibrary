package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Item;
import net.kemitix.itunes.medialibrary.Writable;
import net.kemitix.itunes.medialibrary.WritableMediaLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Writable
@DbVersion5
@Profile("v5/rw")
class WritableMediaLibraryV5Impl extends MediaLibraryV5Impl implements WritableMediaLibrary {

    @Autowired
    public WritableMediaLibraryV5Impl(AlbumDao albumDao, ArtistDao artistDao, ItemDao itemDao, AlbumTrackDao albumTracksDao) {
        super(albumDao, artistDao, itemDao, albumTracksDao);
    }

    @Override
    public long createAlbum(Album album) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long createArtist(Artist artist) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long createItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

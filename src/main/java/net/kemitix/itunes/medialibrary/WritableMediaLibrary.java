package net.kemitix.itunes.medialibrary;

import net.kemitix.itunes.medialibrary.items.Item;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Album;

public interface WritableMediaLibrary extends MediaLibrary {

    long createAlbum(Album album);

    long createArtist(Artist artist);

    long createItem(Item item);

}
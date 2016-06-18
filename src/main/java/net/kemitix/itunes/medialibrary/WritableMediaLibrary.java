package net.kemitix.itunes.medialibrary;

import java.sql.SQLException;

public interface WritableMediaLibrary extends MediaLibrary {

    long createAlbum(Album album) throws SQLException;

    long createArtist(Artist artist) throws SQLException;

    long createItem(Item item) throws SQLException;

}

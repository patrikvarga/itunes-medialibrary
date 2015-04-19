package net.kemitix.itunes.medialibrary;

import java.sql.SQLException;
import java.util.List;

public interface MediaLibrary {

    List<Album> getAlbums() throws SQLException;

    List<Item> getItems() throws SQLException;

    List<AlbumTracks> getAlbumTracks() throws SQLException;
}

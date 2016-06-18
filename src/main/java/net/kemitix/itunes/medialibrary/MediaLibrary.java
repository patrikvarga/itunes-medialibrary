package net.kemitix.itunes.medialibrary;

import net.kemitix.itunes.medialibrary.items.Item;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Album;
import java.io.File;
import java.sql.SQLException;
import java.util.List;

public interface MediaLibrary {

    List<Album> getAlbums() throws SQLException;

    List<Artist> getArtists() throws SQLException;

    List<Item> getItems() throws SQLException;

    List<AlbumTrack> getAlbumTracks() throws SQLException;

    AlbumTrack findAlbumTrack(File file);
}

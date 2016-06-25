package net.kemitix.itunes.medialibrary;

import net.kemitix.itunes.medialibrary.items.Item;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Album;
import java.io.File;
import java.util.List;
import net.kemitix.itunes.medialibrary.items.BaseLocation;
import net.kemitix.itunes.medialibrary.items.Genre;

public interface MediaLibrary {

    List<Album> getAlbums();

    List<Artist> getAlbumArtists();

    List<Artist> getArtists();

    List<Item> getItems();

    List<AlbumTrack> getAlbumTracks();

    List<Genre> getGenres();

    List<BaseLocation> getBaseLocations();

    AlbumTrack findAlbumTrack(File file);
}

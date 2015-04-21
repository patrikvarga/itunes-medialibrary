package net.kemitix.itunes.medialibrary;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AlbumTracks {

    //album_artist.album_artist,
    private String albumArtist;
    //album.album,
    private String albumTitle;
    //item_extra.title,
    private String trackTitle;
    //item_artist.item_artist,
    private String trackArtist;
    //item_extra.year,
    private int year;
    //item_extra.location,
    private String fileLocation;
    //item.item_pid
    private long id;
}

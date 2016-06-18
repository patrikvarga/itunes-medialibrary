package net.kemitix.itunes.medialibrary;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AlbumTrack {

    //album_artist.album_artist,
    private String albumArtist;
    //album.album,
    private String albumTitle;
    //item_extra.title,
    private String trackTitle;
    //item_artist.item_artist,
    private String trackArtist;
    //item.track_number,
    private int trackNumber;
    //item_extra.year,
    private int year;
    //item_extra.location,
    private String fileLocation;
    //base_location.path,
    private String baseLocation;
    //item.item_pid
    private long id;
}

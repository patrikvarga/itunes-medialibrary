package net.kemitix.itunes.medialibrary;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Item {

    // item_pid
    private long id;
    // media_type
    private int mediaType;
    // title_order
    private int titleOrder;
    // title_order_section
    private int titleOrderSection;
    // item_artist_pid
    private long itemArtistId;
    // item_artist_order
    private int itemArtistOrder;
    // item_artist_order_section
    private int itemArtistOrderSection;
    // series_name_order
    private int seriesNameOrder;
    // series_name_order_section
    private int seriesNameOrderSection;
    // album_pid
    private long albumId;

    private Album album;

    // album_order
    private int albumOrder;
    // album_order_section
    private int albumOrderSection;
    // album_artist_pid
    private long albumArtistId;
    // album_artist_order
    private int albumArtistOrder;
    // album_artist_order_section
    private int albumArtistOrderSection;
    // genre_id
    private long genreId;
    // genre_order
    private int genreOrder;
    // genre_order_section
    private int genreOrderSection;
    // disc_number
    private int discNumber;
    // track_number
    private int trackNumber;
    // episode_sort_id
    private long episodeSortId;
    // base_location_id
    private long baseLocationId;
    // remote_location_id
    private long remoteLocationId;
    // exclude_from_shuffle
    private int excludeFromShuffle;
}

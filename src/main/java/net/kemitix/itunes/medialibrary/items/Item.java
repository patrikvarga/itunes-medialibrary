package net.kemitix.itunes.medialibrary.items;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Item implements Record {

    // item_pid
    private long id;
    // media_type
    private int mediaType = 8;
    // title_order
    private int titleOrder;
    // title_order_section
    private int titleOrderSection;
    // item_artist_pid
    private long itemArtistPid;
    // item_artist_order
    private int itemArtistOrder;
    // item_artist_order_section
    private int itemArtistOrderSection;
    // series_name_order
    private int seriesNameOrder;
    // series_name_order_section
    private int seriesNameOrderSection;
    // album_pid
    private long albumPid;

    private Album album;
    private Artist artist;
    private ItemExtra extra;

    // album_order
    private int albumOrder;
    // album_order_section
    private int albumOrderSection;
    // album_artist_pid
    private long albumArtistPid;
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
    // composer_pid
    private int composerPid;
    // composer_order
    private int composerOrder;
    // composer_order_section
    private int composerOrderSection;
    // keep_local
    private int keepLocal;
    // keep_local_status
    private int keepLocalStatus;
    // in_my_library
    private int inMyLibrary = 1;
    // is_compilation
    private int isCompilation;
    // date_added
    private long dateAdded = new Date().getTime() / 1000;
    // show_composer
    private int showComposer;

    public static Item of(AlbumTrack t, long itemArtistId, long albumArtistId, long albumId, long genreId, long baseLocationId) {
        final Item item = new Item();
        item.setAlbumArtistPid(albumArtistId);
        item.setAlbumArtistOrder(0);
        item.setAlbumArtistOrderSection(0);
        item.setAlbumPid(albumId);
        item.setAlbumOrder(0);
        item.setAlbumOrderSection(0);
        item.setBaseLocationId(baseLocationId);
        item.setDiscNumber(t.getDiscNumber());
        item.setGenreId(genreId);
        item.setGenreOrder(0);
        item.setGenreOrderSection(0);
        item.setItemArtistPid(itemArtistId);
        item.setItemArtistOrder(0);
        item.setItemArtistOrderSection(0);
        item.setMediaType(8); // 8 == mp3
        item.setRemoteLocationId(0);
        item.setSeriesNameOrder(0);
        item.setSeriesNameOrderSection(0);
        item.setTitleOrder(0);
        item.setTitleOrderSection(0);
        item.setTrackNumber(t.getTrackNumber());
        item.setExtra(ItemExtra.of(t));
        return item;
    }

}

package net.kemitix.itunes.medialibrary.items;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Item implements Record {

    private Long itemPid;
    private int mediaType = 8;
    private int titleOrder;
    private int titleOrderSection;
    private long itemArtistPid;
    private int itemArtistOrder;
    private int itemArtistOrderSection;
    private int seriesNameOrder;
    private int seriesNameOrderSection;
    private long albumPid;

    private Album album;
    private Artist artist;
    private ItemExtra extra;
    private ItemSearch search;
    private ItemStore store;
    private ItemPlayback playback;

    private int albumOrder;
    private int albumOrderSection;
    private long albumArtistPid;
    private int albumArtistOrder;
    private int albumArtistOrderSection;
    private long genreId;
    private int genreOrder;
    private int genreOrderSection;
    private int discNumber;
    private int trackNumber;
    private long episodeSortId;
    private long baseLocationId;
    private long remoteLocationId;
    private int excludeFromShuffle;
    private int composerPid;
    private int composerOrder;
    private int composerOrderSection;
    private int keepLocal;
    private int keepLocalStatus;
    private int inMyLibrary = 1;
    private int isCompilation;
    private long dateAdded = new Date().getTime() / 1000;
    private int showComposer;

    @Override
    public Long getId() {
        return getItemPid();
    }

    @Override
    public void setId(Long id) {
        setItemPid(id);
    }

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
        item.setSearch(new ItemSearch());
        item.setStore(new ItemStore());
        item.setPlayback(t.getPlayback());

        return item;
    }

}

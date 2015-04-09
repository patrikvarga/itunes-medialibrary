package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item implements Serializable {

    @Column(name="series_name_order_section",table="item",nullable=false)
    @Basic
    private int seriesNameOrderSection;
    @Column(name="genre_id",table="item",nullable=false)
    @Basic
    private int genreId;
    @Column(name="album_artist_order",table="item",nullable=false)
    @Basic
    private int albumArtistOrder;
    @Column(name="item_artist_order_section",table="item",nullable=false)
    @Basic
    private int itemArtistOrderSection;
    @Column(name="album_pid",table="item",nullable=false)
    @Basic
    private int albumPid;
    @Column(name="composer_pid",table="item",nullable=false)
    @Basic
    private int composerPid;
    @Column(name="disc_number",table="item")
    @Basic
    private Integer discNumber;
    @Column(name="episode_sort_id",table="item")
    @Basic
    private Integer episodeSortId;
    @Column(name="album_order_section",table="item",nullable=false)
    @Basic
    private int albumOrderSection;
    @Column(name="series_name_order",table="item",nullable=false)
    @Basic
    private int seriesNameOrder;
    @Column(name="item_artist_order",table="item",nullable=false)
    @Basic
    private int itemArtistOrder;
    @Column(name="album_artist_pid",table="item",nullable=false)
    @Basic
    private int albumArtistPid;
    @Column(name="item_pid",table="item")
    @Id
    private Integer itemPid;
    @Column(name="item_artist_pid",table="item",nullable=false)
    @Basic
    private int itemArtistPid;
    @Column(name="remote_location_id",table="item",nullable=false)
    @Basic
    private int remoteLocationId;
    @Column(name="composer_order_section",table="item",nullable=false)
    @Basic
    private int composerOrderSection;
    @Column(name="track_number",table="item")
    @Basic
    private Integer trackNumber;
    @Column(name="exclude_from_shuffle",table="item",nullable=false)
    @Basic
    private int excludeFromShuffle;
    @Column(name="media_type",table="item",nullable=false)
    @Basic
    private int mediaType;
    @Column(name="title_order_section",table="item",nullable=false)
    @Basic
    private int titleOrderSection;
    @Column(name="base_location_id",table="item",nullable=false)
    @Basic
    private int baseLocationId;
    @Column(name="album_order",table="item",nullable=false)
    @Basic
    private int albumOrder;
    @Column(name="genre_order_section",table="item",nullable=false)
    @Basic
    private int genreOrderSection;
    @Column(name="genre_order",table="item",nullable=false)
    @Basic
    private int genreOrder;
    @Column(name="album_artist_order_section",table="item",nullable=false)
    @Basic
    private int albumArtistOrderSection;
    @Column(name="title_order",table="item",nullable=false)
    @Basic
    private int titleOrder;
    @Column(name="composer_order",table="item",nullable=false)
    @Basic
    private int composerOrder;

    public Item() {

    }
   
    public int getSeriesNameOrderSection() {
        return this.seriesNameOrderSection;
    }

    public void setSeriesNameOrderSection(int seriesNameOrderSection) {
        this.seriesNameOrderSection = seriesNameOrderSection;
    }
   
    public int getGenreId() {
        return this.genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }
   
    public int getAlbumArtistOrder() {
        return this.albumArtistOrder;
    }

    public void setAlbumArtistOrder(int albumArtistOrder) {
        this.albumArtistOrder = albumArtistOrder;
    }
   
    public int getItemArtistOrderSection() {
        return this.itemArtistOrderSection;
    }

    public void setItemArtistOrderSection(int itemArtistOrderSection) {
        this.itemArtistOrderSection = itemArtistOrderSection;
    }
   
    public int getAlbumPid() {
        return this.albumPid;
    }

    public void setAlbumPid(int albumPid) {
        this.albumPid = albumPid;
    }
   
    public int getComposerPid() {
        return this.composerPid;
    }

    public void setComposerPid(int composerPid) {
        this.composerPid = composerPid;
    }
   
    public Integer getDiscNumber() {
        return this.discNumber;
    }

    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }
   
    public Integer getEpisodeSortId() {
        return this.episodeSortId;
    }

    public void setEpisodeSortId(Integer episodeSortId) {
        this.episodeSortId = episodeSortId;
    }
   
    public int getAlbumOrderSection() {
        return this.albumOrderSection;
    }

    public void setAlbumOrderSection(int albumOrderSection) {
        this.albumOrderSection = albumOrderSection;
    }
   
    public int getSeriesNameOrder() {
        return this.seriesNameOrder;
    }

    public void setSeriesNameOrder(int seriesNameOrder) {
        this.seriesNameOrder = seriesNameOrder;
    }
   
    public int getItemArtistOrder() {
        return this.itemArtistOrder;
    }

    public void setItemArtistOrder(int itemArtistOrder) {
        this.itemArtistOrder = itemArtistOrder;
    }
   
    public int getAlbumArtistPid() {
        return this.albumArtistPid;
    }

    public void setAlbumArtistPid(int albumArtistPid) {
        this.albumArtistPid = albumArtistPid;
    }
   
    public Integer getItemPid() {
        return this.itemPid;
    }

    public void setItemPid(Integer itemPid) {
        this.itemPid = itemPid;
    }
   
    public int getItemArtistPid() {
        return this.itemArtistPid;
    }

    public void setItemArtistPid(int itemArtistPid) {
        this.itemArtistPid = itemArtistPid;
    }
   
    public int getRemoteLocationId() {
        return this.remoteLocationId;
    }

    public void setRemoteLocationId(int remoteLocationId) {
        this.remoteLocationId = remoteLocationId;
    }
   
    public int getComposerOrderSection() {
        return this.composerOrderSection;
    }

    public void setComposerOrderSection(int composerOrderSection) {
        this.composerOrderSection = composerOrderSection;
    }
   
    public Integer getTrackNumber() {
        return this.trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }
   
    public int getExcludeFromShuffle() {
        return this.excludeFromShuffle;
    }

    public void setExcludeFromShuffle(int excludeFromShuffle) {
        this.excludeFromShuffle = excludeFromShuffle;
    }
   
    public int getMediaType() {
        return this.mediaType;
    }

    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }
   
    public int getTitleOrderSection() {
        return this.titleOrderSection;
    }

    public void setTitleOrderSection(int titleOrderSection) {
        this.titleOrderSection = titleOrderSection;
    }
   
    public int getBaseLocationId() {
        return this.baseLocationId;
    }

    public void setBaseLocationId(int baseLocationId) {
        this.baseLocationId = baseLocationId;
    }
   
    public int getAlbumOrder() {
        return this.albumOrder;
    }

    public void setAlbumOrder(int albumOrder) {
        this.albumOrder = albumOrder;
    }
   
    public int getGenreOrderSection() {
        return this.genreOrderSection;
    }

    public void setGenreOrderSection(int genreOrderSection) {
        this.genreOrderSection = genreOrderSection;
    }
   
    public int getGenreOrder() {
        return this.genreOrder;
    }

    public void setGenreOrder(int genreOrder) {
        this.genreOrder = genreOrder;
    }
   
    public int getAlbumArtistOrderSection() {
        return this.albumArtistOrderSection;
    }

    public void setAlbumArtistOrderSection(int albumArtistOrderSection) {
        this.albumArtistOrderSection = albumArtistOrderSection;
    }
   
    public int getTitleOrder() {
        return this.titleOrder;
    }

    public void setTitleOrder(int titleOrder) {
        this.titleOrder = titleOrder;
    }
   
    public int getComposerOrder() {
        return this.composerOrder;
    }

    public void setComposerOrder(int composerOrder) {
        this.composerOrder = composerOrder;
    }
}

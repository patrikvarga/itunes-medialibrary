package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="album")
public class Album implements Serializable {

    @Column(name="artwork_cache_id",table="album",nullable=false)
    @Basic
    private int artworkCacheId;
    @Column(name="feed_url",table="album",length=2000000000)
    @Basic
    private String feedUrl;
    @Column(name="cloud_status",table="album",nullable=false)
    @Basic
    private int cloudStatus;
    @Column(name="album",table="album",nullable=false,length=2000000000)
    @Basic
    private String album;
    @Column(name="season_number",table="album")
    @Basic
    private Integer seasonNumber;
    @Column(name="album_year",table="album",nullable=false)
    @Basic
    private int albumYear;
    @Column(name="album_pid",table="album")
    @Id
    private Integer albumPid;
    @Column(name="sort_album",table="album",length=2000000000)
    @Basic
    private String sortAlbum;
    @Column(name="grouping_key",table="album",length=2000000000)
    @Basic
    private String groupingKey;
    @Column(name="user_rating",table="album",nullable=false)
    @Basic
    private int userRating;
    @Column(name="representative_item_pid",table="album",nullable=false)
    @Basic
    private int representativeItemPid;
    @Column(name="album_artist_pid",table="album",nullable=false)
    @Basic
    private int albumArtistPid;
    @Column(name="all_compilations",table="album",nullable=false)
    @Basic
    private int allCompilations;

    public Album() {

    }
   
    public int getArtworkCacheId() {
        return this.artworkCacheId;
    }

    public void setArtworkCacheId(int artworkCacheId) {
        this.artworkCacheId = artworkCacheId;
    }
   
    public String getFeedUrl() {
        return this.feedUrl;
    }

    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }
   
    public int getCloudStatus() {
        return this.cloudStatus;
    }

    public void setCloudStatus(int cloudStatus) {
        this.cloudStatus = cloudStatus;
    }
   
    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
   
    public Integer getSeasonNumber() {
        return this.seasonNumber;
    }

    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }
   
    public int getAlbumYear() {
        return this.albumYear;
    }

    public void setAlbumYear(int albumYear) {
        this.albumYear = albumYear;
    }
   
    public Integer getAlbumPid() {
        return this.albumPid;
    }

    public void setAlbumPid(Integer albumPid) {
        this.albumPid = albumPid;
    }
   
    public String getSortAlbum() {
        return this.sortAlbum;
    }

    public void setSortAlbum(String sortAlbum) {
        this.sortAlbum = sortAlbum;
    }
   
    public String getGroupingKey() {
        return this.groupingKey;
    }

    public void setGroupingKey(String groupingKey) {
        this.groupingKey = groupingKey;
    }
   
    public int getUserRating() {
        return this.userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }
   
    public int getRepresentativeItemPid() {
        return this.representativeItemPid;
    }

    public void setRepresentativeItemPid(int representativeItemPid) {
        this.representativeItemPid = representativeItemPid;
    }
   
    public int getAlbumArtistPid() {
        return this.albumArtistPid;
    }

    public void setAlbumArtistPid(int albumArtistPid) {
        this.albumArtistPid = albumArtistPid;
    }
   
    public int getAllCompilations() {
        return this.allCompilations;
    }

    public void setAllCompilations(int allCompilations) {
        this.allCompilations = allCompilations;
    }
}

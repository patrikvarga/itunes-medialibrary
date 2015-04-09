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
@Table(name="album_artist")
public class AlbumArtist implements Serializable {

    @Column(name="artwork_cache_id",table="album_artist",nullable=false)
    @Basic
    private int artworkCacheId;
    @Column(name="sort_album_artist",table="album_artist",length=2000000000)
    @Basic
    private String sortAlbumArtist;
    @Column(name="cloud_status",table="album_artist",nullable=false)
    @Basic
    private int cloudStatus;
    @Column(name="representative_item_pid",table="album_artist",nullable=false)
    @Basic
    private int representativeItemPid;
    @Column(name="album_artist",table="album_artist",nullable=false,length=2000000000)
    @Basic
    private String albumArtist;
    @Column(name="album_artist_pid",table="album_artist")
    @Id
    private Integer albumArtistPid;
    @Column(name="artist_artwork_cache_id",table="album_artist",nullable=false,length=2000000000)
    @Basic
    private String artistArtworkCacheId;
    @Column(name="grouping_key",table="album_artist",length=2000000000)
    @Basic
    private String groupingKey;

    public AlbumArtist() {

    }
   
    public int getArtworkCacheId() {
        return this.artworkCacheId;
    }

    public void setArtworkCacheId(int artworkCacheId) {
        this.artworkCacheId = artworkCacheId;
    }
   
    public String getSortAlbumArtist() {
        return this.sortAlbumArtist;
    }

    public void setSortAlbumArtist(String sortAlbumArtist) {
        this.sortAlbumArtist = sortAlbumArtist;
    }
   
    public int getCloudStatus() {
        return this.cloudStatus;
    }

    public void setCloudStatus(int cloudStatus) {
        this.cloudStatus = cloudStatus;
    }
   
    public int getRepresentativeItemPid() {
        return this.representativeItemPid;
    }

    public void setRepresentativeItemPid(int representativeItemPid) {
        this.representativeItemPid = representativeItemPid;
    }
   
    public String getAlbumArtist() {
        return this.albumArtist;
    }

    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }
   
    public Integer getAlbumArtistPid() {
        return this.albumArtistPid;
    }

    public void setAlbumArtistPid(Integer albumArtistPid) {
        this.albumArtistPid = albumArtistPid;
    }
   
    public String getArtistArtworkCacheId() {
        return this.artistArtworkCacheId;
    }

    public void setArtistArtworkCacheId(String artistArtworkCacheId) {
        this.artistArtworkCacheId = artistArtworkCacheId;
    }
   
    public String getGroupingKey() {
        return this.groupingKey;
    }

    public void setGroupingKey(String groupingKey) {
        this.groupingKey = groupingKey;
    }
}

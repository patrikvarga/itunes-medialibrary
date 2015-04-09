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
@Table(name="item_artist")
public class ItemArtist implements Serializable {

    @Column(name="cloud_status",table="item_artist",nullable=false)
    @Basic
    private int cloudStatus;
    @Column(name="sort_series_name",table="item_artist",length=2000000000)
    @Basic
    private String sortSeriesName;
    @Column(name="series_name",table="item_artist",nullable=false,length=2000000000)
    @Basic
    private String seriesName;
    @Column(name="representative_item_pid",table="item_artist",nullable=false)
    @Basic
    private int representativeItemPid;
    @Column(name="artist_artwork_cache_id",table="item_artist",nullable=false,length=2000000000)
    @Basic
    private String artistArtworkCacheId;
    @Column(name="item_artist_pid",table="item_artist")
    @Id
    private Integer itemArtistPid;
    @Column(name="item_artist",table="item_artist",nullable=false,length=2000000000)
    @Basic
    private String itemArtist;
    @Column(name="grouping_key",table="item_artist",length=2000000000)
    @Basic
    private String groupingKey;
    @Column(name="sort_item_artist",table="item_artist",length=2000000000)
    @Basic
    private String sortItemArtist;

    public ItemArtist() {

    }
   
    public int getCloudStatus() {
        return this.cloudStatus;
    }

    public void setCloudStatus(int cloudStatus) {
        this.cloudStatus = cloudStatus;
    }
   
    public String getSortSeriesName() {
        return this.sortSeriesName;
    }

    public void setSortSeriesName(String sortSeriesName) {
        this.sortSeriesName = sortSeriesName;
    }
   
    public String getSeriesName() {
        return this.seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }
   
    public int getRepresentativeItemPid() {
        return this.representativeItemPid;
    }

    public void setRepresentativeItemPid(int representativeItemPid) {
        this.representativeItemPid = representativeItemPid;
    }
   
    public String getArtistArtworkCacheId() {
        return this.artistArtworkCacheId;
    }

    public void setArtistArtworkCacheId(String artistArtworkCacheId) {
        this.artistArtworkCacheId = artistArtworkCacheId;
    }
   
    public Integer getItemArtistPid() {
        return this.itemArtistPid;
    }

    public void setItemArtistPid(Integer itemArtistPid) {
        this.itemArtistPid = itemArtistPid;
    }
   
    public String getItemArtist() {
        return this.itemArtist;
    }

    public void setItemArtist(String itemArtist) {
        this.itemArtist = itemArtist;
    }
   
    public String getGroupingKey() {
        return this.groupingKey;
    }

    public void setGroupingKey(String groupingKey) {
        this.groupingKey = groupingKey;
    }
   
    public String getSortItemArtist() {
        return this.sortItemArtist;
    }

    public void setSortItemArtist(String sortItemArtist) {
        this.sortItemArtist = sortItemArtist;
    }
}

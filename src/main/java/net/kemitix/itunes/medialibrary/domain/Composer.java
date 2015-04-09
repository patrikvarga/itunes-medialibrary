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
@Table(name="composer")
public class Composer implements Serializable {

    @Column(name="sort_composer",table="composer",length=2000000000)
    @Basic
    private String sortComposer;
    @Column(name="artwork_cache_id",table="composer",nullable=false)
    @Basic
    private int artworkCacheId;
    @Column(name="cloud_status",table="composer",nullable=false)
    @Basic
    private int cloudStatus;
    @Column(name="composer",table="composer",nullable=false,length=2000000000)
    @Basic
    private String composer;
    @Column(name="representative_item_pid",table="composer",nullable=false)
    @Basic
    private int representativeItemPid;
    @Column(name="composer_pid",table="composer")
    @Id
    private Integer composerPid;
    @Column(name="grouping_key",table="composer",length=2000000000)
    @Basic
    private String groupingKey;

    public Composer() {

    }
   
    public String getSortComposer() {
        return this.sortComposer;
    }

    public void setSortComposer(String sortComposer) {
        this.sortComposer = sortComposer;
    }
   
    public int getArtworkCacheId() {
        return this.artworkCacheId;
    }

    public void setArtworkCacheId(int artworkCacheId) {
        this.artworkCacheId = artworkCacheId;
    }
   
    public int getCloudStatus() {
        return this.cloudStatus;
    }

    public void setCloudStatus(int cloudStatus) {
        this.cloudStatus = cloudStatus;
    }
   
    public String getComposer() {
        return this.composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }
   
    public int getRepresentativeItemPid() {
        return this.representativeItemPid;
    }

    public void setRepresentativeItemPid(int representativeItemPid) {
        this.representativeItemPid = representativeItemPid;
    }
   
    public Integer getComposerPid() {
        return this.composerPid;
    }

    public void setComposerPid(Integer composerPid) {
        this.composerPid = composerPid;
    }
   
    public String getGroupingKey() {
        return this.groupingKey;
    }

    public void setGroupingKey(String groupingKey) {
        this.groupingKey = groupingKey;
    }
}

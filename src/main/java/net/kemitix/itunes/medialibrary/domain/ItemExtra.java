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
@Table(name="item_extra")
public class ItemExtra implements Serializable {

    @Column(name="copyright",table="item_extra",length=2000000000)
    @Basic
    private String copyright;
    @Column(name="year",table="item_extra")
    @Basic
    private Integer year;
    @Column(name="media_kind",table="item_extra",nullable=false)
    @Basic
    private int mediaKind;
    @Column(name="description",table="item_extra",length=2000000000)
    @Basic
    private String description;
    @Column(name="title",table="item_extra",nullable=false,length=2000000000)
    @Basic
    private String title;
    @Column(name="is_user_disabled",table="item_extra",nullable=false)
    @Basic
    private int isUserDisabled;
    @Column(name="genius_id",table="item_extra",nullable=false)
    @Basic
    private int geniusId;
    @Column(name="screenshot_cache_id",table="item_extra",length=2000000000)
    @Basic
    private String screenshotCacheId;
    @Column(name="track_count",table="item_extra")
    @Basic
    private Integer trackCount;
    @Column(name="integrity",table="item_extra",length=2000000000)
    @Basic
    private String integrity;
    @Column(name="is_compilation",table="item_extra",nullable=false)
    @Basic
    private int isCompilation;
    @Column(name="date_created",table="item_extra",nullable=false)
    @Basic
    private int dateCreated;
    @Column(name="content_rating_level",table="item_extra",nullable=false)
    @Basic
    private int contentRatingLevel;
    @Column(name="item_pid",table="item_extra")
    @Id
    private Integer itemPid;
    @Column(name="bpm",table="item_extra")
    @Basic
    private Integer bpm;
    @Column(name="artwork_cache_id",table="item_extra",nullable=false)
    @Basic
    private int artworkCacheId;
    @Column(name="pending_genius_checksum",table="item_extra",nullable=false)
    @Basic
    private int pendingGeniusChecksum;
    @Column(name="description_long",table="item_extra",length=2000000000)
    @Basic
    private String descriptionLong;
    @Column(name="is_audible_audio_book",table="item_extra",nullable=false)
    @Basic
    private int isAudibleAudioBook;
    @Column(name="date_modified",table="item_extra",nullable=false)
    @Basic
    private int dateModified;
    @Column(name="collection_description",table="item_extra",length=2000000000)
    @Basic
    private String collectionDescription;
    @Column(name="disc_count",table="item_extra")
    @Basic
    private Integer discCount;
    @Column(name="grouping",table="item_extra",length=2000000000)
    @Basic
    private String grouping;
    @Column(name="sort_title",table="item_extra",length=2000000000)
    @Basic
    private String sortTitle;
    @Column(name="file_size",table="item_extra",nullable=false)
    @Basic
    private int fileSize;
    @Column(name="total_time_ms",table="item_extra",nullable=false)
    @Basic
    private double totalTimeMs;
    @Column(name="location",table="item_extra",nullable=false,length=2000000000)
    @Basic
    private String location;
    @Column(name="content_rating",table="item_extra",nullable=false)
    @Basic
    private int contentRating;
    @Column(name="comment",table="item_extra",length=2000000000)
    @Basic
    private String comment;
    @Column(name="category_id",table="item_extra")
    @Basic
    private Integer categoryId;
    @Column(name="location_kind_id",table="item_extra",nullable=false)
    @Basic
    private int locationKindId;

    public ItemExtra() {

    }
   
    public String getCopyright() {
        return this.copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
   
    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
   
    public int getMediaKind() {
        return this.mediaKind;
    }

    public void setMediaKind(int mediaKind) {
        this.mediaKind = mediaKind;
    }
   
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
   
    public int getIsUserDisabled() {
        return this.isUserDisabled;
    }

    public void setIsUserDisabled(int isUserDisabled) {
        this.isUserDisabled = isUserDisabled;
    }
   
    public int getGeniusId() {
        return this.geniusId;
    }

    public void setGeniusId(int geniusId) {
        this.geniusId = geniusId;
    }
   
    public String getScreenshotCacheId() {
        return this.screenshotCacheId;
    }

    public void setScreenshotCacheId(String screenshotCacheId) {
        this.screenshotCacheId = screenshotCacheId;
    }
   
    public Integer getTrackCount() {
        return this.trackCount;
    }

    public void setTrackCount(Integer trackCount) {
        this.trackCount = trackCount;
    }
   
    public String getIntegrity() {
        return this.integrity;
    }

    public void setIntegrity(String integrity) {
        this.integrity = integrity;
    }
   
    public int getIsCompilation() {
        return this.isCompilation;
    }

    public void setIsCompilation(int isCompilation) {
        this.isCompilation = isCompilation;
    }
   
    public int getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }
   
    public int getContentRatingLevel() {
        return this.contentRatingLevel;
    }

    public void setContentRatingLevel(int contentRatingLevel) {
        this.contentRatingLevel = contentRatingLevel;
    }
   
    public Integer getItemPid() {
        return this.itemPid;
    }

    public void setItemPid(Integer itemPid) {
        this.itemPid = itemPid;
    }
   
    public Integer getBpm() {
        return this.bpm;
    }

    public void setBpm(Integer bpm) {
        this.bpm = bpm;
    }
   
    public int getArtworkCacheId() {
        return this.artworkCacheId;
    }

    public void setArtworkCacheId(int artworkCacheId) {
        this.artworkCacheId = artworkCacheId;
    }
   
    public int getPendingGeniusChecksum() {
        return this.pendingGeniusChecksum;
    }

    public void setPendingGeniusChecksum(int pendingGeniusChecksum) {
        this.pendingGeniusChecksum = pendingGeniusChecksum;
    }
   
    public String getDescriptionLong() {
        return this.descriptionLong;
    }

    public void setDescriptionLong(String descriptionLong) {
        this.descriptionLong = descriptionLong;
    }
   
    public int getIsAudibleAudioBook() {
        return this.isAudibleAudioBook;
    }

    public void setIsAudibleAudioBook(int isAudibleAudioBook) {
        this.isAudibleAudioBook = isAudibleAudioBook;
    }
   
    public int getDateModified() {
        return this.dateModified;
    }

    public void setDateModified(int dateModified) {
        this.dateModified = dateModified;
    }
   
    public String getCollectionDescription() {
        return this.collectionDescription;
    }

    public void setCollectionDescription(String collectionDescription) {
        this.collectionDescription = collectionDescription;
    }
   
    public Integer getDiscCount() {
        return this.discCount;
    }

    public void setDiscCount(Integer discCount) {
        this.discCount = discCount;
    }
   
    public String getGrouping() {
        return this.grouping;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping;
    }
   
    public String getSortTitle() {
        return this.sortTitle;
    }

    public void setSortTitle(String sortTitle) {
        this.sortTitle = sortTitle;
    }
   
    public int getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
   
    public double getTotalTimeMs() {
        return this.totalTimeMs;
    }

    public void setTotalTimeMs(double totalTimeMs) {
        this.totalTimeMs = totalTimeMs;
    }
   
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
   
    public int getContentRating() {
        return this.contentRating;
    }

    public void setContentRating(int contentRating) {
        this.contentRating = contentRating;
    }
   
    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
   
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
   
    public int getLocationKindId() {
        return this.locationKindId;
    }

    public void setLocationKindId(int locationKindId) {
        this.locationKindId = locationKindId;
    }
}

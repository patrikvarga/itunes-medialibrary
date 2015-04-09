package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_stats")
public class ItemStats implements Serializable {

    @Column(name="play_count_user",table="item_stats")
    @Basic
    private Integer playCountUser;
    @Column(name="has_been_played",table="item_stats")
    @Basic
    private Integer hasBeenPlayed;
    @Column(name="hidden",table="item_stats")
    @Basic
    private Integer hidden;
    @Column(name="remember_bookmark",table="item_stats",nullable=false)
    @Basic
    private int rememberBookmark;
    @Column(name="download_identifier",table="item_stats",length=2000000000)
    @Basic
    private String downloadIdentifier;
    @Column(name="date_accessed",table="item_stats")
    @Basic
    private Integer dateAccessed;
    @Column(name="user_rating",table="item_stats")
    @Basic
    private Integer userRating;
    @Column(name="chosen_by_auto_fill",table="item_stats",nullable=false)
    @Basic
    private int chosenByAutoFill;
    @Column(name="play_count_recent",table="item_stats")
    @Basic
    private Integer playCountRecent;
    @Column(name="bookmark_time_ms",table="item_stats",scale=10,precision=2000000000)
    @Basic
    private Double bookmarkTimeMs;
    @Column(name="skip_count_user",table="item_stats")
    @Basic
    private Integer skipCountUser;
    @Column(name="is_alarm",table="item_stats",nullable=false)
    @Basic
    private int isAlarm;
    @Column(name="date_skipped",table="item_stats")
    @Basic
    private Integer dateSkipped;
    @Column(name="skip_count_recent",table="item_stats")
    @Basic
    private Integer skipCountRecent;
    @Column(name="item_pid",table="item_stats")
    @Id
    private Integer itemPid;
    @Column(name="needs_restore",table="item_stats",nullable=false)
    @Basic
    private int needsRestore;
    @Column(name="date_played",table="item_stats")
    @Basic
    private Integer datePlayed;

    public ItemStats() {

    }
   
    public Integer getPlayCountUser() {
        return this.playCountUser;
    }

    public void setPlayCountUser(Integer playCountUser) {
        this.playCountUser = playCountUser;
    }
   
    public Integer getHasBeenPlayed() {
        return this.hasBeenPlayed;
    }

    public void setHasBeenPlayed(Integer hasBeenPlayed) {
        this.hasBeenPlayed = hasBeenPlayed;
    }
   
    public Integer getHidden() {
        return this.hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }
   
    public int getRememberBookmark() {
        return this.rememberBookmark;
    }

    public void setRememberBookmark(int rememberBookmark) {
        this.rememberBookmark = rememberBookmark;
    }
   
    public String getDownloadIdentifier() {
        return this.downloadIdentifier;
    }

    public void setDownloadIdentifier(String downloadIdentifier) {
        this.downloadIdentifier = downloadIdentifier;
    }
   
    public Integer getDateAccessed() {
        return this.dateAccessed;
    }

    public void setDateAccessed(Integer dateAccessed) {
        this.dateAccessed = dateAccessed;
    }
   
    public Integer getUserRating() {
        return this.userRating;
    }

    public void setUserRating(Integer userRating) {
        this.userRating = userRating;
    }
   
    public int getChosenByAutoFill() {
        return this.chosenByAutoFill;
    }

    public void setChosenByAutoFill(int chosenByAutoFill) {
        this.chosenByAutoFill = chosenByAutoFill;
    }
   
    public Integer getPlayCountRecent() {
        return this.playCountRecent;
    }

    public void setPlayCountRecent(Integer playCountRecent) {
        this.playCountRecent = playCountRecent;
    }
   
    public Double getBookmarkTimeMs() {
        return this.bookmarkTimeMs;
    }

    public void setBookmarkTimeMs(Double bookmarkTimeMs) {
        this.bookmarkTimeMs = bookmarkTimeMs;
    }
   
    public Integer getSkipCountUser() {
        return this.skipCountUser;
    }

    public void setSkipCountUser(Integer skipCountUser) {
        this.skipCountUser = skipCountUser;
    }
   
    public int getIsAlarm() {
        return this.isAlarm;
    }

    public void setIsAlarm(int isAlarm) {
        this.isAlarm = isAlarm;
    }
   
    public Integer getDateSkipped() {
        return this.dateSkipped;
    }

    public void setDateSkipped(Integer dateSkipped) {
        this.dateSkipped = dateSkipped;
    }
   
    public Integer getSkipCountRecent() {
        return this.skipCountRecent;
    }

    public void setSkipCountRecent(Integer skipCountRecent) {
        this.skipCountRecent = skipCountRecent;
    }
   
    public Integer getItemPid() {
        return this.itemPid;
    }

    public void setItemPid(Integer itemPid) {
        this.itemPid = itemPid;
    }
   
    public int getNeedsRestore() {
        return this.needsRestore;
    }

    public void setNeedsRestore(int needsRestore) {
        this.needsRestore = needsRestore;
    }
   
    public Integer getDatePlayed() {
        return this.datePlayed;
    }

    public void setDatePlayed(Integer datePlayed) {
        this.datePlayed = datePlayed;
    }
}

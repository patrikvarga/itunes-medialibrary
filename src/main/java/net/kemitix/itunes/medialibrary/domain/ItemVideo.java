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
@Table(name="item_video")
public class ItemVideo implements Serializable {

    @Column(name="audio_track_id",table="item_video",nullable=false)
    @Basic
    private int audioTrackId;
    @Column(name="rental_duration",table="item_video",nullable=false)
    @Basic
    private int rentalDuration;
    @Column(name="network_name",table="item_video",nullable=false,length=2000000000)
    @Basic
    private String networkName;
    @Column(name="rental_playback_duration",table="item_video",nullable=false)
    @Basic
    private int rentalPlaybackDuration;
    @Column(name="audio_language",table="item_video",nullable=false)
    @Basic
    private int audioLanguage;
    @Column(name="subtitle_language",table="item_video",nullable=false)
    @Basic
    private int subtitleLanguage;
    @Column(name="season_number",table="item_video",nullable=false)
    @Basic
    private int seasonNumber;
    @Column(name="episode_id",table="item_video",nullable=false,length=2000000000)
    @Basic
    private String episodeId;
    @Column(name="audio_track_index",table="item_video",nullable=false)
    @Basic
    private int audioTrackIndex;
    @Column(name="is_demo",table="item_video",nullable=false)
    @Basic
    private int isDemo;
    @Column(name="video_quality",table="item_video",nullable=false)
    @Basic
    private int videoQuality;
    @Column(name="rental_date_started",table="item_video",nullable=false)
    @Basic
    private int rentalDateStarted;
    @Column(name="extended_content_rating",table="item_video",nullable=false,length=2000000000)
    @Basic
    private String extendedContentRating;
    @Column(name="subtitle_track_index",table="item_video",nullable=false)
    @Basic
    private int subtitleTrackIndex;
    @Column(name="rental_playback_date_started",table="item_video",nullable=false)
    @Basic
    private int rentalPlaybackDateStarted;
    @Column(name="is_rental",table="item_video",nullable=false)
    @Basic
    private int isRental;
    @Column(name="item_pid",table="item_video")
    @Id
    private Integer itemPid;
    @Column(name="has_alternate_audio",table="item_video",nullable=false)
    @Basic
    private int hasAlternateAudio;
    @Column(name="has_subtitles",table="item_video",nullable=false)
    @Basic
    private int hasSubtitles;
    @Column(name="movie_info",table="item_video",nullable=false,length=2000000000)
    @Basic
    private String movieInfo;
    @Column(name="has_chapter_data",table="item_video",nullable=false)
    @Basic
    private int hasChapterData;

    public ItemVideo() {

    }
   
    public int getAudioTrackId() {
        return this.audioTrackId;
    }

    public void setAudioTrackId(int audioTrackId) {
        this.audioTrackId = audioTrackId;
    }
   
    public int getRentalDuration() {
        return this.rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }
   
    public String getNetworkName() {
        return this.networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
   
    public int getRentalPlaybackDuration() {
        return this.rentalPlaybackDuration;
    }

    public void setRentalPlaybackDuration(int rentalPlaybackDuration) {
        this.rentalPlaybackDuration = rentalPlaybackDuration;
    }
   
    public int getAudioLanguage() {
        return this.audioLanguage;
    }

    public void setAudioLanguage(int audioLanguage) {
        this.audioLanguage = audioLanguage;
    }
   
    public int getSubtitleLanguage() {
        return this.subtitleLanguage;
    }

    public void setSubtitleLanguage(int subtitleLanguage) {
        this.subtitleLanguage = subtitleLanguage;
    }
   
    public int getSeasonNumber() {
        return this.seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }
   
    public String getEpisodeId() {
        return this.episodeId;
    }

    public void setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
    }
   
    public int getAudioTrackIndex() {
        return this.audioTrackIndex;
    }

    public void setAudioTrackIndex(int audioTrackIndex) {
        this.audioTrackIndex = audioTrackIndex;
    }
   
    public int getIsDemo() {
        return this.isDemo;
    }

    public void setIsDemo(int isDemo) {
        this.isDemo = isDemo;
    }
   
    public int getVideoQuality() {
        return this.videoQuality;
    }

    public void setVideoQuality(int videoQuality) {
        this.videoQuality = videoQuality;
    }
   
    public int getRentalDateStarted() {
        return this.rentalDateStarted;
    }

    public void setRentalDateStarted(int rentalDateStarted) {
        this.rentalDateStarted = rentalDateStarted;
    }
   
    public String getExtendedContentRating() {
        return this.extendedContentRating;
    }

    public void setExtendedContentRating(String extendedContentRating) {
        this.extendedContentRating = extendedContentRating;
    }
   
    public int getSubtitleTrackIndex() {
        return this.subtitleTrackIndex;
    }

    public void setSubtitleTrackIndex(int subtitleTrackIndex) {
        this.subtitleTrackIndex = subtitleTrackIndex;
    }
   
    public int getRentalPlaybackDateStarted() {
        return this.rentalPlaybackDateStarted;
    }

    public void setRentalPlaybackDateStarted(int rentalPlaybackDateStarted) {
        this.rentalPlaybackDateStarted = rentalPlaybackDateStarted;
    }
   
    public int getIsRental() {
        return this.isRental;
    }

    public void setIsRental(int isRental) {
        this.isRental = isRental;
    }
   
    public Integer getItemPid() {
        return this.itemPid;
    }

    public void setItemPid(Integer itemPid) {
        this.itemPid = itemPid;
    }
   
    public int getHasAlternateAudio() {
        return this.hasAlternateAudio;
    }

    public void setHasAlternateAudio(int hasAlternateAudio) {
        this.hasAlternateAudio = hasAlternateAudio;
    }
   
    public int getHasSubtitles() {
        return this.hasSubtitles;
    }

    public void setHasSubtitles(int hasSubtitles) {
        this.hasSubtitles = hasSubtitles;
    }
   
    public String getMovieInfo() {
        return this.movieInfo;
    }

    public void setMovieInfo(String movieInfo) {
        this.movieInfo = movieInfo;
    }
   
    public int getHasChapterData() {
        return this.hasChapterData;
    }

    public void setHasChapterData(int hasChapterData) {
        this.hasChapterData = hasChapterData;
    }
}

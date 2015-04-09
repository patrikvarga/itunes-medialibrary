package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "item_video")
public class ItemVideo implements Serializable {

    @Column(name = "audio_track_id", table = "item_video", nullable = false)
    @Basic
    private int audioTrackId;

    @Column(name = "rental_duration", table = "item_video", nullable = false)
    @Basic
    private int rentalDuration;

    @Column(name = "network_name", table = "item_video", nullable = false, length = 2000000000)
    @Basic
    private String networkName;

    @Column(name = "rental_playback_duration", table = "item_video", nullable = false)
    @Basic
    private int rentalPlaybackDuration;

    @Column(name = "audio_language", table = "item_video", nullable = false)
    @Basic
    private int audioLanguage;

    @Column(name = "subtitle_language", table = "item_video", nullable = false)
    @Basic
    private int subtitleLanguage;

    @Column(name = "season_number", table = "item_video", nullable = false)
    @Basic
    private int seasonNumber;

    @Column(name = "episode_id", table = "item_video", nullable = false, length = 2000000000)
    @Basic
    private String episodeId;

    @Column(name = "audio_track_index", table = "item_video", nullable = false)
    @Basic
    private int audioTrackIndex;

    @Column(name = "is_demo", table = "item_video", nullable = false)
    @Basic
    private int isDemo;

    @Column(name = "video_quality", table = "item_video", nullable = false)
    @Basic
    private int videoQuality;

    @Column(name = "rental_date_started", table = "item_video", nullable = false)
    @Basic
    private int rentalDateStarted;

    @Column(name = "extended_content_rating", table = "item_video", nullable = false, length = 2000000000)
    @Basic
    private String extendedContentRating;

    @Column(name = "subtitle_track_index", table = "item_video", nullable = false)
    @Basic
    private int subtitleTrackIndex;

    @Column(name = "rental_playback_date_started", table = "item_video", nullable = false)
    @Basic
    private int rentalPlaybackDateStarted;

    @Column(name = "is_rental", table = "item_video", nullable = false)
    @Basic
    private int isRental;

    @Column(name = "item_pid", table = "item_video")
    @Id
    private Integer itemPid;

    @Column(name = "has_alternate_audio", table = "item_video", nullable = false)
    @Basic
    private int hasAlternateAudio;

    @Column(name = "has_subtitles", table = "item_video", nullable = false)
    @Basic
    private int hasSubtitles;

    @Column(name = "movie_info", table = "item_video", nullable = false, length = 2000000000)
    @Basic
    private String movieInfo;

    @Column(name = "has_chapter_data", table = "item_video", nullable = false)
    @Basic
    private int hasChapterData;

}

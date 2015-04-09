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
@Table(name = "item_stats")
public class ItemStats implements Serializable {

    @Column(name = "play_count_user", table = "item_stats")
    @Basic
    private Integer playCountUser;

    @Column(name = "has_been_played", table = "item_stats")
    @Basic
    private Integer hasBeenPlayed;

    @Column(name = "hidden", table = "item_stats")
    @Basic
    private Integer hidden;

    @Column(name = "remember_bookmark", table = "item_stats", nullable = false)
    @Basic
    private int rememberBookmark;

    @Column(name = "download_identifier", table = "item_stats", length = 2000000000)
    @Basic
    private String downloadIdentifier;

    @Column(name = "date_accessed", table = "item_stats")
    @Basic
    private Integer dateAccessed;

    @Column(name = "user_rating", table = "item_stats")
    @Basic
    private Integer userRating;

    @Column(name = "chosen_by_auto_fill", table = "item_stats", nullable = false)
    @Basic
    private int chosenByAutoFill;

    @Column(name = "play_count_recent", table = "item_stats")
    @Basic
    private Integer playCountRecent;

    @Column(name = "bookmark_time_ms", table = "item_stats", scale = 10, precision = 2000000000)
    @Basic
    private Double bookmarkTimeMs;

    @Column(name = "skip_count_user", table = "item_stats")
    @Basic
    private Integer skipCountUser;

    @Column(name = "is_alarm", table = "item_stats", nullable = false)
    @Basic
    private int isAlarm;

    @Column(name = "date_skipped", table = "item_stats")
    @Basic
    private Integer dateSkipped;

    @Column(name = "skip_count_recent", table = "item_stats")
    @Basic
    private Integer skipCountRecent;

    @Column(name = "item_pid", table = "item_stats")
    @Id
    private Integer itemPid;

    @Column(name = "needs_restore", table = "item_stats", nullable = false)
    @Basic
    private int needsRestore;

    @Column(name = "date_played", table = "item_stats")
    @Basic
    private Integer datePlayed;

}

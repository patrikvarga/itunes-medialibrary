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
@Table(name = "album")
public class Album implements Serializable {

    @Column(name = "artwork_cache_id", table = "album", nullable = false)
    @Basic
    private int artworkCacheId;

    @Column(name = "feed_url", table = "album", length = 2000000000)
    @Basic
    private String feedUrl;

    @Column(name = "cloud_status", table = "album", nullable = false)
    @Basic
    private int cloudStatus;

    @Column(name = "album", table = "album", nullable = false, length = 2000000000)
    @Basic
    private String album;

    @Column(name = "season_number", table = "album")
    @Basic
    private Integer seasonNumber;

    @Column(name = "album_year", table = "album", nullable = false)
    @Basic
    private int albumYear;

    @Column(name = "album_pid", table = "album")
    @Id
    private Integer albumPid;

    @Column(name = "sort_album", table = "album", length = 2000000000)
    @Basic
    private String sortAlbum;

    @Column(name = "grouping_key", table = "album", length = 2000000000)
    @Basic
    private String groupingKey;

    @Column(name = "user_rating", table = "album", nullable = false)
    @Basic
    private int userRating;

    @Column(name = "representative_item_pid", table = "album", nullable = false)
    @Basic
    private int representativeItemPid;

    @Column(name = "album_artist_pid", table = "album", nullable = false)
    @Basic
    private int albumArtistPid;

    @Column(name = "all_compilations", table = "album", nullable = false)
    @Basic
    private int allCompilations;

}

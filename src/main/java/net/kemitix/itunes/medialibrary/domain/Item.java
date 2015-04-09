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
@Table(name = "item")
public class Item implements Serializable {

    @Column(name = "series_name_order_section", table = "item", nullable = false)
    @Basic
    private int seriesNameOrderSection;

    @Column(name = "genre_id", table = "item", nullable = false)
    @Basic
    private int genreId;

    @Column(name = "album_artist_order", table = "item", nullable = false)
    @Basic
    private int albumArtistOrder;

    @Column(name = "item_artist_order_section", table = "item", nullable = false)
    @Basic
    private int itemArtistOrderSection;

    @Column(name = "album_pid", table = "item", nullable = false)
    @Basic
    private int albumPid;

    @Column(name = "composer_pid", table = "item", nullable = false)
    @Basic
    private int composerPid;

    @Column(name = "disc_number", table = "item")
    @Basic
    private Integer discNumber;

    @Column(name = "episode_sort_id", table = "item")
    @Basic
    private Integer episodeSortId;

    @Column(name = "album_order_section", table = "item", nullable = false)
    @Basic
    private int albumOrderSection;

    @Column(name = "series_name_order", table = "item", nullable = false)
    @Basic
    private int seriesNameOrder;

    @Column(name = "item_artist_order", table = "item", nullable = false)
    @Basic
    private int itemArtistOrder;

    @Column(name = "album_artist_pid", table = "item", nullable = false)
    @Basic
    private int albumArtistPid;

    @Column(name = "item_pid", table = "item")
    @Id
    private Integer itemPid;

    @Column(name = "item_artist_pid", table = "item", nullable = false)
    @Basic
    private int itemArtistPid;

    @Column(name = "remote_location_id", table = "item", nullable = false)
    @Basic
    private int remoteLocationId;

    @Column(name = "composer_order_section", table = "item", nullable = false)
    @Basic
    private int composerOrderSection;

    @Column(name = "track_number", table = "item")
    @Basic
    private Integer trackNumber;

    @Column(name = "exclude_from_shuffle", table = "item", nullable = false)
    @Basic
    private int excludeFromShuffle;

    @Column(name = "media_type", table = "item", nullable = false)
    @Basic
    private int mediaType;

    @Column(name = "title_order_section", table = "item", nullable = false)
    @Basic
    private int titleOrderSection;

    @Column(name = "base_location_id", table = "item", nullable = false)
    @Basic
    private int baseLocationId;

    @Column(name = "album_order", table = "item", nullable = false)
    @Basic
    private int albumOrder;

    @Column(name = "genre_order_section", table = "item", nullable = false)
    @Basic
    private int genreOrderSection;

    @Column(name = "genre_order", table = "item", nullable = false)
    @Basic
    private int genreOrder;

    @Column(name = "album_artist_order_section", table = "item", nullable = false)
    @Basic
    private int albumArtistOrderSection;

    @Column(name = "title_order", table = "item", nullable = false)
    @Basic
    private int titleOrder;

    @Column(name = "composer_order", table = "item", nullable = false)
    @Basic
    private int composerOrder;

}

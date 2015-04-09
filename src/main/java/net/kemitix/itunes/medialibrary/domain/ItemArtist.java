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
@Table(name = "item_artist")
public class ItemArtist implements Serializable {

    @Column(name = "cloud_status", table = "item_artist", nullable = false)
    @Basic
    private int cloudStatus;

    @Column(name = "sort_series_name", table = "item_artist", length = 2000000000)
    @Basic
    private String sortSeriesName;

    @Column(name = "series_name", table = "item_artist", nullable = false, length = 2000000000)
    @Basic
    private String seriesName;

    @Column(name = "representative_item_pid", table = "item_artist", nullable = false)
    @Basic
    private int representativeItemPid;

    @Column(name = "artist_artwork_cache_id", table = "item_artist", nullable = false, length = 2000000000)
    @Basic
    private String artistArtworkCacheId;

    @Column(name = "item_artist_pid", table = "item_artist")
    @Id
    private Integer itemArtistPid;

    @Column(name = "item_artist", table = "item_artist", nullable = false, length = 2000000000)
    @Basic
    private String itemArtist;

    @Column(name = "grouping_key", table = "item_artist", length = 2000000000)
    @Basic
    private String groupingKey;

    @Column(name = "sort_item_artist", table = "item_artist", length = 2000000000)
    @Basic
    private String sortItemArtist;

}

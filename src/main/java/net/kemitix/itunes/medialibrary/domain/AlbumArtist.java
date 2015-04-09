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
@Table(name = "album_artist")
public class AlbumArtist implements Serializable {

    @Column(name = "artwork_cache_id", table = "album_artist", nullable = false)
    @Basic
    private int artworkCacheId;

    @Column(name = "sort_album_artist", table = "album_artist", length = 2000000000)
    @Basic
    private String sortAlbumArtist;

    @Column(name = "cloud_status", table = "album_artist", nullable = false)
    @Basic
    private int cloudStatus;

    @Column(name = "representative_item_pid", table = "album_artist", nullable = false)
    @Basic
    private int representativeItemPid;

    @Column(name = "album_artist", table = "album_artist", nullable = false, length = 2000000000)
    @Basic
    private String albumArtist;

    @Column(name = "album_artist_pid", table = "album_artist")
    @Id
    private Integer albumArtistPid;

    @Column(name = "artist_artwork_cache_id", table = "album_artist", nullable = false, length = 2000000000)
    @Basic
    private String artistArtworkCacheId;

    @Column(name = "grouping_key", table = "album_artist", length = 2000000000)
    @Basic
    private String groupingKey;

}

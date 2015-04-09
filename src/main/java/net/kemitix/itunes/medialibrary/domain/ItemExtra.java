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
@Table(name = "item_extra")
public class ItemExtra implements Serializable {

    @Column(name = "copyright", table = "item_extra", length = 2000000000)
    @Basic
    private String copyright;

    @Column(name = "year", table = "item_extra")
    @Basic
    private Integer year;

    @Column(name = "media_kind", table = "item_extra", nullable = false)
    @Basic
    private int mediaKind;

    @Column(name = "description", table = "item_extra", length = 2000000000)
    @Basic
    private String description;

    @Column(name = "title", table = "item_extra", nullable = false, length = 2000000000)
    @Basic
    private String title;

    @Column(name = "is_user_disabled", table = "item_extra", nullable = false)
    @Basic
    private int isUserDisabled;

    @Column(name = "genius_id", table = "item_extra", nullable = false)
    @Basic
    private int geniusId;

    @Column(name = "screenshot_cache_id", table = "item_extra", length = 2000000000)
    @Basic
    private String screenshotCacheId;

    @Column(name = "track_count", table = "item_extra")
    @Basic
    private Integer trackCount;

    @Column(name = "integrity", table = "item_extra", length = 2000000000)
    @Basic
    private String integrity;

    @Column(name = "is_compilation", table = "item_extra", nullable = false)
    @Basic
    private int isCompilation;

    @Column(name = "date_created", table = "item_extra", nullable = false)
    @Basic
    private int dateCreated;

    @Column(name = "content_rating_level", table = "item_extra", nullable = false)
    @Basic
    private int contentRatingLevel;

    @Column(name = "item_pid", table = "item_extra")
    @Id
    private Integer itemPid;

    @Column(name = "bpm", table = "item_extra")
    @Basic
    private Integer bpm;

    @Column(name = "artwork_cache_id", table = "item_extra", nullable = false)
    @Basic
    private int artworkCacheId;

    @Column(name = "pending_genius_checksum", table = "item_extra", nullable = false)
    @Basic
    private int pendingGeniusChecksum;

    @Column(name = "description_long", table = "item_extra", length = 2000000000)
    @Basic
    private String descriptionLong;

    @Column(name = "is_audible_audio_book", table = "item_extra", nullable = false)
    @Basic
    private int isAudibleAudioBook;

    @Column(name = "date_modified", table = "item_extra", nullable = false)
    @Basic
    private int dateModified;

    @Column(name = "collection_description", table = "item_extra", length = 2000000000)
    @Basic
    private String collectionDescription;

    @Column(name = "disc_count", table = "item_extra")
    @Basic
    private Integer discCount;

    @Column(name = "grouping", table = "item_extra", length = 2000000000)
    @Basic
    private String grouping;

    @Column(name = "sort_title", table = "item_extra", length = 2000000000)
    @Basic
    private String sortTitle;

    @Column(name = "file_size", table = "item_extra", nullable = false)
    @Basic
    private int fileSize;

    @Column(name = "total_time_ms", table = "item_extra", nullable = false)
    @Basic
    private double totalTimeMs;

    @Column(name = "location", table = "item_extra", nullable = false, length = 2000000000)
    @Basic
    private String location;

    @Column(name = "content_rating", table = "item_extra", nullable = false)
    @Basic
    private int contentRating;

    @Column(name = "comment", table = "item_extra", length = 2000000000)
    @Basic
    private String comment;

    @Column(name = "category_id", table = "item_extra")
    @Basic
    private Integer categoryId;

    @Column(name = "location_kind_id", table = "item_extra", nullable = false)
    @Basic
    private int locationKindId;

}

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
@Table(name = "composer")
public class Composer implements Serializable {

    @Column(name = "sort_composer", table = "composer", length = 2000000000)
    @Basic
    private String sortComposer;

    @Column(name = "artwork_cache_id", table = "composer", nullable = false)
    @Basic
    private int artworkCacheId;

    @Column(name = "cloud_status", table = "composer", nullable = false)
    @Basic
    private int cloudStatus;

    @Column(name = "composer", table = "composer", nullable = false, length = 2000000000)
    @Basic
    private String composer;

    @Column(name = "representative_item_pid", table = "composer", nullable = false)
    @Basic
    private int representativeItemPid;

    @Column(name = "composer_pid", table = "composer")
    @Id
    private Integer composerPid;

    @Column(name = "grouping_key", table = "composer", length = 2000000000)
    @Basic
    private String groupingKey;

}

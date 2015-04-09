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
@Table(name = "container")
public class Container implements Serializable {

    @Column(name = "smart_is_genius", table = "container", nullable = false)
    @Basic
    private int smartIsGenius;

    @Column(name = "repeat_mode", table = "container", nullable = false)
    @Basic
    private int repeatMode;

    @Column(name = "description", table = "container", length = 2000000000)
    @Basic
    private String description;

    @Column(name = "is_ignorable_itunes_playlist", table = "container")
    @Basic
    private Integer isIgnorableItunesPlaylist;

    @Column(name = "smart_enabled_only", table = "container", nullable = false)
    @Basic
    private int smartEnabledOnly;

    @Column(name = "smart_is_dynamic", table = "container", nullable = false)
    @Basic
    private int smartIsDynamic;

    @Column(name = "play_order", table = "container", nullable = false)
    @Basic
    private int playOrder;

    @Column(name = "is_saveable", table = "container", nullable = false)
    @Basic
    private int isSaveable;

    @Column(name = "date_created", table = "container", nullable = false)
    @Basic
    private int dateCreated;

    @Column(name = "filepath", table = "container", nullable = false, length = 2000000000)
    @Basic
    private String filepath;

    @Column(name = "orig_date_modified", table = "container", nullable = false)
    @Basic
    private int origDateModified;

    @Column(name = "media_kinds", table = "container", nullable = false)
    @Basic
    private int mediaKinds;

    @Column(name = "smart_criteria", table = "container", length = 2000000000)
    @Basic
    private String smartCriteria;

    @Column(name = "distinguished_kind", table = "container", nullable = false)
    @Basic
    private int distinguishedKind;

    @Column(name = "is_ignored_syncing", table = "container", nullable = false)
    @Basic
    private int isIgnoredSyncing;

    @Column(name = "smart_is_folder", table = "container", nullable = false)
    @Basic
    private int smartIsFolder;

    @Column(name = "is_container_type_active_target", table = "container", nullable = false)
    @Basic
    private int isContainerTypeActiveTarget;

    @Column(name = "smart_is_filtered", table = "container", nullable = false)
    @Basic
    private int smartIsFiltered;

    @Column(name = "smart_limit_kind", table = "container", nullable = false)
    @Basic
    private int smartLimitKind;

    @Column(name = "container_type", table = "container", nullable = false)
    @Basic
    private int containerType;

    @Column(name = "parent_pid", table = "container", nullable = false)
    @Basic
    private int parentPid;

    @Column(name = "date_modified", table = "container", nullable = false)
    @Basic
    private int dateModified;

    @Column(name = "name_order", table = "container", nullable = false)
    @Basic
    private int nameOrder;

    @Column(name = "smart_reverse_limit_order", table = "container", nullable = false)
    @Basic
    private int smartReverseLimitOrder;

    @Column(name = "container_pid", table = "container")
    @Id
    private Integer containerPid;

    @Column(name = "smart_evaluation_order", table = "container", nullable = false)
    @Basic
    private int smartEvaluationOrder;

    @Column(name = "is_hidden", table = "container", nullable = false)
    @Basic
    private int isHidden;

    @Column(name = "has_cloud_play_order", table = "container", nullable = false)
    @Basic
    private int hasCloudPlayOrder;

    @Column(name = "contained_media_type", table = "container", nullable = false)
    @Basic
    private int containedMediaType;

    @Column(name = "smart_limit_order", table = "container", nullable = false)
    @Basic
    private int smartLimitOrder;

    @Column(name = "smart_limit_value", table = "container", nullable = false)
    @Basic
    private int smartLimitValue;

    @Column(name = "name", table = "container", nullable = false, length = 2000000000)
    @Basic
    private String name;

    @Column(name = "workout_template_id", table = "container", nullable = false)
    @Basic
    private int workoutTemplateId;

    @Column(name = "is_src_remote", table = "container", nullable = false)
    @Basic
    private int isSrcRemote;

    @Column(name = "store_cloud_id", table = "container", nullable = false)
    @Basic
    private int storeCloudId;

    @Column(name = "smart_is_limited", table = "container", nullable = false)
    @Basic
    private int smartIsLimited;

    @Column(name = "album_field_order", table = "container", nullable = false)
    @Basic
    private int albumFieldOrder;

    @Column(name = "is_reversed", table = "container", nullable = false)
    @Basic
    private int isReversed;

    @Column(name = "shuffle_items", table = "container", nullable = false)
    @Basic
    private int shuffleItems;

    @Column(name = "has_been_shuffled", table = "container", nullable = false)
    @Basic
    private int hasBeenShuffled;

}

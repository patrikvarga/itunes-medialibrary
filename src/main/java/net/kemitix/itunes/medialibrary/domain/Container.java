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
@Table(name="container")
public class Container implements Serializable {

    @Column(name="smart_is_genius",table="container",nullable=false)
    @Basic
    private int smartIsGenius;
    @Column(name="repeat_mode",table="container",nullable=false)
    @Basic
    private int repeatMode;
    @Column(name="description",table="container",length=2000000000)
    @Basic
    private String description;
    @Column(name="is_ignorable_itunes_playlist",table="container")
    @Basic
    private Integer isIgnorableItunesPlaylist;
    @Column(name="smart_enabled_only",table="container",nullable=false)
    @Basic
    private int smartEnabledOnly;
    @Column(name="smart_is_dynamic",table="container",nullable=false)
    @Basic
    private int smartIsDynamic;
    @Column(name="play_order",table="container",nullable=false)
    @Basic
    private int playOrder;
    @Column(name="is_saveable",table="container",nullable=false)
    @Basic
    private int isSaveable;
    @Column(name="date_created",table="container",nullable=false)
    @Basic
    private int dateCreated;
    @Column(name="filepath",table="container",nullable=false,length=2000000000)
    @Basic
    private String filepath;
    @Column(name="orig_date_modified",table="container",nullable=false)
    @Basic
    private int origDateModified;
    @Column(name="media_kinds",table="container",nullable=false)
    @Basic
    private int mediaKinds;
    @Column(name="smart_criteria",table="container",length=2000000000)
    @Basic
    private String smartCriteria;
    @Column(name="distinguished_kind",table="container",nullable=false)
    @Basic
    private int distinguishedKind;
    @Column(name="is_ignored_syncing",table="container",nullable=false)
    @Basic
    private int isIgnoredSyncing;
    @Column(name="smart_is_folder",table="container",nullable=false)
    @Basic
    private int smartIsFolder;
    @Column(name="is_container_type_active_target",table="container",nullable=false)
    @Basic
    private int isContainerTypeActiveTarget;
    @Column(name="smart_is_filtered",table="container",nullable=false)
    @Basic
    private int smartIsFiltered;
    @Column(name="smart_limit_kind",table="container",nullable=false)
    @Basic
    private int smartLimitKind;
    @Column(name="container_type",table="container",nullable=false)
    @Basic
    private int containerType;
    @Column(name="parent_pid",table="container",nullable=false)
    @Basic
    private int parentPid;
    @Column(name="date_modified",table="container",nullable=false)
    @Basic
    private int dateModified;
    @Column(name="name_order",table="container",nullable=false)
    @Basic
    private int nameOrder;
    @Column(name="smart_reverse_limit_order",table="container",nullable=false)
    @Basic
    private int smartReverseLimitOrder;
    @Column(name="container_pid",table="container")
    @Id
    private Integer containerPid;
    @Column(name="smart_evaluation_order",table="container",nullable=false)
    @Basic
    private int smartEvaluationOrder;
    @Column(name="is_hidden",table="container",nullable=false)
    @Basic
    private int isHidden;
    @Column(name="has_cloud_play_order",table="container",nullable=false)
    @Basic
    private int hasCloudPlayOrder;
    @Column(name="contained_media_type",table="container",nullable=false)
    @Basic
    private int containedMediaType;
    @Column(name="smart_limit_order",table="container",nullable=false)
    @Basic
    private int smartLimitOrder;
    @Column(name="smart_limit_value",table="container",nullable=false)
    @Basic
    private int smartLimitValue;
    @Column(name="name",table="container",nullable=false,length=2000000000)
    @Basic
    private String name;
    @Column(name="workout_template_id",table="container",nullable=false)
    @Basic
    private int workoutTemplateId;
    @Column(name="is_src_remote",table="container",nullable=false)
    @Basic
    private int isSrcRemote;
    @Column(name="store_cloud_id",table="container",nullable=false)
    @Basic
    private int storeCloudId;
    @Column(name="smart_is_limited",table="container",nullable=false)
    @Basic
    private int smartIsLimited;
    @Column(name="album_field_order",table="container",nullable=false)
    @Basic
    private int albumFieldOrder;
    @Column(name="is_reversed",table="container",nullable=false)
    @Basic
    private int isReversed;
    @Column(name="shuffle_items",table="container",nullable=false)
    @Basic
    private int shuffleItems;
    @Column(name="has_been_shuffled",table="container",nullable=false)
    @Basic
    private int hasBeenShuffled;

    public Container() {

    }
   
    public int getSmartIsGenius() {
        return this.smartIsGenius;
    }

    public void setSmartIsGenius(int smartIsGenius) {
        this.smartIsGenius = smartIsGenius;
    }
   
    public int getRepeatMode() {
        return this.repeatMode;
    }

    public void setRepeatMode(int repeatMode) {
        this.repeatMode = repeatMode;
    }
   
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   
    public Integer getIsIgnorableItunesPlaylist() {
        return this.isIgnorableItunesPlaylist;
    }

    public void setIsIgnorableItunesPlaylist(Integer isIgnorableItunesPlaylist) {
        this.isIgnorableItunesPlaylist = isIgnorableItunesPlaylist;
    }
   
    public int getSmartEnabledOnly() {
        return this.smartEnabledOnly;
    }

    public void setSmartEnabledOnly(int smartEnabledOnly) {
        this.smartEnabledOnly = smartEnabledOnly;
    }
   
    public int getSmartIsDynamic() {
        return this.smartIsDynamic;
    }

    public void setSmartIsDynamic(int smartIsDynamic) {
        this.smartIsDynamic = smartIsDynamic;
    }
   
    public int getPlayOrder() {
        return this.playOrder;
    }

    public void setPlayOrder(int playOrder) {
        this.playOrder = playOrder;
    }
   
    public int getIsSaveable() {
        return this.isSaveable;
    }

    public void setIsSaveable(int isSaveable) {
        this.isSaveable = isSaveable;
    }
   
    public int getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }
   
    public String getFilepath() {
        return this.filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
   
    public int getOrigDateModified() {
        return this.origDateModified;
    }

    public void setOrigDateModified(int origDateModified) {
        this.origDateModified = origDateModified;
    }
   
    public int getMediaKinds() {
        return this.mediaKinds;
    }

    public void setMediaKinds(int mediaKinds) {
        this.mediaKinds = mediaKinds;
    }
   
    public String getSmartCriteria() {
        return this.smartCriteria;
    }

    public void setSmartCriteria(String smartCriteria) {
        this.smartCriteria = smartCriteria;
    }
   
    public int getDistinguishedKind() {
        return this.distinguishedKind;
    }

    public void setDistinguishedKind(int distinguishedKind) {
        this.distinguishedKind = distinguishedKind;
    }
   
    public int getIsIgnoredSyncing() {
        return this.isIgnoredSyncing;
    }

    public void setIsIgnoredSyncing(int isIgnoredSyncing) {
        this.isIgnoredSyncing = isIgnoredSyncing;
    }
   
    public int getSmartIsFolder() {
        return this.smartIsFolder;
    }

    public void setSmartIsFolder(int smartIsFolder) {
        this.smartIsFolder = smartIsFolder;
    }
   
    public int getIsContainerTypeActiveTarget() {
        return this.isContainerTypeActiveTarget;
    }

    public void setIsContainerTypeActiveTarget(int isContainerTypeActiveTarget) {
        this.isContainerTypeActiveTarget = isContainerTypeActiveTarget;
    }
   
    public int getSmartIsFiltered() {
        return this.smartIsFiltered;
    }

    public void setSmartIsFiltered(int smartIsFiltered) {
        this.smartIsFiltered = smartIsFiltered;
    }
   
    public int getSmartLimitKind() {
        return this.smartLimitKind;
    }

    public void setSmartLimitKind(int smartLimitKind) {
        this.smartLimitKind = smartLimitKind;
    }
   
    public int getContainerType() {
        return this.containerType;
    }

    public void setContainerType(int containerType) {
        this.containerType = containerType;
    }
   
    public int getParentPid() {
        return this.parentPid;
    }

    public void setParentPid(int parentPid) {
        this.parentPid = parentPid;
    }
   
    public int getDateModified() {
        return this.dateModified;
    }

    public void setDateModified(int dateModified) {
        this.dateModified = dateModified;
    }
   
    public int getNameOrder() {
        return this.nameOrder;
    }

    public void setNameOrder(int nameOrder) {
        this.nameOrder = nameOrder;
    }
   
    public int getSmartReverseLimitOrder() {
        return this.smartReverseLimitOrder;
    }

    public void setSmartReverseLimitOrder(int smartReverseLimitOrder) {
        this.smartReverseLimitOrder = smartReverseLimitOrder;
    }
   
    public Integer getContainerPid() {
        return this.containerPid;
    }

    public void setContainerPid(Integer containerPid) {
        this.containerPid = containerPid;
    }
   
    public int getSmartEvaluationOrder() {
        return this.smartEvaluationOrder;
    }

    public void setSmartEvaluationOrder(int smartEvaluationOrder) {
        this.smartEvaluationOrder = smartEvaluationOrder;
    }
   
    public int getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(int isHidden) {
        this.isHidden = isHidden;
    }
   
    public int getHasCloudPlayOrder() {
        return this.hasCloudPlayOrder;
    }

    public void setHasCloudPlayOrder(int hasCloudPlayOrder) {
        this.hasCloudPlayOrder = hasCloudPlayOrder;
    }
   
    public int getContainedMediaType() {
        return this.containedMediaType;
    }

    public void setContainedMediaType(int containedMediaType) {
        this.containedMediaType = containedMediaType;
    }
   
    public int getSmartLimitOrder() {
        return this.smartLimitOrder;
    }

    public void setSmartLimitOrder(int smartLimitOrder) {
        this.smartLimitOrder = smartLimitOrder;
    }
   
    public int getSmartLimitValue() {
        return this.smartLimitValue;
    }

    public void setSmartLimitValue(int smartLimitValue) {
        this.smartLimitValue = smartLimitValue;
    }
   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public int getWorkoutTemplateId() {
        return this.workoutTemplateId;
    }

    public void setWorkoutTemplateId(int workoutTemplateId) {
        this.workoutTemplateId = workoutTemplateId;
    }
   
    public int getIsSrcRemote() {
        return this.isSrcRemote;
    }

    public void setIsSrcRemote(int isSrcRemote) {
        this.isSrcRemote = isSrcRemote;
    }
   
    public int getStoreCloudId() {
        return this.storeCloudId;
    }

    public void setStoreCloudId(int storeCloudId) {
        this.storeCloudId = storeCloudId;
    }
   
    public int getSmartIsLimited() {
        return this.smartIsLimited;
    }

    public void setSmartIsLimited(int smartIsLimited) {
        this.smartIsLimited = smartIsLimited;
    }
   
    public int getAlbumFieldOrder() {
        return this.albumFieldOrder;
    }

    public void setAlbumFieldOrder(int albumFieldOrder) {
        this.albumFieldOrder = albumFieldOrder;
    }
   
    public int getIsReversed() {
        return this.isReversed;
    }

    public void setIsReversed(int isReversed) {
        this.isReversed = isReversed;
    }
   
    public int getShuffleItems() {
        return this.shuffleItems;
    }

    public void setShuffleItems(int shuffleItems) {
        this.shuffleItems = shuffleItems;
    }
   
    public int getHasBeenShuffled() {
        return this.hasBeenShuffled;
    }

    public void setHasBeenShuffled(int hasBeenShuffled) {
        this.hasBeenShuffled = hasBeenShuffled;
    }
}

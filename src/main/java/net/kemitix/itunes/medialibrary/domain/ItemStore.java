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
@Table(name="item_store")
public class ItemStore implements Serializable {

    @Column(name="store_kind",table="item_store",nullable=false)
    @Basic
    private int storeKind;
    @Column(name="store_link_id",table="item_store",nullable=false)
    @Basic
    private int storeLinkId;
    @Column(name="store_flavor",table="item_store",length=2000000000)
    @Basic
    private String storeFlavor;
    @Column(name="key_id_2",table="item_store",nullable=false)
    @Basic
    private int keyId2;
    @Column(name="storefront_id",table="item_store",nullable=false)
    @Basic
    private int storefrontId;
    @Column(name="key_id",table="item_store",nullable=false)
    @Basic
    private int keyId;
    @Column(name="purchase_history_id",table="item_store",nullable=false)
    @Basic
    private int purchaseHistoryId;
    @Column(name="sync_id",table="item_store",nullable=false)
    @Basic
    private int syncId;
    @Column(name="store_redownloaded_status",table="item_store",nullable=false)
    @Basic
    private int storeRedownloadedStatus;
    @Column(name="store_genre_id",table="item_store",nullable=false)
    @Basic
    private int storeGenreId;
    @Column(name="store_saga_id",table="item_store",nullable=false)
    @Basic
    private int storeSagaId;
    @Column(name="is_ota_purchased",table="item_store",nullable=false)
    @Basic
    private int isOtaPurchased;
    @Column(name="store_artist_id",table="item_store",nullable=false)
    @Basic
    private int storeArtistId;
    @Column(name="item_pid",table="item_store")
    @Id
    private Integer itemPid;
    @Column(name="date_released",table="item_store",nullable=false)
    @Basic
    private int dateReleased;
    @Column(name="purchase_history_redownload_params",table="item_store",length=2000000000)
    @Basic
    private String purchaseHistoryRedownloadParams;
    @Column(name="store_item_id",table="item_store",nullable=false)
    @Basic
    private int storeItemId;
    @Column(name="purchase_history_token",table="item_store",nullable=false)
    @Basic
    private int purchaseHistoryToken;
    @Column(name="feed_url",table="item_store",length=2000000000)
    @Basic
    private String feedUrl;
    @Column(name="key_platform_id",table="item_store",nullable=false)
    @Basic
    private int keyPlatformId;
    @Column(name="artwork_url",table="item_store",length=2000000000)
    @Basic
    private String artworkUrl;
    @Column(name="match_redownload_params",table="item_store",length=2000000000)
    @Basic
    private String matchRedownloadParams;
    @Column(name="store_matched_status",table="item_store",nullable=false)
    @Basic
    private int storeMatchedStatus;
    @Column(name="external_guid",table="item_store",length=2000000000)
    @Basic
    private String externalGuid;
    @Column(name="key_versions",table="item_store",nullable=false)
    @Basic
    private int keyVersions;
    @Column(name="store_xid",table="item_store",length=2000000000)
    @Basic
    private String storeXid;
    @Column(name="account_id",table="item_store",nullable=false)
    @Basic
    private int accountId;
    @Column(name="date_purchased",table="item_store",nullable=false)
    @Basic
    private int datePurchased;
    @Column(name="store_playlist_id",table="item_store",nullable=false)
    @Basic
    private int storePlaylistId;
    @Column(name="home_sharing_id",table="item_store",nullable=false)
    @Basic
    private int homeSharingId;
    @Column(name="store_composer_id",table="item_store",nullable=false)
    @Basic
    private int storeComposerId;

    public ItemStore() {

    }
   
    public int getStoreKind() {
        return this.storeKind;
    }

    public void setStoreKind(int storeKind) {
        this.storeKind = storeKind;
    }
   
    public int getStoreLinkId() {
        return this.storeLinkId;
    }

    public void setStoreLinkId(int storeLinkId) {
        this.storeLinkId = storeLinkId;
    }
   
    public String getStoreFlavor() {
        return this.storeFlavor;
    }

    public void setStoreFlavor(String storeFlavor) {
        this.storeFlavor = storeFlavor;
    }
   
    public int getKeyId2() {
        return this.keyId2;
    }

    public void setKeyId2(int keyId2) {
        this.keyId2 = keyId2;
    }
   
    public int getStorefrontId() {
        return this.storefrontId;
    }

    public void setStorefrontId(int storefrontId) {
        this.storefrontId = storefrontId;
    }
   
    public int getKeyId() {
        return this.keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }
   
    public int getPurchaseHistoryId() {
        return this.purchaseHistoryId;
    }

    public void setPurchaseHistoryId(int purchaseHistoryId) {
        this.purchaseHistoryId = purchaseHistoryId;
    }
   
    public int getSyncId() {
        return this.syncId;
    }

    public void setSyncId(int syncId) {
        this.syncId = syncId;
    }
   
    public int getStoreRedownloadedStatus() {
        return this.storeRedownloadedStatus;
    }

    public void setStoreRedownloadedStatus(int storeRedownloadedStatus) {
        this.storeRedownloadedStatus = storeRedownloadedStatus;
    }
   
    public int getStoreGenreId() {
        return this.storeGenreId;
    }

    public void setStoreGenreId(int storeGenreId) {
        this.storeGenreId = storeGenreId;
    }
   
    public int getStoreSagaId() {
        return this.storeSagaId;
    }

    public void setStoreSagaId(int storeSagaId) {
        this.storeSagaId = storeSagaId;
    }
   
    public int getIsOtaPurchased() {
        return this.isOtaPurchased;
    }

    public void setIsOtaPurchased(int isOtaPurchased) {
        this.isOtaPurchased = isOtaPurchased;
    }
   
    public int getStoreArtistId() {
        return this.storeArtistId;
    }

    public void setStoreArtistId(int storeArtistId) {
        this.storeArtistId = storeArtistId;
    }
   
    public Integer getItemPid() {
        return this.itemPid;
    }

    public void setItemPid(Integer itemPid) {
        this.itemPid = itemPid;
    }
   
    public int getDateReleased() {
        return this.dateReleased;
    }

    public void setDateReleased(int dateReleased) {
        this.dateReleased = dateReleased;
    }
   
    public String getPurchaseHistoryRedownloadParams() {
        return this.purchaseHistoryRedownloadParams;
    }

    public void setPurchaseHistoryRedownloadParams(String purchaseHistoryRedownloadParams) {
        this.purchaseHistoryRedownloadParams = purchaseHistoryRedownloadParams;
    }
   
    public int getStoreItemId() {
        return this.storeItemId;
    }

    public void setStoreItemId(int storeItemId) {
        this.storeItemId = storeItemId;
    }
   
    public int getPurchaseHistoryToken() {
        return this.purchaseHistoryToken;
    }

    public void setPurchaseHistoryToken(int purchaseHistoryToken) {
        this.purchaseHistoryToken = purchaseHistoryToken;
    }
   
    public String getFeedUrl() {
        return this.feedUrl;
    }

    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }
   
    public int getKeyPlatformId() {
        return this.keyPlatformId;
    }

    public void setKeyPlatformId(int keyPlatformId) {
        this.keyPlatformId = keyPlatformId;
    }
   
    public String getArtworkUrl() {
        return this.artworkUrl;
    }

    public void setArtworkUrl(String artworkUrl) {
        this.artworkUrl = artworkUrl;
    }
   
    public String getMatchRedownloadParams() {
        return this.matchRedownloadParams;
    }

    public void setMatchRedownloadParams(String matchRedownloadParams) {
        this.matchRedownloadParams = matchRedownloadParams;
    }
   
    public int getStoreMatchedStatus() {
        return this.storeMatchedStatus;
    }

    public void setStoreMatchedStatus(int storeMatchedStatus) {
        this.storeMatchedStatus = storeMatchedStatus;
    }
   
    public String getExternalGuid() {
        return this.externalGuid;
    }

    public void setExternalGuid(String externalGuid) {
        this.externalGuid = externalGuid;
    }
   
    public int getKeyVersions() {
        return this.keyVersions;
    }

    public void setKeyVersions(int keyVersions) {
        this.keyVersions = keyVersions;
    }
   
    public String getStoreXid() {
        return this.storeXid;
    }

    public void setStoreXid(String storeXid) {
        this.storeXid = storeXid;
    }
   
    public int getAccountId() {
        return this.accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
   
    public int getDatePurchased() {
        return this.datePurchased;
    }

    public void setDatePurchased(int datePurchased) {
        this.datePurchased = datePurchased;
    }
   
    public int getStorePlaylistId() {
        return this.storePlaylistId;
    }

    public void setStorePlaylistId(int storePlaylistId) {
        this.storePlaylistId = storePlaylistId;
    }
   
    public int getHomeSharingId() {
        return this.homeSharingId;
    }

    public void setHomeSharingId(int homeSharingId) {
        this.homeSharingId = homeSharingId;
    }
   
    public int getStoreComposerId() {
        return this.storeComposerId;
    }

    public void setStoreComposerId(int storeComposerId) {
        this.storeComposerId = storeComposerId;
    }
}

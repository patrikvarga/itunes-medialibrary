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
@Table(name = "item_store")
public class ItemStore implements Serializable {

    @Column(name = "store_kind", table = "item_store", nullable = false)
    @Basic
    private int storeKind;

    @Column(name = "store_link_id", table = "item_store", nullable = false)
    @Basic
    private int storeLinkId;

    @Column(name = "store_flavor", table = "item_store", length = 2000000000)
    @Basic
    private String storeFlavor;

    @Column(name = "key_id_2", table = "item_store", nullable = false)
    @Basic
    private int keyId2;

    @Column(name = "storefront_id", table = "item_store", nullable = false)
    @Basic
    private int storefrontId;

    @Column(name = "key_id", table = "item_store", nullable = false)
    @Basic
    private int keyId;

    @Column(name = "purchase_history_id", table = "item_store", nullable = false)
    @Basic
    private int purchaseHistoryId;

    @Column(name = "sync_id", table = "item_store", nullable = false)
    @Basic
    private int syncId;

    @Column(name = "store_redownloaded_status", table = "item_store", nullable = false)
    @Basic
    private int storeRedownloadedStatus;

    @Column(name = "store_genre_id", table = "item_store", nullable = false)
    @Basic
    private int storeGenreId;

    @Column(name = "store_saga_id", table = "item_store", nullable = false)
    @Basic
    private int storeSagaId;

    @Column(name = "is_ota_purchased", table = "item_store", nullable = false)
    @Basic
    private int isOtaPurchased;

    @Column(name = "store_artist_id", table = "item_store", nullable = false)
    @Basic
    private int storeArtistId;

    @Column(name = "item_pid", table = "item_store")
    @Id
    private Integer itemPid;

    @Column(name = "date_released", table = "item_store", nullable = false)
    @Basic
    private int dateReleased;

    @Column(name = "purchase_history_redownload_params", table = "item_store", length = 2000000000)
    @Basic
    private String purchaseHistoryRedownloadParams;

    @Column(name = "store_item_id", table = "item_store", nullable = false)
    @Basic
    private int storeItemId;

    @Column(name = "purchase_history_token", table = "item_store", nullable = false)
    @Basic
    private int purchaseHistoryToken;

    @Column(name = "feed_url", table = "item_store", length = 2000000000)
    @Basic
    private String feedUrl;

    @Column(name = "key_platform_id", table = "item_store", nullable = false)
    @Basic
    private int keyPlatformId;

    @Column(name = "artwork_url", table = "item_store", length = 2000000000)
    @Basic
    private String artworkUrl;

    @Column(name = "match_redownload_params", table = "item_store", length = 2000000000)
    @Basic
    private String matchRedownloadParams;

    @Column(name = "store_matched_status", table = "item_store", nullable = false)
    @Basic
    private int storeMatchedStatus;

    @Column(name = "external_guid", table = "item_store", length = 2000000000)
    @Basic
    private String externalGuid;

    @Column(name = "key_versions", table = "item_store", nullable = false)
    @Basic
    private int keyVersions;

    @Column(name = "store_xid", table = "item_store", length = 2000000000)
    @Basic
    private String storeXid;

    @Column(name = "account_id", table = "item_store", nullable = false)
    @Basic
    private int accountId;

    @Column(name = "date_purchased", table = "item_store", nullable = false)
    @Basic
    private int datePurchased;

    @Column(name = "store_playlist_id", table = "item_store", nullable = false)
    @Basic
    private int storePlaylistId;

    @Column(name = "home_sharing_id", table = "item_store", nullable = false)
    @Basic
    private int homeSharingId;

    @Column(name = "store_composer_id", table = "item_store", nullable = false)
    @Basic
    private int storeComposerId;

}

package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemStore implements Record {

    private Long itemPid;
    private long storeItemId;
    private long storeComposerId;
    private long storeGenreId;
    private long storePlaylistId;
    private long storefrontId;
    private long purchaseHistoryId;
    private long purchaseHistoryToken;
    private long storeSagaId;
    private long cloudStatus;
    private long syncId;
    private long homeSharingId;
    private long isOtaPurchased;
    private long storeKind;
    private long accountId;
    private long downloaderAccountId;
    private long familyAccountId;
    private long isProtected;
    private long keyVersions;
    private long keyPlatformId;
    private long keyId;
    private long keyId2;
    private long datePurchased;
    private long dateReleased;
    private long storeMatchedStatus;
    private long storeRedownloadedStatus;
    private long storeLinkId;
    private long vppIsLicensed;
    private long vppOrgId;
    private long needsReporting;
    private long subscriptionStoreItemId;
    private long playbackEndpointType;
    private long isMasteredForItunes;
    private long advertisementType;
    private long isArtistUploadedContent;
    private long cloudAssetAvailable;
    private long isSubscription;
    private long syncInMyLibrary = 1; // many 1s in table
    private long cloudInMyLibrary;
    private String extrasUrl = "";
    private String vppOrgName = "";
    private String syncRedownloadParams = "";
    private String radioStationId = "";
    private String advertisementUniqueId = "";

    @Override
    public Long getId() {
        return getItemPid();
    }

    @Override
    public void setId(Long id) {
        setItemPid(id);
    }

}

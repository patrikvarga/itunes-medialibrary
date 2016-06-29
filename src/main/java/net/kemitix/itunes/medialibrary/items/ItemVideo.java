package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemVideo implements Record {

    private Long itemPid;
    private long videoQuality;
    private long isRental;
    private long hasChapterData;
    private long seasonNumber;
    private String episodeId;
    private String networkName;
    private String extendedContentRating;
    private String moveInfo;
    private long hasAlternateAudio;
    private long hasSubtitles;
    private long audioLanguage;
    private long audioTrackIndex;
    private long audioTrackId;
    private long subtitleLanguage;
    private long subtitleTrackIndex;
    private long rentalDuration;
    private long rentalPlaybackDuration;
    private long rentalPlaybackDateStarted;
    private long rentalDateStarted;
    private long isDemo;

    @Override
    public Long getId() {
        return getItemPid();
    }

    @Override
    public void setId(Long id) {
        setItemPid(id);
    }

}

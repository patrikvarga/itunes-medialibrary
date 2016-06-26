package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemPlayback implements Record {

    private Long itemPid;
    private int audioFormat = 301; // 301 = mp3
    private int bitRate;
    private int codecType;
    private int codecSubtype;
    private int dataKind;
    private long duration;
    private int gaplessHeuristicInfo;
    private int gaplessEncodingDelay;
    private int gaplessEncodingDrain;
    private int gaplessLastFrameResynch;
    private int hasVideo;
    private float sampleRate;
    private float startTimeMs;
    private float stopTimeMs;
    private int volumeNormalizationEnergy;
    private int progressionDirection;

    @Override
    public Long getId() {
        return getItemPid();
    }

    @Override
    public void setId(Long id) {
        setItemPid(id);
    }

}

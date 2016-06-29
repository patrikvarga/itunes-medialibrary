package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemExtra implements Record {

    private Long itemPid;
    private String title;
    private String sortTitle;
    private int discCount;
    private int trackCount;
    private String comment;
    private Integer bpm;
    private long totalTimeMs;
    private int year;
    private String location;
    private long fileSize;
    private String integrity;//wtf?
    private int mediaType = 8;
    private int isAudibleAudioBook;
    private long dateModified;
    private int mediaKind = 1;
    private int contentRating;
    private int contentRatingLevel;
    private int isUserDisabled;
    private int geniusId;
    private int pendingGeniusChecksum;
    private int categoryId;
    private int locationKindId = 42;
    private String version = "";
    private String displayVersion = "";

    @Override
    public Long getId() {
        return getItemPid();
    }

    @Override
    public void setId(Long id) {
        setItemPid(id);
    }

    static ItemExtra of(AlbumTrack t) {
        final ItemExtra extra = new ItemExtra();
        extra.setComment(t.getComment());
        extra.setLocation(t.getFileLocation());
        extra.setTitle(t.getTrackTitle());
        extra.setSortTitle(t.getTrackTitle());
        if (t.getBpm() > 0) {
            extra.setBpm(t.getBpm());
        }
        extra.setFileSize(t.getFileSize());
        extra.setTotalTimeMs(t.getTotalTimeMs());
        extra.setYear(t.getYear());
        return extra;
    }

}

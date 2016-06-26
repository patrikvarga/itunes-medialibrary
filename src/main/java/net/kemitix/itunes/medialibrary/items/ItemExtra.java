package net.kemitix.itunes.medialibrary.items;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemExtra implements Record {

    // item_pid
    private long id;
    private String title;
    private String sortTitle;
    private String comment;
    private int bpm;
    private long totalTimeMs;
    private int year;
    private String location;
    private long fileSize;
    private int mediaType = 8;
    private int isAudibleAudioBook;
    private long dateModified = new Date().getTime() / 1000;
    private int mediaKind = 1;
    private int contentRating;
    private int contentRatingLevel;
    private int isUserDisabled;
    private int geniusId;
    private int pendingGeniusChecksum;
    private int locationKindId;
    private int version;
    private int displayVersion;

    static ItemExtra of(AlbumTrack t) {
        final ItemExtra extra = new ItemExtra();
        extra.setComment(t.getComment());
        extra.setLocation(t.getFileLocation());
        extra.setTitle(t.getTrackTitle());
        extra.setSortTitle(t.getTrackTitle());
        extra.setBpm(t.getBpm());
        extra.setFileSize(t.getFileSize());
        extra.setTotalTimeMs(t.getTotalTimeMs());
        extra.setYear(t.getYear());
        return extra;
    }

}

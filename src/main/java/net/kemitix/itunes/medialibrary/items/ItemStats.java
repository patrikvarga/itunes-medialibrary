package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemStats implements Record {

    private Long itemPid;
    private long userRating;
    private long needsRestore;
    private long playCountUser;
    private long playCountRecent;
    private long hasBeenPlayed;
    private long datePlayed;
    private long dateSkipped;
    private long dateAccessed;
    private long isAlarm;
    private long skipCountUser;
    private long skipCountRecent;
    private long rememberBookmark;
    private float bookmarkTimeMs;
    private long hidden;
    private long choseByAutoFill;
    private long likedState;
    private long likedStateChanged;

    @Override
    public Long getId() {
        return getItemPid();
    }

    @Override
    public void setId(Long id) {
        setItemPid(id);
    }

}

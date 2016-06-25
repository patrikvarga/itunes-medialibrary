package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemExtra implements Record {

    // item_pid
    private long id;
    //title
    private String title;
    //sort_title
    private String sortTitle;
    //comment
    private String comment;
    //bpm
    private int bpm;
    //total_time_ms
    private int totalTimeMs;
    //year
    private int year;
    //location
    private String location;
    //file_size
    private long fileSize;
    // media_type
    private int mediaType = 8;
}

package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Album implements Record {

    private long id;
    private String title;
    private String sortTitle;
    private Artist artist;
    private int year;

}

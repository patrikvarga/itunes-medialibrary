package net.kemitix.itunes.medialibrary;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Album {

    private long id;
    private String title;
    private String sortTitle;
    private Artist artist;
    private int year;
}

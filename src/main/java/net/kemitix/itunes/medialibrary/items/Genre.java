package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Genre implements Record {

    // genre_id
    private long id;
    // genre
    private String genre;

}

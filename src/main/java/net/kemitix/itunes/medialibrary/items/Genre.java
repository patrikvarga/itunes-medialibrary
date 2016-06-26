package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Genre implements Record {

    // genre_id
    private long id;
    private String genre;
    private int cloudStatus;
    private int keepLocal;
    private int keepLocalStatus;
    private int representativeItemPid;

}

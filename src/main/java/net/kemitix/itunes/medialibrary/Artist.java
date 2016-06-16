package net.kemitix.itunes.medialibrary;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Artist implements Record {

    private long id;
    private String title;
    private String sortTitle;
}

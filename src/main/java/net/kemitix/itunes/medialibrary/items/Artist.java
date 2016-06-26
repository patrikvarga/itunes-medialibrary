package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Artist implements Record {

    private long id;
    private String name;
    private String sortName;
}

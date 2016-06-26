package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseLocation implements Record {

    // base_location_id
    private long id;
    private String path;

}

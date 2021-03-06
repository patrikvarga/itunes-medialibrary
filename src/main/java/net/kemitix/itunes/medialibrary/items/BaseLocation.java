package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseLocation implements Record {

    private Long baseLocationId;
    private String path;

    @Override
    public Long getId() {
        return getBaseLocationId();
    }

    @Override
    public void setId(Long id) {
        setBaseLocationId(id);
    }

}

package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemPlayback implements Record {

    private Long itemPid;

    @Override
    public Long getId() {
        return getItemPid();
    }

    @Override
    public void setId(Long id) {
        setItemPid(id);
    }

}

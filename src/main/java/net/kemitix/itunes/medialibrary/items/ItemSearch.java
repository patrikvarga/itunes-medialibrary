package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemSearch implements Record {

    private long itemPid;
    private long searchTitle;
    private long searchAlbum;
    private long searchArtist;
    private long searchComposer;
    private long searchAlbumArtist;

    @Override
    public Long getId() {
        return getItemPid();
    }

    @Override
    public void setId(Long id) {
        setItemPid(id);
    }

}

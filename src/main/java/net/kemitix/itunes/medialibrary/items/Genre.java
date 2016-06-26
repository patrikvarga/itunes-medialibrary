package net.kemitix.itunes.medialibrary.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Genre implements Record {

    private Long genreId;
    private String genre;
    private int cloudStatus;
    private int keepLocal;
    private int keepLocalStatus;
    private int representativeItemPid;

    @Override
    public Long getId() {
        return getGenreId();
    }

    @Override
    public void setId(Long id) {
        setGenreId(id);
    }

}

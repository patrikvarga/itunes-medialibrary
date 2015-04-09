package net.kemitix.itunes.medialibrary;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Track {

    private String title;
    private List<Artist> artists;

    private Album album;
    private int trackNumber;

}

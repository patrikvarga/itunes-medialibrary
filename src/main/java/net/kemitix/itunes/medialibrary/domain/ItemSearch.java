package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "item_search")
public class ItemSearch implements Serializable {

    @Column(name = "search_album", table = "item_search", nullable = false)
    @Basic
    private int searchAlbum;

    @Column(name = "search_artist", table = "item_search", nullable = false)
    @Basic
    private int searchArtist;

    @Column(name = "search_composer", table = "item_search", nullable = false)
    @Basic
    private int searchComposer;

    @Column(name = "item_pid", table = "item_search")
    @Id
    private Integer itemPid;

    @Column(name = "search_title", table = "item_search", nullable = false)
    @Basic
    private int searchTitle;

    @Column(name = "search_album_artist", table = "item_search", nullable = false)
    @Basic
    private int searchAlbumArtist;

}

package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "artwork_free_list")
public class ArtworkFreeList implements Serializable {

    @Column(name = "offset", table = "artwork_free_list")
    @Id
    private Integer offset;

    @Column(name = "length", table = "artwork_free_list")
    @Basic
    private Integer length;

}

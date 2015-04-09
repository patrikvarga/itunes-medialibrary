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
@Table(name = "lyrics")
public class Lyrics implements Serializable {

    @Column(name = "checksum", table = "lyrics")
    @Basic
    private Integer checksum;

    @Column(name = "item_pid", table = "lyrics")
    @Id
    private Integer itemPid;

    @Column(name = "lyrics", table = "lyrics", length = 2000000000)
    @Basic
    private String lyrics;

}

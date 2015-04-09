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
@Table(name = "genre")
public class Genre implements Serializable {

    @Column(name = "genre_id", table = "genre")
    @Id
    private Integer genreId;

    @Column(name = "cloud_status", table = "genre", nullable = false)
    @Basic
    private int cloudStatus;

    @Column(name = "representative_item_pid", table = "genre", nullable = false)
    @Basic
    private int representativeItemPid;

    @Column(name = "genre", table = "genre", nullable = false, length = 2000000000)
    @Basic
    private String genre;

    @Column(name = "grouping_key", table = "genre", length = 2000000000)
    @Basic
    private String groupingKey;

}

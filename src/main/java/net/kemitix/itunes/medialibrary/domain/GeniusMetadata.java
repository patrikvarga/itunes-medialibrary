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
@Table(name = "genius_metadata")
public class GeniusMetadata implements Serializable {

    @Column(name = "genius_id", table = "genius_metadata")
    @Id
    private Integer geniusId;

    @Column(name = "revision_level", table = "genius_metadata")
    @Basic
    private Integer revisionLevel;

    @Column(name = "data", table = "genius_metadata", length = 2000000000)
    @Basic
    private String data;

    @Column(name = "checksum", table = "genius_metadata")
    @Basic
    private Integer checksum;

    @Column(name = "version", table = "genius_metadata")
    @Basic
    private Integer version;

}

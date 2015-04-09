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
@Table(name = "entity_revision")
public class EntityRevision implements Serializable {

    @Column(name = "revision_type", table = "entity_revision", nullable = false)
    @Basic
    private int revisionType;

    @Column(name = "entity_pid", table = "entity_revision", nullable = false)
    @Basic
    private int entityPid;

    @Column(name = "deleted", table = "entity_revision", nullable = false)
    @Basic
    private int deleted;

    @Column(name = "class", table = "entity_revision", nullable = false)
    @Basic
    private int class1;

    @Column(name = "revision", table = "entity_revision")
    @Id
    private Integer revision;

}

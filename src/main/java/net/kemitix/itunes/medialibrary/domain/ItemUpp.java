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
@Table(name = "item_upp")
public class ItemUpp implements Serializable {

    @Column(name = "metadata_timestamp", table = "item_upp", scale = 10, precision = 2000000000)
    @Basic
    private Double metadataTimestamp;

    @Column(name = "item_pid", table = "item_upp")
    @Id
    private Integer itemPid;

    @Column(name = "metadata_entity_revision", table = "item_upp")
    @Basic
    private Integer metadataEntityRevision;

    @Column(name = "bookkeeper_identifier", table = "item_upp", nullable = false, length = 2000000000)
    @Basic
    private String bookkeeperIdentifier;

}

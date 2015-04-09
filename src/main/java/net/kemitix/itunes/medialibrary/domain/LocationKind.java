package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "location_kind", uniqueConstraints = @UniqueConstraint(columnNames = {"kind"}))
public class LocationKind implements Serializable {

    @Column(name = "kind", table = "location_kind", nullable = false, length = 2000000000)
    @Basic
    private String kind;

    @Column(name = "location_kind_id", table = "location_kind")
    @Id
    private Integer locationKindId;

}

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
@Table(name = "base_location")
public class BaseLocation implements Serializable {

    @Column(name = "path", table = "base_location", nullable = false, length = 2000000000)
    @Basic
    private String path;

    @Column(name = "base_location_id", table = "base_location")
    @Id
    private Integer baseLocationId;

}

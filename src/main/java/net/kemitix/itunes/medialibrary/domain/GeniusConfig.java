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
@Table(name = "genius_config", uniqueConstraints = @UniqueConstraint(columnNames = {"version"}))
public class GeniusConfig implements Serializable {

    @Column(name = "min_num_results", table = "genius_config")
    @Basic
    private Integer minNumResults;

    @Column(name = "data", table = "genius_config", length = 2000000000)
    @Basic
    private String data;

    @Column(name = "id", table = "genius_config")
    @Id
    private Integer id;

    @Column(name = "version", table = "genius_config")
    @Basic
    private Integer version;

    @Column(name = "default_num_results", table = "genius_config")
    @Basic
    private Integer defaultNumResults;
}

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
@Table(name = "genius_similarities")
public class GeniusSimilarities implements Serializable {

    @Column(name = "genius_id", table = "genius_similarities")
    @Id
    private Integer geniusId;

    @Column(name = "data", table = "genius_similarities", length = 2000000000)
    @Basic
    private String data;

}

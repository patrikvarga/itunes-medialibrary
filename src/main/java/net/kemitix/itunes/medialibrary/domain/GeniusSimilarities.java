package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genius_similarities")
public class GeniusSimilarities implements Serializable {

    @Column(name="genius_id",table="genius_similarities")
    @Id
    private Integer geniusId;
    @Column(name="data",table="genius_similarities",length=2000000000)
    @Basic
    private String data;

    public GeniusSimilarities() {

    }
   
    public Integer getGeniusId() {
        return this.geniusId;
    }

    public void setGeniusId(Integer geniusId) {
        this.geniusId = geniusId;
    }
   
    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="genius_config",uniqueConstraints=@UniqueConstraint(columnNames={"version"}))
public class GeniusConfig implements Serializable {

    @Column(name="min_num_results",table="genius_config")
    @Basic
    private Integer minNumResults;
    @Column(name="data",table="genius_config",length=2000000000)
    @Basic
    private String data;
    @Column(name="id",table="genius_config")
    @Id
    private Integer id;
    @Column(name="version",table="genius_config")
    @Basic
    private Integer version;
    @Column(name="default_num_results",table="genius_config")
    @Basic
    private Integer defaultNumResults;

    public GeniusConfig() {

    }
   
    public Integer getMinNumResults() {
        return this.minNumResults;
    }

    public void setMinNumResults(Integer minNumResults) {
        this.minNumResults = minNumResults;
    }
   
    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
   
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
   
    public Integer getDefaultNumResults() {
        return this.defaultNumResults;
    }

    public void setDefaultNumResults(Integer defaultNumResults) {
        this.defaultNumResults = defaultNumResults;
    }
}

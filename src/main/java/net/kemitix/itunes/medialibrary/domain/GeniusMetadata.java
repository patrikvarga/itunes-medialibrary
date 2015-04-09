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
@Table(name="genius_metadata")
public class GeniusMetadata implements Serializable {

    @Column(name="genius_id",table="genius_metadata")
    @Id
    private Integer geniusId;
    @Column(name="revision_level",table="genius_metadata")
    @Basic
    private Integer revisionLevel;
    @Column(name="data",table="genius_metadata",length=2000000000)
    @Basic
    private String data;
    @Column(name="checksum",table="genius_metadata")
    @Basic
    private Integer checksum;
    @Column(name="version",table="genius_metadata")
    @Basic
    private Integer version;

    public GeniusMetadata() {

    }
   
    public Integer getGeniusId() {
        return this.geniusId;
    }

    public void setGeniusId(Integer geniusId) {
        this.geniusId = geniusId;
    }
   
    public Integer getRevisionLevel() {
        return this.revisionLevel;
    }

    public void setRevisionLevel(Integer revisionLevel) {
        this.revisionLevel = revisionLevel;
    }
   
    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
   
    public Integer getChecksum() {
        return this.checksum;
    }

    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }
   
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}

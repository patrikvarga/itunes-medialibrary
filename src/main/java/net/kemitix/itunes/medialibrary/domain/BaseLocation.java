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
@Table(name="base_location")
public class BaseLocation implements Serializable {

    @Column(name="path",table="base_location",nullable=false,length=2000000000)
    @Basic
    private String path;
    @Column(name="base_location_id",table="base_location")
    @Id
    private Integer baseLocationId;

    public BaseLocation() {

    }
   
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }
   
    public Integer getBaseLocationId() {
        return this.baseLocationId;
    }

    public void setBaseLocationId(Integer baseLocationId) {
        this.baseLocationId = baseLocationId;
    }
}

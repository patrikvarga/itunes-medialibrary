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
@Table(name="location_kind",uniqueConstraints=@UniqueConstraint(columnNames={"kind"}))
public class LocationKind implements Serializable {

    @Column(name="kind",table="location_kind",nullable=false,length=2000000000)
    @Basic
    private String kind;
    @Column(name="location_kind_id",table="location_kind")
    @Id
    private Integer locationKindId;

    public LocationKind() {

    }
   
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
   
    public Integer getLocationKindId() {
        return this.locationKindId;
    }

    public void setLocationKindId(Integer locationKindId) {
        this.locationKindId = locationKindId;
    }
}

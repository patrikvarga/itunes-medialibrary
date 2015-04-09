package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="entity_revision")
public class EntityRevision implements Serializable {

    @Column(name="revision_type",table="entity_revision",nullable=false)
    @Basic
    private int revisionType;
    @Column(name="entity_pid",table="entity_revision",nullable=false)
    @Basic
    private int entityPid;
    @Column(name="deleted",table="entity_revision",nullable=false)
    @Basic
    private int deleted;
    @Column(name="class",table="entity_revision",nullable=false)
    @Basic
    private int class1;
    @Column(name="revision",table="entity_revision")
    @Id
    private Integer revision;

    public EntityRevision() {

    }
   
    public int getRevisionType() {
        return this.revisionType;
    }

    public void setRevisionType(int revisionType) {
        this.revisionType = revisionType;
    }
   
    public int getEntityPid() {
        return this.entityPid;
    }

    public void setEntityPid(int entityPid) {
        this.entityPid = entityPid;
    }
   
    public int getDeleted() {
        return this.deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }
   
    public int getClass1() {
        return this.class1;
    }

    public void setClass1(int class1) {
        this.class1 = class1;
    }
   
    public Integer getRevision() {
        return this.revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }
}

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
@Table(name="container_items")
public class ContainerItems implements Serializable {

    @Column(name="item_pid_data",table="container_items",length=2000000000)
    @Basic
    private String itemPidData;
    @Column(name="container_pid",table="container_items")
    @Id
    private Integer containerPid;

    public ContainerItems() {

    }
   
    public String getItemPidData() {
        return this.itemPidData;
    }

    public void setItemPidData(String itemPidData) {
        this.itemPidData = itemPidData;
    }
   
    public Integer getContainerPid() {
        return this.containerPid;
    }

    public void setContainerPid(Integer containerPid) {
        this.containerPid = containerPid;
    }
}

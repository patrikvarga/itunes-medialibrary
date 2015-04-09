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
@Table(name = "container_items")
public class ContainerItems implements Serializable {

    @Column(name = "item_pid_data", table = "container_items", length = 2000000000)
    @Basic
    private String itemPidData;

    @Column(name = "container_pid", table = "container_items")
    @Id
    private Integer containerPid;
}

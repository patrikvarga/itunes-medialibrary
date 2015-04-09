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
@Table(name = "store_link")
public class StoreLink implements Serializable {

    @Column(name = "store_link_id", table = "store_link")
    @Id
    private Integer storeLinkId;

    @Column(name = "url", table = "store_link", nullable = false, length = 2000000000)
    @Basic
    private String url;

}

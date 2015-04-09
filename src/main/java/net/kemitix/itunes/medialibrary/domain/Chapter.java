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
@Table(name = "chapter")
public class Chapter implements Serializable {

    @Column(name = "item_pid", table = "chapter")
    @Id
    private Integer itemPid;

    @Column(name = "chapter_data", table = "chapter", length = 2000000000)
    @Basic
    private String chapterData;

}

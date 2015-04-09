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
@Table(name="chapter")
public class Chapter implements Serializable {

    @Column(name="item_pid",table="chapter")
    @Id
    private Integer itemPid;
    @Column(name="chapter_data",table="chapter",length=2000000000)
    @Basic
    private String chapterData;

    public Chapter() {

    }
   
    public Integer getItemPid() {
        return this.itemPid;
    }

    public void setItemPid(Integer itemPid) {
        this.itemPid = itemPid;
    }
   
    public String getChapterData() {
        return this.chapterData;
    }

    public void setChapterData(String chapterData) {
        this.chapterData = chapterData;
    }
}

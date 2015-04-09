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
@Table(name="lyrics")
public class Lyrics implements Serializable {

    @Column(name="checksum",table="lyrics")
    @Basic
    private Integer checksum;
    @Column(name="item_pid",table="lyrics")
    @Id
    private Integer itemPid;
    @Column(name="lyrics",table="lyrics",length=2000000000)
    @Basic
    private String lyrics;

    public Lyrics() {

    }
   
    public Integer getChecksum() {
        return this.checksum;
    }

    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }
   
    public Integer getItemPid() {
        return this.itemPid;
    }

    public void setItemPid(Integer itemPid) {
        this.itemPid = itemPid;
    }
   
    public String getLyrics() {
        return this.lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}

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
@Table(name="genre")
public class Genre implements Serializable {

    @Column(name="genre_id",table="genre")
    @Id
    private Integer genreId;
    @Column(name="cloud_status",table="genre",nullable=false)
    @Basic
    private int cloudStatus;
    @Column(name="representative_item_pid",table="genre",nullable=false)
    @Basic
    private int representativeItemPid;
    @Column(name="genre",table="genre",nullable=false,length=2000000000)
    @Basic
    private String genre;
    @Column(name="grouping_key",table="genre",length=2000000000)
    @Basic
    private String groupingKey;

    public Genre() {

    }
   
    public Integer getGenreId() {
        return this.genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }
   
    public int getCloudStatus() {
        return this.cloudStatus;
    }

    public void setCloudStatus(int cloudStatus) {
        this.cloudStatus = cloudStatus;
    }
   
    public int getRepresentativeItemPid() {
        return this.representativeItemPid;
    }

    public void setRepresentativeItemPid(int representativeItemPid) {
        this.representativeItemPid = representativeItemPid;
    }
   
    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
   
    public String getGroupingKey() {
        return this.groupingKey;
    }

    public void setGroupingKey(String groupingKey) {
        this.groupingKey = groupingKey;
    }
}

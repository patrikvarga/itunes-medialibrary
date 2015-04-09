package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_search")
public class ItemSearch implements Serializable {

    @Column(name="search_album",table="item_search",nullable=false)
    @Basic
    private int searchAlbum;
    @Column(name="search_artist",table="item_search",nullable=false)
    @Basic
    private int searchArtist;
    @Column(name="search_composer",table="item_search",nullable=false)
    @Basic
    private int searchComposer;
    @Column(name="item_pid",table="item_search")
    @Id
    private Integer itemPid;
    @Column(name="search_title",table="item_search",nullable=false)
    @Basic
    private int searchTitle;
    @Column(name="search_album_artist",table="item_search",nullable=false)
    @Basic
    private int searchAlbumArtist;

    public ItemSearch() {

    }
   
    public int getSearchAlbum() {
        return this.searchAlbum;
    }

    public void setSearchAlbum(int searchAlbum) {
        this.searchAlbum = searchAlbum;
    }
   
    public int getSearchArtist() {
        return this.searchArtist;
    }

    public void setSearchArtist(int searchArtist) {
        this.searchArtist = searchArtist;
    }
   
    public int getSearchComposer() {
        return this.searchComposer;
    }

    public void setSearchComposer(int searchComposer) {
        this.searchComposer = searchComposer;
    }
   
    public Integer getItemPid() {
        return this.itemPid;
    }

    public void setItemPid(Integer itemPid) {
        this.itemPid = itemPid;
    }
   
    public int getSearchTitle() {
        return this.searchTitle;
    }

    public void setSearchTitle(int searchTitle) {
        this.searchTitle = searchTitle;
    }
   
    public int getSearchAlbumArtist() {
        return this.searchAlbumArtist;
    }

    public void setSearchAlbumArtist(int searchAlbumArtist) {
        this.searchAlbumArtist = searchAlbumArtist;
    }
}

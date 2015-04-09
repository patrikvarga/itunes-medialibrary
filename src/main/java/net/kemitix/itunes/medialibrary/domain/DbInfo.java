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
@Table(name="db_info")
public class DbInfo implements Serializable {

    @Column(name="db_pid",table="db_info")
    @Id
    private Integer dbPid;
    @Column(name="genius_cuid",table="db_info",length=2000000000)
    @Basic
    private String geniusCuid;
    @Column(name="media_folder_url",table="db_info",length=2000000000)
    @Basic
    private String mediaFolderUrl;
    @Column(name="audio_language",table="db_info")
    @Basic
    private Integer audioLanguage;
    @Column(name="subtitle_language",table="db_info")
    @Basic
    private Integer subtitleLanguage;
    @Column(name="bib",table="db_info",length=2000000000)
    @Basic
    private String bib;
    @Column(name="rib",table="db_info",length=2000000000)
    @Basic
    private String rib;
    @Column(name="primary_container_pid",table="db_info")
    @Basic
    private Integer primaryContainerPid;

    public DbInfo() {

    }
   
    public Integer getDbPid() {
        return this.dbPid;
    }

    public void setDbPid(Integer dbPid) {
        this.dbPid = dbPid;
    }
   
    public String getGeniusCuid() {
        return this.geniusCuid;
    }

    public void setGeniusCuid(String geniusCuid) {
        this.geniusCuid = geniusCuid;
    }
   
    public String getMediaFolderUrl() {
        return this.mediaFolderUrl;
    }

    public void setMediaFolderUrl(String mediaFolderUrl) {
        this.mediaFolderUrl = mediaFolderUrl;
    }
   
    public Integer getAudioLanguage() {
        return this.audioLanguage;
    }

    public void setAudioLanguage(Integer audioLanguage) {
        this.audioLanguage = audioLanguage;
    }
   
    public Integer getSubtitleLanguage() {
        return this.subtitleLanguage;
    }

    public void setSubtitleLanguage(Integer subtitleLanguage) {
        this.subtitleLanguage = subtitleLanguage;
    }
   
    public String getBib() {
        return this.bib;
    }

    public void setBib(String bib) {
        this.bib = bib;
    }
   
    public String getRib() {
        return this.rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }
   
    public Integer getPrimaryContainerPid() {
        return this.primaryContainerPid;
    }

    public void setPrimaryContainerPid(Integer primaryContainerPid) {
        this.primaryContainerPid = primaryContainerPid;
    }
}

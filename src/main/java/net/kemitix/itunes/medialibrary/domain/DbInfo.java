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
@Table(name = "db_info")
public class DbInfo implements Serializable {

    @Column(name = "db_pid", table = "db_info")
    @Id
    private Integer dbPid;

    @Column(name = "genius_cuid", table = "db_info", length = 2000000000)
    @Basic
    private String geniusCuid;

    @Column(name = "media_folder_url", table = "db_info", length = 2000000000)
    @Basic
    private String mediaFolderUrl;

    @Column(name = "audio_language", table = "db_info")
    @Basic
    private Integer audioLanguage;

    @Column(name = "subtitle_language", table = "db_info")
    @Basic
    private Integer subtitleLanguage;

    @Column(name = "bib", table = "db_info", length = 2000000000)
    @Basic
    private String bib;

    @Column(name = "rib", table = "db_info", length = 2000000000)
    @Basic
    private String rib;

    @Column(name = "primary_container_pid", table = "db_info")
    @Basic
    private Integer primaryContainerPid;

}

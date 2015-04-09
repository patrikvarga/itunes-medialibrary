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
@Table(name = "item_playback")
public class ItemPlayback implements Serializable {

    @Column(name = "data_kind", table = "item_playback", nullable = false)
    @Basic
    private int dataKind;

    @Column(name = "data_url", table = "item_playback", length = 2000000000)
    @Basic
    private String dataUrl;

    @Column(name = "gapless_last_frame_resynch", table = "item_playback", nullable = false)
    @Basic
    private int gaplessLastFrameResynch;

    @Column(name = "has_video", table = "item_playback", nullable = false)
    @Basic
    private int hasVideo;

    @Column(name = "volume_normalization_energy", table = "item_playback", nullable = false)
    @Basic
    private int volumeNormalizationEnergy;

    @Column(name = "gapless_encoding_drain", table = "item_playback", nullable = false)
    @Basic
    private int gaplessEncodingDrain;

    @Column(name = "format", table = "item_playback", length = 2000000000)
    @Basic
    private String format;

    @Column(name = "gapless_heuristic_info", table = "item_playback", nullable = false)
    @Basic
    private int gaplessHeuristicInfo;

    @Column(name = "start_time_ms", table = "item_playback", nullable = false)
    @Basic
    private double startTimeMs;

    @Column(name = "audio_format", table = "item_playback", nullable = false)
    @Basic
    private int audioFormat;

    @Column(name = "gapless_encoding_delay", table = "item_playback", nullable = false)
    @Basic
    private int gaplessEncodingDelay;

    @Column(name = "codec_subtype", table = "item_playback", nullable = false)
    @Basic
    private int codecSubtype;

    @Column(name = "codec_type", table = "item_playback", nullable = false)
    @Basic
    private int codecType;

    @Column(name = "sample_rate", table = "item_playback", nullable = false)
    @Basic
    private double sampleRate;

    @Column(name = "duration", table = "item_playback", nullable = false)
    @Basic
    private int duration;

    @Column(name = "relative_volume", table = "item_playback")
    @Basic
    private Integer relativeVolume;

    @Column(name = "bit_rate", table = "item_playback", nullable = false)
    @Basic
    private int bitRate;

    @Column(name = "item_pid", table = "item_playback")
    @Id
    private Integer itemPid;

    @Column(name = "eq_preset", table = "item_playback", length = 2000000000)
    @Basic
    private String eqPreset;

    @Column(name = "stop_time_ms", table = "item_playback", nullable = false)
    @Basic
    private double stopTimeMs;

}

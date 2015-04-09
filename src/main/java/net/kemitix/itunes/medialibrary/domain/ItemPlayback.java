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
@Table(name="item_playback")
public class ItemPlayback implements Serializable {

    @Column(name="data_kind",table="item_playback",nullable=false)
    @Basic
    private int dataKind;
    @Column(name="data_url",table="item_playback",length=2000000000)
    @Basic
    private String dataUrl;
    @Column(name="gapless_last_frame_resynch",table="item_playback",nullable=false)
    @Basic
    private int gaplessLastFrameResynch;
    @Column(name="has_video",table="item_playback",nullable=false)
    @Basic
    private int hasVideo;
    @Column(name="volume_normalization_energy",table="item_playback",nullable=false)
    @Basic
    private int volumeNormalizationEnergy;
    @Column(name="gapless_encoding_drain",table="item_playback",nullable=false)
    @Basic
    private int gaplessEncodingDrain;
    @Column(name="format",table="item_playback",length=2000000000)
    @Basic
    private String format;
    @Column(name="gapless_heuristic_info",table="item_playback",nullable=false)
    @Basic
    private int gaplessHeuristicInfo;
    @Column(name="start_time_ms",table="item_playback",nullable=false)
    @Basic
    private double startTimeMs;
    @Column(name="audio_format",table="item_playback",nullable=false)
    @Basic
    private int audioFormat;
    @Column(name="gapless_encoding_delay",table="item_playback",nullable=false)
    @Basic
    private int gaplessEncodingDelay;
    @Column(name="codec_subtype",table="item_playback",nullable=false)
    @Basic
    private int codecSubtype;
    @Column(name="codec_type",table="item_playback",nullable=false)
    @Basic
    private int codecType;
    @Column(name="sample_rate",table="item_playback",nullable=false)
    @Basic
    private double sampleRate;
    @Column(name="duration",table="item_playback",nullable=false)
    @Basic
    private int duration;
    @Column(name="relative_volume",table="item_playback")
    @Basic
    private Integer relativeVolume;
    @Column(name="bit_rate",table="item_playback",nullable=false)
    @Basic
    private int bitRate;
    @Column(name="item_pid",table="item_playback")
    @Id
    private Integer itemPid;
    @Column(name="eq_preset",table="item_playback",length=2000000000)
    @Basic
    private String eqPreset;
    @Column(name="stop_time_ms",table="item_playback",nullable=false)
    @Basic
    private double stopTimeMs;

    public ItemPlayback() {

    }
   
    public int getDataKind() {
        return this.dataKind;
    }

    public void setDataKind(int dataKind) {
        this.dataKind = dataKind;
    }
   
    public String getDataUrl() {
        return this.dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }
   
    public int getGaplessLastFrameResynch() {
        return this.gaplessLastFrameResynch;
    }

    public void setGaplessLastFrameResynch(int gaplessLastFrameResynch) {
        this.gaplessLastFrameResynch = gaplessLastFrameResynch;
    }
   
    public int getHasVideo() {
        return this.hasVideo;
    }

    public void setHasVideo(int hasVideo) {
        this.hasVideo = hasVideo;
    }
   
    public int getVolumeNormalizationEnergy() {
        return this.volumeNormalizationEnergy;
    }

    public void setVolumeNormalizationEnergy(int volumeNormalizationEnergy) {
        this.volumeNormalizationEnergy = volumeNormalizationEnergy;
    }
   
    public int getGaplessEncodingDrain() {
        return this.gaplessEncodingDrain;
    }

    public void setGaplessEncodingDrain(int gaplessEncodingDrain) {
        this.gaplessEncodingDrain = gaplessEncodingDrain;
    }
   
    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
   
    public int getGaplessHeuristicInfo() {
        return this.gaplessHeuristicInfo;
    }

    public void setGaplessHeuristicInfo(int gaplessHeuristicInfo) {
        this.gaplessHeuristicInfo = gaplessHeuristicInfo;
    }
   
    public double getStartTimeMs() {
        return this.startTimeMs;
    }

    public void setStartTimeMs(double startTimeMs) {
        this.startTimeMs = startTimeMs;
    }
   
    public int getAudioFormat() {
        return this.audioFormat;
    }

    public void setAudioFormat(int audioFormat) {
        this.audioFormat = audioFormat;
    }
   
    public int getGaplessEncodingDelay() {
        return this.gaplessEncodingDelay;
    }

    public void setGaplessEncodingDelay(int gaplessEncodingDelay) {
        this.gaplessEncodingDelay = gaplessEncodingDelay;
    }
   
    public int getCodecSubtype() {
        return this.codecSubtype;
    }

    public void setCodecSubtype(int codecSubtype) {
        this.codecSubtype = codecSubtype;
    }
   
    public int getCodecType() {
        return this.codecType;
    }

    public void setCodecType(int codecType) {
        this.codecType = codecType;
    }
   
    public double getSampleRate() {
        return this.sampleRate;
    }

    public void setSampleRate(double sampleRate) {
        this.sampleRate = sampleRate;
    }
   
    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
   
    public Integer getRelativeVolume() {
        return this.relativeVolume;
    }

    public void setRelativeVolume(Integer relativeVolume) {
        this.relativeVolume = relativeVolume;
    }
   
    public int getBitRate() {
        return this.bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }
   
    public Integer getItemPid() {
        return this.itemPid;
    }

    public void setItemPid(Integer itemPid) {
        this.itemPid = itemPid;
    }
   
    public String getEqPreset() {
        return this.eqPreset;
    }

    public void setEqPreset(String eqPreset) {
        this.eqPreset = eqPreset;
    }
   
    public double getStopTimeMs() {
        return this.stopTimeMs;
    }

    public void setStopTimeMs(double stopTimeMs) {
        this.stopTimeMs = stopTimeMs;
    }
}

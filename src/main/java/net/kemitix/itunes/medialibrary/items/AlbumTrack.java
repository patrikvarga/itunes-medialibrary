package net.kemitix.itunes.medialibrary.items;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AlbumTrack {

    //album_artist.album_artist,
    private String albumArtist;
    //album.album,
    private String albumTitle;
    //item_extra.title,
    private String trackTitle;
    //item_artist.item_artist,
    private String trackArtist;
    //item.track_number,
    private int discNumber;
    //item.track_number,
    private int trackNumber;
    //item_extra.year,
    private int year;
    //item_extra.location,
    private String fileLocation;
    //base_location.path,
    private String baseLocation;
    //item.item_pid
    private long id;
    //genre.genre
    private String genre;
    //comment
    private String comment;
    //bpm
    private int bpm;
    //total_time_ms
    private int totalTimeMs;
    //file_size
    private long fileSize;

    @Override
    public String toString() {
        return String.format("%s [%04d] %02d. %s - %s [%s/%s]", albumTitle, year, trackNumber, trackArtist, trackTitle, baseLocation, fileLocation);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.fileLocation);
        hash = 59 * hash + Objects.hashCode(this.baseLocation);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AlbumTrack other = (AlbumTrack) obj;
        if (!Objects.equals(this.fileLocation, other.fileLocation)) {
            return false;
        }
        if (!Objects.equals(this.baseLocation, other.baseLocation)) {
            return false;
        }
        return true;
    }

}

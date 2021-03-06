package net.kemitix.itunes.medialibrary.v5;

import java.sql.ResultSet;
import java.sql.SQLException;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
@Profile({"v5/ro", "v5/rw"})
class AlbumTrackRowMapper implements RowMapper<AlbumTrack> {

    @Override
    public AlbumTrack mapRow(ResultSet rs, int rowNum) throws SQLException {
        final AlbumTrack albumTrack = new AlbumTrack();
        albumTrack.setId(rs.getLong("item_pid"));
        albumTrack.setAlbumArtist(rs.getString("album_artist"));
        albumTrack.setAlbumTitle(rs.getString("album"));
        albumTrack.setTrackArtist(rs.getString("item_artist"));
        albumTrack.setTrackTitle(rs.getString("title"));
        albumTrack.setTrackNumber(rs.getInt("track_number"));
        albumTrack.setDiscNumber(rs.getInt("disc_number"));
        albumTrack.setYear(rs.getInt("year"));
        albumTrack.setFileLocation(rs.getString("location"));
        albumTrack.setBaseLocation(rs.getString("path"));
        albumTrack.setComment(rs.getString("comment"));
        albumTrack.setBpm(rs.getInt("bpm"));
        albumTrack.setFileSize(rs.getLong("file_size"));
        albumTrack.setTotalTimeMs(rs.getLong("total_time_ms"));
        return albumTrack;
    }

}

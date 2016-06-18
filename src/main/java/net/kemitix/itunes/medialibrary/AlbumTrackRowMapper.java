package net.kemitix.itunes.medialibrary;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class AlbumTrackRowMapper implements RowMapper<AlbumTrack> {

    @Override
    public AlbumTrack mapRow(ResultSet rs, int rowNum) throws SQLException {
        final AlbumTrack albumTrack = new AlbumTrack();
        albumTrack.setId(rs.getLong("item_pid"));
        albumTrack.setAlbumArtist(rs.getString("album_artist"));
        albumTrack.setAlbumTitle(rs.getString("album"));
        albumTrack.setTrackArtist(rs.getString("item_artist"));
        albumTrack.setTrackTitle(rs.getString("title"));
        albumTrack.setTrackNumber(rs.getInt("track_number"));
        albumTrack.setYear(rs.getInt("year"));
        albumTrack.setFileLocation(rs.getString("location"));
        albumTrack.setBaseLocation(rs.getString("path"));
        return albumTrack;
    }

}

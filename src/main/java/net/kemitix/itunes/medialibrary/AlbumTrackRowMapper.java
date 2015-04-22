package net.kemitix.itunes.medialibrary;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class AlbumTrackRowMapper implements RowMapper<AlbumTrack> {

    @Override
    public AlbumTrack mapRow(ResultSet rs, int rowNum) throws SQLException {
        AlbumTrack albumTracks = new AlbumTrack();
        albumTracks.setId(rs.getLong("item_pid"));
        albumTracks.setAlbumArtist(rs.getString("album_artist"));
        albumTracks.setAlbumTitle(rs.getString("album"));
        albumTracks.setTrackArtist(rs.getString("item_artist"));
        albumTracks.setTrackTitle(rs.getString("title"));
        albumTracks.setYear(rs.getInt("year"));
        albumTracks.setFileLocation(rs.getString("location"));
        return albumTracks;
    }

}

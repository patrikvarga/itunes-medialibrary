package net.kemitix.itunes.medialibrary.v5;

import java.sql.ResultSet;
import java.sql.SQLException;
import net.kemitix.itunes.medialibrary.items.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
@Profile({"v5/ro", "v5/rw"})
class AlbumRowMapper implements RowMapper<Album> {

    private final ArtistDao artistDao;

    @Autowired
    public AlbumRowMapper(ArtistDao artistDao) {
        this.artistDao = artistDao;
    }

    @Override
    public Album mapRow(ResultSet rs, int rowNum) throws SQLException {
        Album album = new Album();
        album.setId(rs.getLong("album_pid"));
        album.setTitle(rs.getString("album"));
        album.setSortTitle(rs.getString("sort_album"));
        album.setArtist(artistDao.find(rs.getLong("album_artist_pid")));
        album.setYear(rs.getInt("album_year"));
        return album;
    }

}

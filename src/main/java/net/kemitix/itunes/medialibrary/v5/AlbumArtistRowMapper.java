package net.kemitix.itunes.medialibrary.v5;

import java.sql.ResultSet;
import java.sql.SQLException;
import net.kemitix.itunes.medialibrary.ArtistType;
import net.kemitix.itunes.medialibrary.items.Artist;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
@Profile({"v5/ro", "v5/rw"})
@ArtistType(ArtistType.Type.ALBUM_ARTIST)
class AlbumArtistRowMapper implements RowMapper<Artist> {

    @Override
    public Artist mapRow(ResultSet rs, int rowNum) throws SQLException {
        final Artist artist = new Artist();
        artist.setId(rs.getLong("album_artist_pid"));
        artist.setName(rs.getString("album_artist"));
        artist.setSortName(rs.getString("sort_album_artist"));
        return artist;
    }

}

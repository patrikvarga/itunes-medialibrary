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
@ArtistType(ArtistType.Type.ITEM_ARTIST)
class ItemArtistRowMapper implements RowMapper<Artist> {

    @Override
    public Artist mapRow(ResultSet rs, int rowNum) throws SQLException {
        Artist artist = new Artist();
        artist.setId(rs.getLong("item_artist_pid"));
        artist.setName(rs.getString("item_artist"));
        artist.setSortName(rs.getString("sort_item_artist"));
        return artist;
    }

}

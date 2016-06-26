package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
@DbVersion5
@Profile({"v5/ro", "v5/rw"})
class AlbumDao extends WritableLibraryDao<Album> {

    @Autowired
    public AlbumDao(
            JdbcTemplate jdbcTemplate,
            RowMapper<Album> rowMapper,
            SimpleJdbcInsert insertActor) {
        super(jdbcTemplate, rowMapper, insertActor, "album", "album_pid");
    }

    @Override
    protected SqlParameterSource getInsertParameters(Album record) {
        final MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("album", record.getTitle());
        parameters.addValue("sort_album", record.getSortTitle());
        parameters.addValue("album_artist_pid", record.getAlbumArtistPid());
        parameters.addValue("album_year", record.getYear());
        parameters.addValue("cloud_status", 0);
        parameters.addValue("keep_local", 1);
        parameters.addValue("keep_local_status", 2);
        parameters.addValue("user_rating", 0);
        parameters.addValue("liked_state", 0);
        parameters.addValue("all_compilations", 0);
        parameters.addValue("representative_item_pid", 0);
        return parameters;
    }
}

package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.ArtistType;
import net.kemitix.itunes.medialibrary.items.Artist;
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
class AlbumArtistDao extends WritableLibraryDao<Artist> {

    private final String SELECT_ALL_SQL = "select * from album_artist";
    private final String SELECT_BY_ID = "select * from album_artist where album_artist_pid = ?";

    @Autowired
    public AlbumArtistDao(
            JdbcTemplate jdbcTemplate,
            @ArtistType(ArtistType.Type.ALBUM_ARTIST) RowMapper<Artist> rowMapper,
            SimpleJdbcInsert insertActor
    ) {
        super(jdbcTemplate, rowMapper, insertActor, "album_artist");
    }

    @Override
    String getSelectAllSql() {
        return SELECT_ALL_SQL;
    }

    @Override
    String getSelectByIdSql() {
        return SELECT_BY_ID;
    }

    @Override
    protected SqlParameterSource getInsertParameters(Artist record) {
        final MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("album_artist", record.getTitle());
        parameters.addValue("sort_album_artist", record.getSortTitle());
        parameters.addValue("cloud_status", 0);
        parameters.addValue("store_id", 0);
        parameters.addValue("keep_local", 0);
        parameters.addValue("keep_local_status", 0);
        parameters.addValue("representative_item_pid", 0);
        return parameters;
    }

}

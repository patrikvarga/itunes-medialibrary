package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.v5.WritableLibraryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
class ArtistDao extends WritableLibraryDao<Artist> {

    private final String SELECT_ALL_SQL = "select * from album_artist";
    private final String SELECT_BY_ID = "select * from album_artist where album_artist_pid = ?";

    @Autowired
    public ArtistDao(JdbcTemplate jdbcTemplate, RowMapper<Artist> rowMapper, SimpleJdbcInsert insertActor) {
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

}

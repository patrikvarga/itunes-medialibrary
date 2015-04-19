package net.kemitix.itunes.medialibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
class ArtistDao extends LibraryDao<Artist> {

    private final String SELECT_ALL_SQL = "select * from album_artist";
    private final String SELECT_BY_ID = "select * from album_artist where album_artist_pid = ?";

    @Autowired
    public ArtistDao(JdbcTemplate jdbcTemplate, RowMapper<Artist> rowMapper) {
        super(jdbcTemplate, rowMapper);
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

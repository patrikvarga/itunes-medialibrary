package net.kemitix.itunes.medialibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumDao extends LibraryDao<Album> {

    private final String SELECT_ALL_SQL = "select * from album";
    private final String SELECT_BY_ID = "select * from album where album_pid = ?";

    @Autowired
    public AlbumDao(
            JdbcTemplate jdbcTemplate,
            RowMapper<Album> rowMapper) {
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

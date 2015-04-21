package net.kemitix.itunes.medialibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumTracksDao extends LibraryDao<AlbumTracks> {

    private final String sql;

    @Autowired
    public AlbumTracksDao(
            JdbcTemplate jdbcTemplate,
            RowMapper<AlbumTracks> rowMapper,
            @Qualifier("album tracks") String sql) {
        super(jdbcTemplate, rowMapper);
        this.sql = sql;
    }

    @Override
    String getSelectAllSql() {
        return sql;
    }

    @Override
    String getSelectByIdSql() {
        return sql + " where item_pid = ?";
    }
}

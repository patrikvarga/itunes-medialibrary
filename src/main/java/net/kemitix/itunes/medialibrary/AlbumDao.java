package net.kemitix.itunes.medialibrary;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
class AlbumDao {

    private final String SELECT_ALL_SQL = "select album_pid, album from album";
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Album> rowMapper;

    @Autowired
    public AlbumDao(JdbcTemplate jdbcTemplate, RowMapper<Album> rowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
    }

    List<Album> selectAll() throws SQLException {
        return jdbcTemplate.query(SELECT_ALL_SQL, rowMapper);
    }
}

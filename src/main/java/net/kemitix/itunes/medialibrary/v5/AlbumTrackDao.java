package net.kemitix.itunes.medialibrary.v5;

import java.io.File;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.AlbumTracks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumTrackDao extends LibraryDao<AlbumTrack> {

    private final String sql;

    @Autowired
    public AlbumTrackDao(
            JdbcTemplate jdbcTemplate,
            RowMapper<AlbumTrack> rowMapper,
            @AlbumTracks String sql) {
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

    String getSelectByFileSql() {
        return sql + " where location = ?";
    }

    public AlbumTrack find(File file) {
        try {
            return getJdbcTemplate()
                    .queryForObject(getSelectByFileSql(), getRowMapper(), file.getName());
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }
}

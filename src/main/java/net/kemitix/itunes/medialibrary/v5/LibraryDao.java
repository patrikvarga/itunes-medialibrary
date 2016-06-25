package net.kemitix.itunes.medialibrary.v5;

import java.util.List;
import lombok.Getter;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@Getter
abstract class LibraryDao<T> {

    protected final JdbcTemplate jdbcTemplate;

    private final RowMapper<T> rowMapper;

    abstract String getSelectAllSql();

    abstract String getSelectByIdSql();

    public LibraryDao(
            JdbcTemplate jdbcTemplate,
            RowMapper rowMapper
    ) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
    }

    public List<T> selectAll() {
        return jdbcTemplate.query(getSelectAllSql(), rowMapper);
    }

    public T find(long id) {
        try {
            return jdbcTemplate.queryForObject(getSelectByIdSql(), rowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}

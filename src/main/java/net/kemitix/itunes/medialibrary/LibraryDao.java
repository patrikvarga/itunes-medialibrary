package net.kemitix.itunes.medialibrary;

import java.util.List;
import lombok.Getter;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@Getter
public abstract class LibraryDao<T> {

    private final JdbcTemplate jdbcTemplate;

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

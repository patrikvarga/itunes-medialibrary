package net.kemitix.itunes.medialibrary.v5;

import java.util.List;
import lombok.Getter;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@Getter
abstract class LibraryDao<T> {

    protected final JdbcTemplate jdbcTemplate;
    protected final String tableName;
    protected final String idColumn;
    private final RowMapper<T> rowMapper;

    String getSelectAllSql() {
        return "select * from " + tableName;
    }

    String getSelectByIdSql() {
        return "select * from " + tableName + " where " + idColumn + " = ?";
    }

    public LibraryDao(
            JdbcTemplate jdbcTemplate,
            RowMapper rowMapper,
            String tableName,
            String idColumn
    ) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
        this.tableName = tableName;
        this.idColumn = idColumn;
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

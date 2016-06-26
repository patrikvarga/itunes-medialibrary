package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.Record;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

abstract class WritableLibraryDao<T extends Record> extends LibraryDao<T> {

    private final SimpleJdbcInsert insertActor;

    public WritableLibraryDao(
            JdbcTemplate jdbcTemplate,
            RowMapper rowMapper,
            SimpleJdbcInsert insertActor,
            String tableName,
            String idColumn
    ) {
        super(jdbcTemplate, rowMapper, tableName, idColumn);
        this.insertActor = insertActor;
        this.insertActor.withTableName(tableName);
    }

    public long insert(T record) {
        final SqlParameterSource parameters = getInsertParameters(record);
        final long newId = insertActor.executeAndReturnKey(parameters).longValue();
        record.setId(newId);
        return newId;
    }

    protected SqlParameterSource getInsertParameters(T record) {
        final SqlParameterSource parameters = new BeanPropertySqlParameterSource(record);
        return parameters;
    }

    public void update(long id, String columnName, Object newValue) {
        this.jdbcTemplate.update("UPDATE " + tableName + " SET " + columnName + " = ? WHERE " + idColumn + " = ?", newValue, id);
    }

}

package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.Record;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public abstract class WritableLibraryDao<T extends Record> extends LibraryDao<T> {

    private final SimpleJdbcInsert insertActor;

    public WritableLibraryDao(
            JdbcTemplate jdbcTemplate,
            RowMapper rowMapper,
            SimpleJdbcInsert insertActor,
            String tableName
    ) {
        super(jdbcTemplate, rowMapper);
        this.insertActor = insertActor;
        this.insertActor.withTableName(tableName);
    }

    public void insert(T record) {
        final SqlParameterSource parameters = new BeanPropertySqlParameterSource(record);
        final Number newId = insertActor.executeAndReturnKey(parameters);
        record.setId(newId.longValue());
    }

}

package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
@DbVersion5
@Profile({"v5/ro", "v5/rw"})
class GenreDao extends WritableLibraryDao<Genre> {

    private final String SELECT_ALL_SQL = "select * from genre";
    private final String SELECT_BY_ID = "select * from genre where genre_id = ?";

    @Autowired
    public GenreDao(JdbcTemplate jdbcTemplate, RowMapper<Genre> rowMapper, SimpleJdbcInsert insertActor) {
        super(jdbcTemplate, rowMapper, insertActor, "genre");
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

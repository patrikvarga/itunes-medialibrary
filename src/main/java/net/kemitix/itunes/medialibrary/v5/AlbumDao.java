package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
@DbVersion5
@Profile({"v5/ro", "v5/rw"})
class AlbumDao extends WritableLibraryDao<Album> {

    private final String SELECT_ALL_SQL = "select * from album";
    private final String SELECT_BY_ID = "select * from album where album_pid = ?";

    @Autowired
    public AlbumDao(
            JdbcTemplate jdbcTemplate,
            RowMapper<Album> rowMapper,
            SimpleJdbcInsert insertActor) {
        super(jdbcTemplate, rowMapper, insertActor, "album");
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

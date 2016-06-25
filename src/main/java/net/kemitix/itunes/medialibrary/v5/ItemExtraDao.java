package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.ItemExtra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
@DbVersion5
@Profile({"v5/ro", "v5/rw"})
class ItemExtraDao extends WritableLibraryDao<ItemExtra> {

    private final String SELECT_ALL_SQL = "select * from item_extra";
    private final String SELECT_BY_ID = "select * from item_extra where item_pid = ?";

    @Autowired
    public ItemExtraDao(JdbcTemplate jdbcTemplate, RowMapper<ItemExtra> rowMapper, SimpleJdbcInsert insertActor) {
        super(jdbcTemplate, rowMapper, insertActor, "item");
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

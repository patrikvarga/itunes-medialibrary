package net.kemitix.itunes.medialibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
class ItemDao extends LibraryDao<Item> {

    private final String SELECT_ALL_SQL = "select * from item";
    private final String SELECT_BY_ID = "select * from item where item_pid = ?";

    @Autowired
    public ItemDao(JdbcTemplate jdbcTemplate, RowMapper<Item> rowMapper) {
        super(jdbcTemplate, rowMapper);
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

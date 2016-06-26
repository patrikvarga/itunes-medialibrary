package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.ItemStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
@DbVersion5
@Profile({"v5/ro", "v5/rw"})
class ItemStoreDao extends WritableLibraryDao<ItemStore> {

    @Autowired
    public ItemStoreDao(JdbcTemplate jdbcTemplate, RowMapper<ItemStore> rowMapper, SimpleJdbcInsert insertActor) {
        super(jdbcTemplate, rowMapper, insertActor, "item_store", "item_pid");
    }

}

package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
@DbVersion5
@Profile({"v5/ro", "v5/rw"})
class ItemDao extends WritableLibraryDao<Item> {

    private final ItemExtraDao itemExtraDao;

    @Autowired
    public ItemDao(
            ItemExtraDao itemExtraDao,
            JdbcTemplate jdbcTemplate,
            RowMapper<Item> rowMapper,
            SimpleJdbcInsert insertActor
    ) {
        super(jdbcTemplate, rowMapper, insertActor, "item", "item_pid");
        this.itemExtraDao = itemExtraDao;
    }

    @Override
    public long insert(Item record) {
        final long id = super.insert(record);
        record.getExtra().setId(id);
        itemExtraDao.insert(record.getExtra());
        return id;
    }

}

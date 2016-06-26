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
    private final ItemSearchDao itemSearchDao;
    private final ItemStoreDao itemStoreDao;
    private final ItemPlaybackDao itemPlaybackDao;

    @Autowired
    public ItemDao(
            ItemExtraDao itemExtraDao,
            ItemSearchDao itemSearchDao,
            ItemStoreDao itemStoreDao,
            ItemPlaybackDao itemPlaybackDao,
            JdbcTemplate jdbcTemplate,
            RowMapper<Item> rowMapper,
            SimpleJdbcInsert insertActor
    ) {
        super(jdbcTemplate, rowMapper, insertActor, "item", "item_pid");
        this.itemExtraDao = itemExtraDao;
        this.itemSearchDao = itemSearchDao;
        this.itemStoreDao = itemStoreDao;
        this.itemPlaybackDao = itemPlaybackDao;
    }

    @Override
    public long insert(Item record) {
        final long id = super.insert(record);
        record.getExtra().setId(id);
        record.getSearch().setId(id);
        record.getStore().setId(id);
        record.getPlayback().setId(id);
        itemExtraDao.insert(record.getExtra());
        itemSearchDao.insert(record.getSearch());
        itemStoreDao.insert(record.getStore());
        itemPlaybackDao.insert(record.getPlayback());
        return id;
    }

}

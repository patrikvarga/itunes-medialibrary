package net.kemitix.itunes.medialibrary.v5;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.mockito.Mockito.mock;

@RunWith(BlockJUnit4ClassRunner.class)
public class ItemDaoTest extends AbstractDaoTest {

    private ItemExtraDao itemExtraDao;
    private ItemSearchDao itemSearchDao;
    private ItemStoreDao itemStoreDao;
    private ItemPlaybackDao itemPlaybackDao;

    @Before
    @Override
    public void setUp() {
        this.itemExtraDao = mock(ItemExtraDao.class);
        this.itemSearchDao = mock(ItemSearchDao.class);
        this.itemStoreDao = mock(ItemStoreDao.class);
        this.itemPlaybackDao = mock(ItemPlaybackDao.class);
        setUpTest(new ItemDao(itemExtraDao, itemSearchDao, itemStoreDao, itemPlaybackDao, getJdbcTemplate(), getRowMapper(), getInsertActor()));
    }

}

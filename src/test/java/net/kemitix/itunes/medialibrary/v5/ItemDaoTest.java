package net.kemitix.itunes.medialibrary.v5;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.mockito.Mockito.mock;

@RunWith(BlockJUnit4ClassRunner.class)
public class ItemDaoTest extends AbstractDaoTest {

    private ItemExtraDao itemExtraDao;

    @Before
    @Override
    public void setUp() {
        this.itemExtraDao = mock(ItemExtraDao.class);
        setUpTest(new ItemDao(itemExtraDao, getJdbcTemplate(), getRowMapper(), getInsertActor()));
    }

}

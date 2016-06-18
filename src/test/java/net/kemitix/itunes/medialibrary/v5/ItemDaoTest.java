package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.v5.ItemDao;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class ItemDaoTest extends AbstractDaoTest {

    @Before
    @Override
    public void setUp() {
        setUpTest(new ItemDao(getJdbcTemplate(), getRowMapper(), getInsertActor()));
    }

}

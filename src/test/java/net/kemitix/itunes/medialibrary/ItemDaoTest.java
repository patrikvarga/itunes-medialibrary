package net.kemitix.itunes.medialibrary;

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

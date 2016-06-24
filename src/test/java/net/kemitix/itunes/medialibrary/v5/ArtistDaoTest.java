package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.v5.AlbumArtistDao;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class ArtistDaoTest extends AbstractDaoTest {

    @Before
    @Override
    public void setUp() {
        setUpTest(new AlbumArtistDao(getJdbcTemplate(), getRowMapper(), getInsertActor()));
    }

}

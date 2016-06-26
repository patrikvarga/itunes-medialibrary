package net.kemitix.itunes.medialibrary.v5;

import java.sql.ResultSet;
import java.sql.SQLException;
import net.kemitix.itunes.medialibrary.items.Item;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(BlockJUnit4ClassRunner.class)
public class ItemRowMapperTest {

    private ItemRowMapper itemRowMapper;

    private AlbumDao albumDao;
    private ItemArtistDao itemArtistDao;
    private ItemExtraDao itemExtraDao;

    @Before
    public void setUp() {
        albumDao = mock(AlbumDao.class);
        itemArtistDao = mock(ItemArtistDao.class);
        itemExtraDao = mock(ItemExtraDao.class);
        itemRowMapper = new ItemRowMapper(albumDao, itemArtistDao, itemExtraDao);
    }

    /**
     * Test of mapRow method, of class ItemRowMapper.
     *
     * @throws java.sql.SQLException
     */
    @Test
    public void testMapRow() throws SQLException {
        //given
        ResultSet resultSet = mock(ResultSet.class);
        int rowNum = 1;
        long itemPid = 1234l;
        when(resultSet.getLong("item_pid")).thenReturn(itemPid);

        //when
//        Item item = itemRowMapper.mapRow(resultSet, rowNum);

        //then
//        assertEquals(itemPid, item.getId());
    }

}

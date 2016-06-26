package net.kemitix.itunes.medialibrary.v5;

import java.sql.ResultSet;
import java.sql.SQLException;
import net.kemitix.itunes.medialibrary.items.Album;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(BlockJUnit4ClassRunner.class)
public class AlbumRowMapperTest {

    private AlbumRowMapper albumRowMapper;

    private AlbumArtistDao albumArtistDao;

    @Before
    public void setUp() {
        albumArtistDao = mock(AlbumArtistDao.class);
        albumRowMapper = new AlbumRowMapper(albumArtistDao);
    }

    /**
     * Test of mapRow method, of class AlbumRowMapper.
     *
     * @throws java.sql.SQLException
     */
    @Test
    public void testMapRow() throws SQLException {
        //given
        ResultSet resultSet = mock(ResultSet.class);
        int rowNum = 1;
        Long itemPid = 1234l;
        when(resultSet.getLong("album_pid")).thenReturn(itemPid);

        //when
        Album album = albumRowMapper.mapRow(resultSet, rowNum);

        //then
        assertEquals(itemPid, album.getId());
    }

}

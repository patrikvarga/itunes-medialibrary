package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.v5.ArtistDao;
import net.kemitix.itunes.medialibrary.v5.AlbumRowMapper;
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

    private ArtistDao artistDao;

    @Before
    public void setUp() {
        artistDao = mock(ArtistDao.class);
        albumRowMapper = new AlbumRowMapper(artistDao);
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
        long itemPid = 1234l;
        when(resultSet.getLong("album_pid")).thenReturn(itemPid);

        //when
        Album album = albumRowMapper.mapRow(resultSet, rowNum);

        //then
        assertEquals(itemPid, album.getId());
    }

}

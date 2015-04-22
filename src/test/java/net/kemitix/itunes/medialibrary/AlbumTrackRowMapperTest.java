package net.kemitix.itunes.medialibrary;

import java.sql.ResultSet;
import java.sql.SQLException;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(BlockJUnit4ClassRunner.class)
public class AlbumTrackRowMapperTest {

    private AlbumTrackRowMapper albumTrackRowMapper;

    @Before
    public void setUp() {
        albumTrackRowMapper = new AlbumTrackRowMapper();
    }

    /**
     * Test of mapRow method, of class AlbumTrackRowMapper.
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
        AlbumTrack albumTracks = albumTrackRowMapper.mapRow(resultSet, rowNum);

        //then
        assertEquals(itemPid, albumTracks.getId());
    }

}

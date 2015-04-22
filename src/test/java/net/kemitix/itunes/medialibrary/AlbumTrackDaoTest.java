package net.kemitix.itunes.medialibrary;

import java.io.File;
import java.io.IOException;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.mockito.Matchers;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

@RunWith(BlockJUnit4ClassRunner.class)
public class AlbumTrackDaoTest extends AbstractDaoTest {

    private AlbumTrackDao albumTrackDao;

    @Before
    @Override
    public void setUp() {
        albumTrackDao = new AlbumTrackDao(getJdbcTemplate(), getRowMapper(), getSql());
        setUpTest(albumTrackDao);
    }

    @Test
    public void testGetSelectByFileSql() throws IOException {
        //given
        File test = File.createTempFile("test", "file");
        test.deleteOnExit();
        JdbcTemplate jdbcTemplate = getJdbcTemplate();
        AlbumTrack albumTrack = mock(AlbumTrack.class);
        when(jdbcTemplate
                .queryForObject(Matchers.anyString(), eq(getRowMapper()), eq(test.getName())))
                .thenReturn(albumTrack);

        //when
        AlbumTrack result = albumTrackDao.find(test);

        //then
        assertThat(result, is(albumTrack));
    }

    @Test
    public void testGetSelectByFileSqlNotFound() throws IOException {
        //given
        File test = File.createTempFile("test", "file");
        test.deleteOnExit();
        JdbcTemplate jdbcTemplate = getJdbcTemplate();
        when(jdbcTemplate
                .queryForObject(Matchers.anyString(), eq(getRowMapper()), eq(test.getName())))
                .thenThrow(EmptyResultDataAccessException.class);

        //when
        AlbumTrack result = albumTrackDao.find(test);

        //then
        assertNull(result);
    }

}

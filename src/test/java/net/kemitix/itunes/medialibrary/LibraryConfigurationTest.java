package net.kemitix.itunes.medialibrary;

import com.zaxxer.hikari.HikariDataSource;
import java.io.IOException;
import javax.sql.DataSource;
import net.kemitix.spring.common.ResourceReader;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

@RunWith(BlockJUnit4ClassRunner.class)
public class LibraryConfigurationTest {

    private LibraryConfiguration configuration;

    @Before
    public void setUp() {
        configuration = new LibraryConfiguration();
    }

    /**
     * Test of jdbcTemplate method, of class LibraryConfiguration.
     */
    @Test
    public void testJdbcTemplate() {
        //given
        HikariDataSource dataSource = new HikariDataSource();

        //when
        JdbcTemplate jdbcTemplate = configuration.jdbcTemplate(dataSource);

        //then
        assertNotNull(jdbcTemplate);
    }

    /**
     * Test of dataSource method, of class LibraryConfiguration.
     */
    @Test
    public void testDataSource() {
        //when
        DataSource dataSource = configuration.dataSource();

        //then
        assertNotNull(dataSource);
    }

    /**
     * Test of albumTracksResource method, of class LibraryConfiguration.
     */
    @Test
    public void testAlbumTracksResource() {
        //when
        Resource albumTracksResource = configuration.albumTracksResource();

        //then
        assertNotNull(albumTracksResource);
    }

    /**
     * Test of albumTracksSql method, of class LibraryConfiguration.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testAlbumTracksSql() throws IOException {
        //given
        ResourceReader reader = mock(ResourceReader.class);
        Resource resource = mock(Resource.class);
        String mockSql = "mock sql";
        when(reader.read(resource)).thenReturn(mockSql);

        //when
        String albumTracksSql = configuration.albumTracksSql(reader, resource);

        //then
        verify(reader, times(1)).read(resource);
        assertEquals(albumTracksSql, mockSql);
    }

}

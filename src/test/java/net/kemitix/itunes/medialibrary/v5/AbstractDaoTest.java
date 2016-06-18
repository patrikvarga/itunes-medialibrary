package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.v5.LibraryDao;
import lombok.Getter;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@Getter
public abstract class AbstractDaoTest {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper rowMapper;
    private final SimpleJdbcInsert insertActor;
    private final String sql;
    private LibraryDao dao;

    public AbstractDaoTest() {
        this.jdbcTemplate = mock(JdbcTemplate.class);
        this.rowMapper = mock(RowMapper.class);
        this.insertActor = mock(SimpleJdbcInsert.class);
        this.sql = "select";
    }

    public abstract void setUp();

    protected void setUpTest(LibraryDao dao) {
        this.dao = dao;
    }

    @Test
    public void ensureChildTestSetupCorrectly() {
        assertNotNull("Child class missing @Before that calls setUpTest()", dao);
    }

    /**
     * Test of getSelectAllSql method, of class AlbumTracksDao.
     */
    @Test
    public void testGetSelectAllSql() {
        //when
        String result = dao.getSelectAllSql();

        //then
        assertThat(result, startsWith(sql));
    }

    /**
     * Test of getSelectByIdSql method, of class AlbumTracksDao.
     */
    @Test
    public void testGetSelectByIdSql() {
        //when
        String result = dao.getSelectByIdSql();

        //then
        assertThat(result, startsWith(sql));
    }

}

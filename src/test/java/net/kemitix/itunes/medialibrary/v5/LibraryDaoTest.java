package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.v5.LibraryDao;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@RunWith(BlockJUnit4ClassRunner.class)
public class LibraryDaoTest {

    private LibraryDao dao;

    private JdbcTemplate jdbcTemplate;
    private RowMapper rowMapper;

    private String selectAllSql;
    private String selectByIdSql;

    @Before
    public void setUp() {
        jdbcTemplate = mock(JdbcTemplate.class);
        rowMapper = mock(RowMapper.class);

        selectAllSql = "select all";
        selectByIdSql = "select by id";

        dao = new LibraryDaoImpl();
    }

    /**
     * Test of getSelectAllSql method, of class LibraryDao.
     */
    @Test
    public void testGetSelectAllSql() {
        //when
        String result = dao.getSelectAllSql();

        //then
        assertEquals(selectAllSql, result);
    }

    /**
     * Test of getSelectByIdSql method, of class LibraryDao.
     */
    @Test
    public void testGetSelectByIdSql() {
        //then
        String result = dao.getSelectByIdSql();

        //then
        assertEquals(selectByIdSql, result);
    }

    /**
     * Test of selectAll method, of class LibraryDao.
     */
    @Test
    public void testSelectAll() {
        //when
        dao.selectAll();

        //then
        verify(jdbcTemplate, times(1)).query(selectAllSql, rowMapper);
    }

    /**
     * Test of find method, of class LibraryDao.
     */
    @Test
    public void testFind() {
        //given
        long id = 2l;
        Object expected = new Object();
        when(jdbcTemplate.queryForObject(selectByIdSql, rowMapper, id))
                .thenReturn(expected);

        //when
        Object result = dao.find(id);

        //then
        verify(jdbcTemplate, times(1)).queryForObject(selectByIdSql, rowMapper, id);
        assertNotNull(result);
    }

    @Test
    public void testFindEmptyResult() {
        //given
        long id = 3l;
        when(jdbcTemplate.queryForObject(selectByIdSql, rowMapper, id))
                .thenThrow(EmptyResultDataAccessException.class);

        //when
        Object result = dao.find(id);

        //then
        verify(jdbcTemplate, times(1)).queryForObject(selectByIdSql, rowMapper, id);
        assertNull(result);
    }

    public class LibraryDaoImpl extends LibraryDao {

        public LibraryDaoImpl() {
            super(jdbcTemplate, rowMapper);
        }

        @Override
        public String getSelectAllSql() {
            return selectAllSql;
        }

        @Override
        public String getSelectByIdSql() {
            return selectByIdSql;
        }
    }

}

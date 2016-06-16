package net.kemitix.itunes.medialibrary;

import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@RunWith(BlockJUnit4ClassRunner.class)
public class WritableLibraryDaoTest {

    private WritableLibraryDao dao;

    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcInsert insertActor;
    private RowMapper rowMapper;

    @Before
    public void setUp() throws SQLException {
        jdbcTemplate = mock(JdbcTemplate.class);
        insertActor = mock(SimpleJdbcInsert.class);
        rowMapper = mock(RowMapper.class);

        dao = new WritableLibraryDao<Album>(jdbcTemplate, rowMapper, insertActor, "") {
            @Override
            String getSelectAllSql() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            String getSelectByIdSql() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
    }

    /**
     * Test of insert method, of class WritableLibraryDao.
     */
    @Test
    public void testInsert() {
        //when
        when(insertActor.executeAndReturnKey(any(SqlParameterSource.class))).thenReturn(42L);

        //then
        dao.insert(new Album());
    }

}

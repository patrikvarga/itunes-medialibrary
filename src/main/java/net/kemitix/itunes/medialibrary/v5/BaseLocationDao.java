package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.BaseLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
@DbVersion5
@Profile({"v5/ro", "v5/rw"})
class BaseLocationDao extends WritableLibraryDao<BaseLocation> {

    @Autowired
    public BaseLocationDao(JdbcTemplate jdbcTemplate, RowMapper<BaseLocation> rowMapper, SimpleJdbcInsert insertActor) {
        super(jdbcTemplate, rowMapper, insertActor, "base_location", "base_location_id");
    }

}

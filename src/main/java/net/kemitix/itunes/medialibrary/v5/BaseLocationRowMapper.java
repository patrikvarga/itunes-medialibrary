package net.kemitix.itunes.medialibrary.v5;

import java.sql.ResultSet;
import java.sql.SQLException;
import net.kemitix.itunes.medialibrary.items.BaseLocation;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
@Profile({"v5/ro", "v5/rw"})
class BaseLocationRowMapper implements RowMapper<BaseLocation> {

    @Override
    public BaseLocation mapRow(ResultSet rs, int rowNum) throws SQLException {
        final BaseLocation genre = new BaseLocation();
        genre.setId(rs.getLong("genre_id"));
        genre.setPath(rs.getString("path"));
        return genre;
    }

}

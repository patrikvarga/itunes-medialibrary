package net.kemitix.itunes.medialibrary.v5;

import java.sql.ResultSet;
import java.sql.SQLException;
import net.kemitix.itunes.medialibrary.items.ItemExtra;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
@Profile({"v5/ro", "v5/rw"})
public class ItemExtraRowMapper implements RowMapper<ItemExtra> {

    @Override
    public ItemExtra mapRow(ResultSet rs, int rowNum) throws SQLException {
        final ItemExtra extra = new ItemExtra();
        extra.setId(rs.getLong("item_pid"));
        extra.setComment(rs.getString("comment"));
        extra.setLocation(rs.getString("location"));
        extra.setTitle(rs.getString("title"));
        extra.setSortTitle(rs.getString("sort_title"));
        extra.setBpm(rs.getInt("bpm"));
        extra.setFileSize(rs.getInt("file_size"));
        extra.setTotalTimeMs(rs.getLong("total_time_ms"));
        extra.setYear(rs.getInt("year"));
        return extra;
    }

}

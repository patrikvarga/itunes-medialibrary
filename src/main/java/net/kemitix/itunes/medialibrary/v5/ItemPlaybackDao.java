package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.ItemPlayback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
@DbVersion5
@Profile({"v5/ro", "v5/rw"})
class ItemPlaybackDao extends WritableLibraryDao<ItemPlayback> {

    @Autowired
    public ItemPlaybackDao(JdbcTemplate jdbcTemplate, RowMapper<ItemPlayback> rowMapper, SimpleJdbcInsert insertActor) {
        super(jdbcTemplate, rowMapper, insertActor, "item_playback", "item_pid");
    }

}

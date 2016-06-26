package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.ItemExtra;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

@Component
@Profile({"v5/ro", "v5/rw"})
public class ItemExtraRowMapper extends BeanPropertyRowMapper<ItemExtra> {

    public ItemExtraRowMapper() {
        super(ItemExtra.class);
    }

}

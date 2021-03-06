package net.kemitix.itunes.medialibrary.v5;

import net.kemitix.itunes.medialibrary.items.Genre;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

@Component
@Profile({"v5/ro", "v5/rw"})
class GenreRowMapper extends BeanPropertyRowMapper<Genre> {

    public GenreRowMapper() {
        super(Genre.class);
    }

}

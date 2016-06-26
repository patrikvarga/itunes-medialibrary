package net.kemitix.itunes.medialibrary.v5;

import java.sql.ResultSet;
import java.sql.SQLException;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Item;
import net.kemitix.itunes.medialibrary.items.ItemExtra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

@Component
@Profile({"v5/ro", "v5/rw"})
class ItemRowMapper extends BeanPropertyRowMapper<Item> {

    private final AlbumDao albumDao;
    private final ItemArtistDao itemArtistDao;
    private final ItemExtraDao itemExtraDao;

    @Autowired
    public ItemRowMapper(AlbumDao albumDao, ItemArtistDao itemArtistDao, ItemExtraDao itemExtraDao) {
        super(Item.class);
        this.albumDao = albumDao;
        this.itemArtistDao = itemArtistDao;
        this.itemExtraDao = itemExtraDao;
    }

    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
        final Item item = super.mapRow(rs, rowNum);

        final long albumId = rs.getLong("album_pid");
        item.setAlbumPid(albumId);
        final Album album = albumDao.find(albumId);
        item.setAlbum(album);

        final long artistId = rs.getLong("item_artist_id");
        final Artist artist = itemArtistDao.find(artistId);
        item.setArtist(artist);

        final long itemId = rs.getLong("item_pid");
        final ItemExtra extra = itemExtraDao.find(itemId);
        item.setExtra(extra);

        return item;
    }

}

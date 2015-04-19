package net.kemitix.itunes.medialibrary;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class ItemRowMapper implements RowMapper<Item> {

    private final AlbumDao albumDao;

    @Autowired
    public ItemRowMapper(AlbumDao albumDao) {
        this.albumDao = albumDao;
    }

    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
        Item item = new Item();
        item.setId(rs.getLong("item_pid"));
        item.setMediaType(rs.getInt("media_type"));
        item.setTitleOrder(rs.getInt("title_order"));
        item.setTitleOrderSection(rs.getInt("title_order_section"));
        item.setItemArtistId(rs.getLong("item_artist_pid"));
        item.setItemArtistOrder(rs.getInt("item_artist_order"));
        item.setItemArtistOrderSection(rs.getInt("item_artist_order_section"));
        item.setSeriesNameOrder(rs.getInt("series_name_order"));
        item.setSeriesNameOrderSection(rs.getInt("series_name_order_section"));

        long albumId = rs.getLong("album_pid");
        item.setAlbumId(albumId);
        Album album = albumDao.find(albumId);
        item.setAlbum(album);

        item.setAlbumOrder(rs.getInt("album_order"));
        item.setAlbumOrderSection(rs.getInt("album_order_section"));
        item.setAlbumArtistId(rs.getLong("album_artist_pid"));
        item.setAlbumArtistOrder(rs.getInt("album_artist_order"));
        item.setAlbumArtistOrderSection(rs.getInt("album_artist_order_section"));
        item.setGenreId(rs.getLong("genre_id"));
        item.setGenreOrder(rs.getInt("genre_order"));
        item.setGenreOrderSection(rs.getInt("genre_order_section"));
        item.setDiscNumber(rs.getInt("disc_number"));
        item.setTrackNumber(rs.getInt("track_number"));
        item.setEpisodeSortId(rs.getLong("episode_sort_id"));
        item.setBaseLocationId(rs.getLong("base_location_id"));
        item.setRemoteLocationId(rs.getLong("remote_location_id"));
        item.setExcludeFromShuffle(rs.getInt("exclude_from_shuffle"));
        return item;
    }

}

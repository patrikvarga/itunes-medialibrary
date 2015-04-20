package net.kemitix.itunes.medialibrary;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(BlockJUnit4ClassRunner.class)
public class MediaLibraryImplTest {

    private MediaLibraryImpl mediaLibrary;

    private AlbumDao albumDao;
    private ArtistDao artistDao;
    private ItemDao itemDao;
    private AlbumTracksDao albumTracksDao;

    @Before
    public void setUp() {
        albumDao = mock(AlbumDao.class);
        artistDao = mock(ArtistDao.class);
        itemDao = mock(ItemDao.class);
        albumTracksDao = mock(AlbumTracksDao.class);
        mediaLibrary
                = new MediaLibraryImpl(albumDao, artistDao, itemDao, albumTracksDao);
    }

    @Test
    public void testGetAlbums() throws SQLException {
        //given
        List<Album> albums = new ArrayList<>();
        when(albumDao.selectAll()).thenReturn(albums);

        //when
        List<Album> result = mediaLibrary.getAlbums();

        //then
        assertThat(result, is(albums));
    }

}

package net.kemitix.itunes.medialibrary.v5;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import net.kemitix.itunes.medialibrary.items.Album;
import net.kemitix.itunes.medialibrary.items.AlbumTrack;
import net.kemitix.itunes.medialibrary.items.Artist;
import net.kemitix.itunes.medialibrary.items.Item;
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

    private MediaLibraryV5Impl mediaLibrary;

    private AlbumDao albumDao;
    private ArtistDao artistDao;
    private ItemDao itemDao;
    private GenreDao genreDao;
    private AlbumTrackDao albumTracksDao;

    @Before
    public void setUp() {
        albumDao = mock(AlbumDao.class);
        artistDao = mock(ArtistDao.class);
        itemDao = mock(ItemDao.class);
        genreDao = mock(GenreDao.class);
        albumTracksDao = mock(AlbumTrackDao.class);
        mediaLibrary
                = new MediaLibraryV5Impl(albumDao, artistDao, itemDao, albumTracksDao, genreDao);
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

    @Test
    public void testGetArtists() throws SQLException {
        //given
        List<Artist> artists = new ArrayList<>();
        when(artistDao.selectAll()).thenReturn(artists);

        //when
        List<Artist> result = mediaLibrary.getArtists();

        //then
        assertThat(result, is(artists));
    }

    @Test
    public void testGetItems() throws SQLException {
        //given
        List<Item> items = new ArrayList<>();
        when(itemDao.selectAll()).thenReturn(items);

        //when
        List<Item> result = mediaLibrary.getItems();

        //then
        assertThat(result, is(items));
    }

    @Test
    public void testGetAlbumTracks() throws SQLException {
        //given
        List<AlbumTrack> albumTracks = new ArrayList<>();
        when(albumTracksDao.selectAll()).thenReturn(albumTracks);

        //when
        List<AlbumTrack> result = mediaLibrary.getAlbumTracks();

        //then
        assertThat(result, is(albumTracks));
    }

    @Test
    public void testFindAlbumTracksByFile() throws IOException {
        //given
        AlbumTrack albumTrack = mock(AlbumTrack.class);
        File testfile = File.createTempFile("test", "file");
        when(albumTracksDao.find(testfile)).thenReturn(albumTrack);

        //when
        AlbumTrack result = mediaLibrary.findAlbumTrack(testfile);

        //then
        assertThat(result, is(albumTrack));
    }

}

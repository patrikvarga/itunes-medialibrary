package net.kemitix.itunes.medialibrary.items;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.mockito.Mockito.mock;

@RunWith(BlockJUnit4ClassRunner.class)
public class AlbumTest {

    private Album album;

    @Before
    public void setUp() {
        album = new Album();
    }

    /**
     * Test of setId method, of class Album.
     */
    @Test
    public void testSetId() {
        //given
        Long value = 1234l;

        //when
        album.setId(value);

        //then
        assertEquals(value, album.getId());
    }

    /**
     * Test of setTitle method, of class Album.
     */
    @Test
    public void testSetTitle() {
        //given
        String value = "value";

        //when
        album.setTitle(value);

        //then
        assertEquals(value, album.getTitle());
    }

    /**
     * Test of setSortTitle method, of class Album.
     */
    @Test
    public void testSetSortTitle() {
        //given
        String value = "value";

        //when
        album.setSortTitle(value);

        //then
        assertEquals(value, album.getSortTitle());
    }

    /**
     * Test of setArtist method, of class Album.
     */
    @Test
    public void testSetArtist() {
        //given
        Artist value = mock(Artist.class);

        //when
        album.setArtist(value);

        //then
        assertEquals(value, album.getArtist());
    }

    /**
     * Test of setYear method, of class Album.
     */
    @Test
    public void testSetYear() {
        //given
        int value = 1990;

        //when
        album.setYear(value);

        //then
        assertEquals(value, album.getYear());
    }

}

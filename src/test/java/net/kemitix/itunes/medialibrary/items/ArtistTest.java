package net.kemitix.itunes.medialibrary.items;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class ArtistTest {

    private Artist artist;

    @Before
    public void setUp() {
        artist = new Artist();
    }

    /**
     * Test of setId method, of class Artist.
     */
    @Test
    public void testSetId() {
        //given
        Long value = 1234l;

        //when
        artist.setId(value);

        //then
        assertEquals(value, artist.getId());
    }

    /**
     * Test of setTitle method, of class Artist.
     */
    @Test
    public void testSetTitle() {
        //given
        String value = "value";

        //when
        artist.setName(value);

        //then
        assertEquals(value, artist.getName());
    }

    /**
     * Test of setSortTitle method, of class Artist.
     */
    @Test
    public void testSetSortTitle() {
        //given
        String value = "value";

        //when
        artist.setSortName(value);

        //then
        assertEquals(value, artist.getSortName());
    }

}

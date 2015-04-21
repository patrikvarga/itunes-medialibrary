package net.kemitix.itunes.medialibrary;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class AlbumTracksTest {

    private AlbumTracks albumTracks;

    @Before
    public void setUp() {
        albumTracks = new AlbumTracks();
    }

    /**
     * Test of setAlbumArtist method, of class AlbumTracks.
     */
    @Test
    public void testSetAlbumArtist() {
        //given
        String value = "value";

        //when
        albumTracks.setAlbumArtist(value);

        //then
        assertEquals(albumTracks.getAlbumArtist(), value);
    }

    /**
     * Test of setAlbumTitle method, of class AlbumTracks.
     */
    @Test
    public void testSetAlbumTitle() {
        //given
        String value = "value";

        //when
        albumTracks.setAlbumTitle(value);

        //then
        assertEquals(albumTracks.getAlbumTitle(), value);
    }

    /**
     * Test of setTrackTitle method, of class AlbumTracks.
     */
    @Test
    public void testSetTrackTitle() {
        //given
        String value = "value";

        //when
        albumTracks.setTrackTitle(value);

        //then
        assertEquals(albumTracks.getTrackTitle(), value);
    }

    /**
     * Test of setTrackArtist method, of class AlbumTracks.
     */
    @Test
    public void testSetTrackArtist() {
        //given
        String value = "value";

        //when
        albumTracks.setTrackArtist(value);

        //then
        assertEquals(albumTracks.getTrackArtist(), value);
    }

    /**
     * Test of setYear method, of class AlbumTracks.
     */
    @Test
    public void testSetYear() {
        //given
        int value = 1980;

        //when
        albumTracks.setYear(value);

        //then
        assertEquals(albumTracks.getYear(), value);
    }

    /**
     * Test of setFileLocation method, of class AlbumTracks.
     */
    @Test
    public void testSetFileLocation() {
        //given
        String value = "value";

        //when
        albumTracks.setFileLocation(value);

        //then
        assertEquals(albumTracks.getFileLocation(), value);
    }

    /**
     * Test of setId method, of class AlbumTracks.
     */
    @Test
    public void testSetId() {
        //given
        long value = 1234l;

        //when
        albumTracks.setId(value);

        //then
        assertEquals(albumTracks.getId(), value);
    }

}

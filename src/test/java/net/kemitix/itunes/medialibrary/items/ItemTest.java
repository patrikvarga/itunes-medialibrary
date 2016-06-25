package net.kemitix.itunes.medialibrary.items;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.mockito.Mockito.mock;

@RunWith(BlockJUnit4ClassRunner.class)
public class ItemTest {

    private Item item;

    @Before
    public void setUp() {
        item = new Item();
    }

    /**
     * Test of setId method, of class Item.
     */
    @Test
    public void testSetId() {
        //given
        long value = 1234l;

        //when
        item.setId(value);

        //then
        assertEquals(value, item.getId());
    }

    /**
     * Test of setMediaType method, of class Item.
     */
    @Test
    public void testSetMediaType() {
        //given
        int value = 1234;

        //when
        item.setMediaType(value);

        //then
        assertEquals(value, item.getMediaType());
    }

    /**
     * Test of setTitleOrder method, of class Item.
     */
    @Test
    public void testSetTitleOrder() {
        //given
        int value = 1234;

        //when
        item.setTitleOrder(value);

        //then
        assertEquals(value, item.getTitleOrder());
    }

    /**
     * Test of setTitleOrderSection method, of class Item.
     */
    @Test
    public void testSetTitleOrderSection() {
        //given
        int value = 1234;

        //when
        item.setTitleOrderSection(value);

        //then
        assertEquals(value, item.getTitleOrderSection());
    }

    /**
     * Test of setItemArtistId method, of class Item.
     */
    @Test
    public void testSetItemArtistId() {
        //given
        int value = 1234;

        //when
        item.setItemArtistPid(value);

        //then
        assertEquals(value, item.getItemArtistPid());
    }

    /**
     * Test of setItemArtistOrder method, of class Item.
     */
    @Test
    public void testSetItemArtistOrder() {
        //given
        int value = 1234;

        //when
        item.setItemArtistOrder(value);

        //then
        assertEquals(value, item.getItemArtistOrder());
    }

    /**
     * Test of setItemArtistOrderSection method, of class Item.
     */
    @Test
    public void testSetItemArtistOrderSection() {
        //given
        int value = 1234;

        //when
        item.setItemArtistOrderSection(value);

        //then
        assertEquals(value, item.getItemArtistOrderSection());
    }

    /**
     * Test of setSeriesNameOrder method, of class Item.
     */
    @Test
    public void testSetSeriesNameOrder() {
        //given
        int value = 1234;

        //when
        item.setSeriesNameOrder(value);

        //then
        assertEquals(value, item.getSeriesNameOrder());
    }

    /**
     * Test of setSeriesNameOrderSection method, of class Item.
     */
    @Test
    public void testSetSeriesNameOrderSection() {
        //given
        int value = 1234;

        //when
        item.setSeriesNameOrderSection(value);

        //then
        assertEquals(value, item.getSeriesNameOrderSection());
    }

    /**
     * Test of setAlbumId method, of class Item.
     */
    @Test
    public void testSetAlbumId() {
        //given
        int value = 1234;

        //when
        item.setAlbumPid(value);

        //then
        assertEquals(value, item.getAlbumPid());
    }

    /**
     * Test of setAlbum method, of class Item.
     */
    @Test
    public void testSetAlbum() {
        //given
        Album value = mock(Album.class);

        //when
        item.setAlbum(value);

        //then
        assertEquals(value, item.getAlbum());
    }

    /**
     * Test of setAlbumOrder method, of class Item.
     */
    @Test
    public void testSetAlbumOrder() {
        //given
        int value = 1234;

        //when
        item.setAlbumOrder(value);

        //then
        assertEquals(value, item.getAlbumOrder());
    }

    /**
     * Test of setAlbumOrderSection method, of class Item.
     */
    @Test
    public void testSetAlbumOrderSection() {
        //given
        int value = 1234;

        //when
        item.setAlbumOrderSection(value);

        //then
        assertEquals(value, item.getAlbumOrderSection());
    }

    /**
     * Test of setAlbumArtistId method, of class Item.
     */
    @Test
    public void testSetAlbumArtistId() {
        //given
        int value = 1234;

        //when
        item.setAlbumArtistPid(value);

        //then
        assertEquals(value, item.getAlbumArtistPid());
    }

    /**
     * Test of setAlbumArtistOrder method, of class Item.
     */
    @Test
    public void testSetAlbumArtistOrder() {
        //given
        int value = 1234;

        //when
        item.setAlbumArtistOrder(value);

        //then
        assertEquals(value, item.getAlbumArtistOrder());
    }

    /**
     * Test of setAlbumArtistOrderSection method, of class Item.
     */
    @Test
    public void testSetAlbumArtistOrderSection() {
        //given
        int value = 1234;

        //when
        item.setAlbumArtistOrderSection(value);

        //then
        assertEquals(value, item.getAlbumArtistOrderSection());
    }

    /**
     * Test of setGenreId method, of class Item.
     */
    @Test
    public void testSetGenreId() {
        //given
        int value = 1234;

        //when
        item.setGenreId(value);

        //then
        assertEquals(value, item.getGenreId());
    }

    /**
     * Test of setGenreOrder method, of class Item.
     */
    @Test
    public void testSetGenreOrder() {
        //given
        int value = 1234;

        //when
        item.setGenreOrder(value);

        //then
        assertEquals(value, item.getGenreOrder());
    }

    /**
     * Test of setGenreOrderSection method, of class Item.
     */
    @Test
    public void testSetGenreOrderSection() {
        //given
        int value = 1234;

        //when
        item.setGenreOrderSection(value);

        //then
        assertEquals(value, item.getGenreOrderSection());
    }

    /**
     * Test of setDiscNumber method, of class Item.
     */
    @Test
    public void testSetDiscNumber() {
        //given
        int value = 1234;

        //when
        item.setDiscNumber(value);

        //then
        assertEquals(value, item.getDiscNumber());
    }

    /**
     * Test of setTrackNumber method, of class Item.
     */
    @Test
    public void testSetTrackNumber() {
        //given
        int value = 1234;

        //when
        item.setTrackNumber(value);

        //then
        assertEquals(value, item.getTrackNumber());
    }

    /**
     * Test of setEpisodeSortId method, of class Item.
     */
    @Test
    public void testSetEpisodeSortId() {
        //given
        int value = 1234;

        //when
        item.setEpisodeSortId(value);

        //then
        assertEquals(value, item.getEpisodeSortId());
    }

    /**
     * Test of setBaseLocationId method, of class Item.
     */
    @Test
    public void testSetBaseLocationId() {
        //given
        int value = 1234;

        //when
        item.setBaseLocationId(value);

        //then
        assertEquals(value, item.getBaseLocationId());
    }

    /**
     * Test of setRemoteLocationId method, of class Item.
     */
    @Test
    public void testSetRemoteLocationId() {
        //given
        int value = 1234;

        //when
        item.setRemoteLocationId(value);

        //then
        assertEquals(value, item.getRemoteLocationId());
    }

    /**
     * Test of setExcludeFromShuffle method, of class Item.
     */
    @Test
    public void testSetExcludeFromShuffle() {
        //given
        int value = 1234;

        //when
        item.setExcludeFromShuffle(value);

        //then
        assertEquals(value, item.getExcludeFromShuffle());
    }

}

package net.kemitix.itunes.medialibrary;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class ITunesMediaLibraryTest {

    /**
     * Test of createLibrary method, of class ITunesMediaLibrary.
     */
    @Test
    public void testCreateLibrary() {
        //when
        MediaLibrary library = ITunesMediaLibrary.createLibrary();

        //then
        assertNotNull(library);
    }

    @Test
    public void testInstantiate() {
        //when
        ITunesMediaLibrary factory = new ITunesMediaLibrary();

        //then
        assertNotNull(factory);
    }

}

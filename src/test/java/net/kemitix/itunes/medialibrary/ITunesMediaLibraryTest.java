package net.kemitix.itunes.medialibrary;

import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class ITunesMediaLibraryTest {

    private MediaLibrary library;

    private String mediaFile;

    @Before
    public void setUp() {
        mediaFile = "src/test/resources/MediaLibrary.sqlitedb";
        library = ITunesMediaLibrary.createV5Library(mediaFile);
    }

    /**
     * Test of createLibrary method, of class ITunesMediaLibrary.
     */
    @Test
    public void testCreateLibrary() {
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

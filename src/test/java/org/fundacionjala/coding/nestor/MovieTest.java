package org.fundacionjala.coding.nestor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test Movie class.
 */
public class MovieTest {

    /**
     * Test assert if title get correct string.
     */
    @Test
    public void getTitle() {
        Movie newMovie = new RegularMovie("Test Movie");
        assertEquals("Test Movie", newMovie.getTitle());
    }
}

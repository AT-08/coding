package org.fundacionjala.coding.nestor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void getTitle() {
        Movie newMovie = new RegularMovie("Test Movie");
        assertEquals("Test Movie", newMovie.getTitle());
    }
}
package org.fundacionjala.coding.rodrigo.movierefactor;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Test for the Movie's class.
 */
public class MovieTest {
    private Movie movie1;
    private Movie movie2;
    private Movie movie3;
    private static final int FOUR = 4;
    private static final int TEN = 10;
    private static final int ONE = 1;

    /**
     * Setting the movies.
     */
    @Before
    public void setUp() {
        movie1 = new MovieRegular("The ducks", FOUR);
        movie2 = new MovieChildrens("The papers", TEN);
        movie3 = new MovieNewRelease("The FF", FOUR);
    }

    /**
     * Test for calculate the charge.
     */
    @Test
    public void calculateCharge() {
        Movie movie4 = new MovieRegular("The test", ONE);
        Movie movie5 = new MovieChildrens("The test revenge", ONE);
        Movie movie6 = new MovieRegular("The test coming soon", ONE);
        final double zero = 0.0;
        final double delta = 0;
        assertNotEquals(zero, movie1.calculateCharge(), delta);
        assertNotEquals(zero, movie2.calculateCharge(), delta);
        assertNotEquals(zero, movie3.calculateCharge(), delta);
        assertNotEquals(zero, movie4.calculateCharge(), delta);
        assertNotEquals(zero, movie5.calculateCharge(), delta);
        assertNotEquals(zero, movie6.calculateCharge(), delta);

    }

    /**
     * Getter of title.
     */
    @Test
    public void getTitle() {
        assertEquals("The ducks", movie1.getTitle());
        assertEquals("The papers", movie2.getTitle());
        assertEquals("The FF", movie3.getTitle());
    }

    /**
     * Getter of days.
     */
    @Test
    public void getDaysRented() {
        assertEquals(FOUR, movie1.getDaysRented());
        assertEquals(TEN, movie2.getDaysRented());
        assertEquals(FOUR, movie3.getDaysRented());
    }
}

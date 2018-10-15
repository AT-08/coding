package org.fundacionjala.coding.abel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class MovieTest {
    private Movie movie1;
    private Movie movie2;
    private Movie movie3;
    private static final int FOUR = 4;
    private static final int TEN = 10;
    private static final int ONE = 1;

    @Before
    public void setUp() {
        movie1 = new Regular("The ducks", FOUR);
        movie2 = new Childrens("The papers", TEN);
        movie3 = new NewRelease("The FF", FOUR);
    }
    @Test
    public void calculateCharge() {
        Movie movie4 = new Regular("The test", ONE);
        Movie movie5 = new Childrens("The test revenge", ONE);
        Movie movie6 = new Regular("The test coming soon", ONE);
        final double zero = 0.0;
        final double delta = 0;
        assertNotEquals(zero, movie1.getCharge(), delta);
        assertNotEquals(zero, movie2.getCharge(), delta);
        assertNotEquals(zero, movie3.getCharge(), delta);
        assertNotEquals(zero, movie4.getCharge(), delta);
        assertNotEquals(zero, movie5.getCharge(), delta);
        assertNotEquals(zero, movie6.getCharge(), delta);

    }

}
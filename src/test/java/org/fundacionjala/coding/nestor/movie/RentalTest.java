package org.fundacionjala.coding.nestor.movie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Rental test class.
 */
public class RentalTest {
    private Rental rental;
    private Movie up;
    private Movie passengers;

    /**
     * Method to setup before testing.
     */
    @Before
    public void setup() {
        final int five = 5;

        rental = new Rental(five);
        up = new ChildrenMovie("Up");
        passengers = new NewReleaseMovie("Passengers");
    }

    /**
     * Method to test add a movie.
     */
    @Test
    public void addMovie() {
        final int one = 1;
        rental.addMovie(up);
        assertEquals(one, rental.getMoviesList().toArray().length);
    }

    /**
     * Method to test calculate charge to rental movies.
     */
    @Test
    public void calculateCharge() {
        final double price = 4.5;
        rental.addMovie(up);
        assertEquals(price, rental.calculateCharge(), 0);
    }

    /**
     * Method to test calculate rental points to rental movies.
     */
    @Test
    public void calculateRenterPoints() {
        final int points = 1;
        rental.addMovie(up);
        assertEquals(points, rental.calculateRenterPoints());
    }

    /**
     * Method to test get length movies list.
     */
    @Test
    public void getMoviesList() {
        final int two = 2;
        rental.addMovie(up);
        rental.addMovie(passengers);
        assertEquals(two, rental.getMoviesList().toArray().length);
    }
}

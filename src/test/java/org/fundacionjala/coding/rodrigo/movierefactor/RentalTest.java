package org.fundacionjala.coding.rodrigo.movierefactor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Test for the Rental class.
 */
public class RentalTest {
    private Rental rental;

    /**
     * Setting the rental.
     */
    @Before
    public void setUp() {
        final int four = 4;
        final int ten = 10;
        Customer customer = new Customer("Juan");
        Movie movie1 = new MovieRegular("The ducks", four);
        Movie movie2 = new MovieNewRelease("The papers", ten);
        Movie movie3 = new MovieChildrens("The FF", four);
        Movie movie4 = new MovieNewRelease("The Extra test", 1);
        customer.addMovie(movie1);
        customer.addMovie(movie2);
        customer.addMovie(movie3);
        customer.addMovie(movie4);
        rental = new Rental(customer);
        rental.makeBill();
    }

    /**
     * Test for calculate the amount.
     */
    @Test
    public void calculateAmount() {
        final int expected = 40;
        final int delta = 2;
        assertEquals(expected, rental.getTotalAmount(), delta);
    }

    /**
     * Test for print the bill.
     */
    @Test
    public void getBill() {
        assertNotEquals("", rental.getBill());
    }

    /**
     * Test calculates the FRP.
     */
    @Test
    public void calculateFrequentRenterPoints() {
        final int five = 5;
        assertEquals(five, rental.getTotalFRP());
    }
}

package org.fundacionjala.coding.nestor.movie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test customer class.
 */
public class CustomerTest {
    private Customer customer;
    private Movie kingdomOfHeaven;
    private Movie up;
    private Movie theBeastAndTheBeauty;
    private Movie transylvaniaHotel;

    /**
     * Method to setup before testing.
     */
    @Before
    public void setup() {
        customer = new Customer("Adriana");
        kingdomOfHeaven = new RegularMovie("Kingdom of Heaven");
        up = new ChildrenMovie("Up");
        theBeastAndTheBeauty = new ChildrenMovie("The Beast and the Beauty");
        transylvaniaHotel = new ChildrenMovie("Transylvania Hotel");
    }

    /**
     * Method to test get name from customer.
     */
    @Test
    public void getCustomerName() {
        assertEquals("Adriana", customer.getCustomerName());
    }

    /**
     * Method to test create rental class.
     */
    @Test
    public void createRental() {
        final int three = 3;
        customer.createRental(three);
        customer.addMovie(kingdomOfHeaven);
        customer.addMovie(up);
        customer.addMovie(theBeastAndTheBeauty);
        assertEquals(three, customer.getMoviesList().toArray().length);
    }

    /**
     * Method to add movie into rental list.
     */
    @Test
    public void addMovie() {
        final int one = 1;
        customer.createRental(one);
        customer.addMovie(transylvaniaHotel);
        assertEquals(one, customer.getMoviesList().toArray().length);
    }
}

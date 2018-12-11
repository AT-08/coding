package org.fundacionjala.coding.rodrigo.movierefactor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Test for Customer class.
 */
public class CustomerTest {
    private Customer customer;

    /**
     * Setting the customer.
     */
    @Before
    public void setUp() {
        customer = new Customer("Juan");

    }

    /**
     * Test for getter of the name of the customer.
     */
    @Test
    public void getName() {
        assertEquals("Juan", customer.getName());
    }

    /**
     * Test for getter of the movies.
     */
    @Test
    public void getMovies() {
        final int five = 5;
        final int three = 3;
        customer.addMovie(new MovieRegular("The Revenant", five));
        customer.addMovie(new MovieRegular("The Pepe", five));
        customer.addMovie(new MovieRegular("The cloud", five));
        assertEquals(three, customer.getMovies().toArray().length);
    }
}

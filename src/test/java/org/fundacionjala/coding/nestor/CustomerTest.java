package org.fundacionjala.coding.nestor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;

    @Test
    public void testCustomerName() {
        customer = new Customer("Customer Name");
        assertEquals(customer.getName(), "Customer Name");
    }

    @Test
    public void testAmountForOneMovieRental() {
        customer = new Customer("Customer Name");
        Rental terminator = new Rental(new Movie("Terminator", 0), 2);
        customer.addRental(terminator);
        assertEquals(customer.getAmountFor(terminator), 2.0, 0.0);
    }

    @Test
    public void testAmountForManyMovieRentals() {
        customer = new Customer("Customer Name");
        Rental kingOfHeaven = new Rental(new Movie("King Of Heaver", 1), 3);
        customer.addRental(kingOfHeaven);
        Rental lastMohicans = new Rental(new Movie("Last Mohicans", 2), 2);
        customer.addRental(lastMohicans);
        Rental hardToDie = new Rental(new Movie("Hard to die", 0), 4);
        customer.addRental(hardToDie);
        assertEquals(customer.getTotalAmount(), 15.5, 0.0);
    }

}

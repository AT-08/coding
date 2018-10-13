package org.fundacionjala.coding;


import org.fundacionjala.coding.dennis.MovieChildren;
import org.fundacionjala.coding.dennis.Movie;
import org.fundacionjala.coding.dennis.MovieNewRelease;
import org.fundacionjala.coding.dennis.PriceCode;
import org.fundacionjala.coding.dennis.Rental;
import org.fundacionjala.coding.dennis.Customer;
import org.fundacionjala.coding.dennis.MovieRegular;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class TestCaseRental {

    public static final double LIMIT = 0.01;
    public static final int DAYSRENTED = 3;
    public static final int DAYSRENTED4 = 4;

    /**
     *
     */
    @Test
    public void testPriceMovieRentalAtmPass() {
        Rental rent = new Rental(new MovieNewRelease("Isle of dogs"), DAYSRENTED);
        final float expected = 9.0f;
        assertEquals(expected, rent.calculatePriceMovie(), LIMIT);
    }

    /**
     *
     */
    @Test
    public void testFrequentRenterPointsAtmPass() {
        Rental rent = new Rental(new MovieNewRelease("Infinity War"), DAYSRENTED);
        int expected = 2;
        assertEquals(expected, rent.calculateFrequentRenterPoints());
    }

    /**
     *
     */
    @Test
    public void testGetPriceCodeMoviePass() {
        Movie mov = new MovieNewRelease("Annihilation");
        final float expected = 3.0f;
        assertEquals(expected, mov.getPriceCode().getValue(), LIMIT);
    }

    /**
     *
     */
    @Test
    public void testSetPriceCodeMoviePass() {
        Movie mov = new MovieNewRelease("Annihilation");
        mov.setpriceCode(PriceCode.REGULAR);
        final float expected = 2.0f;
        assertEquals(expected, mov.getPriceCode().getValue(), LIMIT);
    }

    /**
     *
     */
    @Test
    public void testGetTitleMoviePass() {
        Movie mov = new MovieNewRelease("Annihilation");
        String expected = "Annihilation";
        assertEquals(expected, mov.getTitle());
    }

    /**
     *
     */
    @Test
    public void testReturnFrequentPointsMoviePass() {
        Movie mov = new MovieChildren("Ice Age");
        int expected = 1;
        assertEquals(expected, mov.returnFrequentPoints(DAYSRENTED));
    }

    /**
     *
     */
    @Test
    public void testAddRentalCustomerPass() {
        final int daysRented = 7;
        Customer c = new Customer("Tester");
        c.addRental(new Rental(new MovieRegular("Reservoir dogs"), daysRented));
        c.addRental(new Rental(new MovieRegular("Pulp Fiction"), daysRented));
        c.addRental(new Rental(new MovieRegular("Inglorious Bastards"), daysRented));
        c.addRental(new Rental(new MovieRegular("Django Unchained"), daysRented));
        c.addRental(new Rental(new MovieRegular("Kill Bill"), daysRented));
        final int expected = 5;
        assertEquals(expected, c.numRentalElements());
    }

    /**
     *
     */
    @Test
    public void testGetNameCustomerPass() {
        Customer c = new Customer("Tester");
        String expected = "Tester";
        assertEquals(expected, c.getName());
    }

    /**
     *
     */
    @Test
    public void testCustomerName() {
        Customer c = new Customer("Tester");
        String expected = "Rental Record for ".concat(c.getName());
        assertEquals(expected, c.customerName());
    }

    /**
     *
     */
    @Test
    public void testMovieAndPrice() {
        Customer c = new Customer("Tester");
        Rental rent = new Rental(new MovieRegular("Fargo"), DAYSRENTED4);
        c.addRental(rent);
        final float price = 6.0f;
        String expected = rent.getMovie().getTitle().concat("\t\t").concat(String.valueOf(price));
        assertEquals(expected, c.movieAndPrice(rent, price));
    }

    /**
     *
     */
    @Test
    public void testCalculateAmountMovieChildrenPass() {
        Movie mov = new MovieChildren("Tarzan");
        final double res = 3.0;
        assertEquals(res, mov.calculateAmount(DAYSRENTED4), LIMIT);
    }

    /**
     *
     */
    @Test
    public void testReturnFrequentPointsMovieNewReleasePass() {
        Movie mov = new MovieNewRelease("Widows");
        final int expected = 2;
        assertEquals(expected, mov.returnFrequentPoints(DAYSRENTED));
    }

    /**
     *
     */
    @Test
    public void testCalculateAmountMovieNewReleasePass() {
        Movie mov = new MovieNewRelease("A star is born");
        final double res = 12.0;
        assertEquals(res, mov.calculateAmount(DAYSRENTED4), LIMIT);
    }

    /**
     *
     */
    @Test
    public void testCalculateAmountMovieRegularPass() {
        final int daysRented = 5;
        Movie mov = new MovieRegular("Sing Street");
        final float res = 6.5f;
        assertEquals(res, mov.calculateAmount(daysRented), LIMIT);
    }

    /**
     *
     */
    @Test
    public void testGetDaysRentedRentalPass() {
        Rental rent = new Rental(new MovieChildren("Inside Out"), DAYSRENTED);
        final int expected = 3;
        assertEquals(expected, rent.getDaysRented());
    }

    /**
     *
     */
    @Test
    public void testGetMovieRentalPass() {
        Rental rent = new Rental(new MovieNewRelease("Incredibles 2"), DAYSRENTED);
        String expected = "Incredibles 2";
        assertEquals(expected, rent.getMovie().getTitle());
    }
}

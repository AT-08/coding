package org.fundacionjala.coding.dennis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class TestCaseRental {

    public static final double LIMIT = 0.01;
    public static final int DAYSRENTED = 3;
    public static final int DAYSRENTED4 = 4;
    public static final int FPOINTS = 6;
    public static final float TESTAMOUNT = 26.0f;

    /**
     *
     */
    @Test
    public void testPriceMovieRentalPrincipal() {
        Customer customer = new Customer("Dennis");
        customer.addRental(new Rental(new MovieNewRelease("First Man"), 2));
        customer.addRental(new Rental(new MovieRegular("Frost Vs Nixon"), 2));
        customer.addRental(new Rental(new MovieChildren("UP"), 2));
        customer.addRental(new Rental(new MovieNewRelease("The favourite"), DAYSRENTED));
        assertEquals("Dennis Price: 18.5. FR points: 6", customer.statement());
    }

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
        Movie mov = new MovieNewRelease("10 Cloverfield Lane");
        mov.setpriceCode(PriceCode.REGULAR);
        final float expected = 2.0f;
        assertEquals(expected, mov.getPriceCode().getValue(), LIMIT);
    }

    /**
     *
     */
    @Test
    public void testGetTitleMoviePass() {
        Movie mov = new MovieNewRelease("Gattaca");
        String expected = "Gattaca";
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
        Customer c = new Customer("Tarantino");
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
    public void testCustomerPass() {
        Customer c = new Customer("Andres");
        String expected = "Andres";
        assertEquals(expected, c.getName());
    }

    /**
     *
     */
    @Test
    public void testGetCustomerName() {
        Customer c = new Customer("Luis");
        String expected = c.getName();
        assertEquals(expected, c.customerName());
    }

    /**
     *
     */
    @Test
    public void testMovieAndPrice() {
        Customer c = new Customer("Xavier");
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
        Movie mov = new MovieNewRelease("The house that Jack built");
        final int expected = 2;
        assertEquals(expected, mov.returnFrequentPoints(DAYSRENTED));
    }

    /**
     *
     */
    @Test
    public void testReturnFrequentPointsMovieNewReleasePass1() {
        Movie mov = new MovieNewRelease("The house that Jack built");
        final int expected = 1;
        assertEquals(expected, mov.returnFrequentPoints(1));
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

    /**
     *
     */
    @Test
    public void testFrequentPoints() {
        Customer customer = new Customer("Ramon");
        customer.addRental(new Rental(new MovieNewRelease("Everybody knows"), 2));
        customer.addRental(new Rental(new MovieRegular("Black Swan"), 2));
        customer.addRental(new Rental(new MovieChildren("How to train your dragon"), 2));
        customer.addRental(new Rental(new MovieNewRelease("Roma"), DAYSRENTED));
        assertEquals(FPOINTS, customer.frequentPoints());
    }

    /**
     *
     */
    @Test
    public void testAmount() {
        Customer customer = new Customer("Eduardo");
        customer.addRental(new Rental(new MovieNewRelease("Dogman"), 2));
        customer.addRental(new Rental(new MovieRegular("Paprika"), 2));
        customer.addRental(new Rental(new MovieNewRelease("Cold War"), DAYSRENTED));
        customer.addRental(new Rental(new MovieNewRelease("Burning"), DAYSRENTED));
        assertEquals(TESTAMOUNT, customer.amount(), LIMIT);
    }
}

package org.fundacionjala.coding.dennis;

import java.util.ArrayList;

/**
 *
 */
public class Customer {
    private String name;
    private ArrayList<Rental> rentals = new ArrayList(1);

    /**
     *
     * @param name asigned.
     */
    public Customer(final String name) {
        this.name = name;
    }

    /**
     *
     * @param arg add rental.
     */
    public void addRental(final Rental arg) {
        rentals.add(arg);
    }

    /**
     *
     * @return how many rentals.
     */
    public int numRentalElements() {
        return rentals.size();
    }

    /**
     *
     * @return give me the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Calculus of data.
     */
    public String statement() {
        float totalAmount = 0.0f;
        float thisPrice;
        int frequentRenterPoints = 0;
        int thisFrequentRenterPoints;
        for (Rental eachRental : rentals) {
            thisPrice = eachRental.calculatePriceMovie();
            thisFrequentRenterPoints = eachRental.calculateFrequentRenterPoints();
            frequentRenterPoints = frequentRenterPoints + thisFrequentRenterPoints;
            totalAmount += thisPrice;
        }
        return customerName().concat(" Amount owed: ").concat(String.valueOf(totalAmount).concat(" .Frequent renter points: ")
                        .concat(String.valueOf(frequentRenterPoints)));
    }

    /**
     *
     * @return give me the name.
     */
    public String customerName() {
        return getName();
    }

    /**
     *
     * @param each Rental
     * @param thisAmount price.
     * @return movie and price.
     */
    public String movieAndPrice(final Rental each, float thisAmount) {
        return each.getMovie().getTitle().concat("\t\t").concat(String.valueOf(thisAmount));
    }
}

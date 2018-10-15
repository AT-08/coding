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
     *
     * @return Informacion de la renta.
     */
    public String statement() {
        return customerName().concat(" Price: ").concat(String.valueOf(amount()).concat(". FR points: ")
                        .concat(String.valueOf(frequentPoints())));
    }

    /**
     *
     * @return Frequent rented points bonus.
     */
    public int frequentPoints() {
        int frequentRenterPoints = 0;
        int thisFrequentRenterPoints;
        for (Rental rented : rentals) {
            thisFrequentRenterPoints = rented.calculateFrequentRenterPoints();
            frequentRenterPoints += thisFrequentRenterPoints;
        }
        return frequentRenterPoints;
    }


    /**
     *
     * @return Total Amount.
     */
    public float amount() {
        float totalAmount = 0.0f;
        float thisPrice;
        for (Rental rented : rentals) {
            thisPrice = rented.calculatePriceMovie();
            totalAmount += thisPrice;
        }
        return totalAmount;
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

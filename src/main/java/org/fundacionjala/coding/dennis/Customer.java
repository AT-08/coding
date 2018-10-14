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
    public void statement() {
        float totalAmount = 0.0f;
        float thisPrice;
        int frequentRenterPoints = 0;
        int thisFrequentRenterPoints;
        System.out.println(customerName());
        for (Rental eachRental : rentals) {
            thisPrice = eachRental.calculatePriceMovie();
            System.out.println(movieAndPrice(eachRental, thisPrice));
            thisFrequentRenterPoints = eachRental.calculateFrequentRenterPoints();
            frequentRenterPoints = frequentRenterPoints + thisFrequentRenterPoints;
            totalAmount += thisPrice;
        }
        System.out.println("Amount owed is ".concat(String.valueOf(totalAmount)));
        System.out.print("You earned ".concat(String.valueOf(frequentRenterPoints)));
        System.out.println(" frequent renter points");
    }

    /**
     *
     * @return give me the name.
     */
    public String customerName() {
        return "Rental Record for ".concat(getName());
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

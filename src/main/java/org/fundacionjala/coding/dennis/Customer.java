package org.fundacionjala.coding.dennis;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 */
public class Customer {
    private String name;
    private Vector rentals = new Vector(1, 1);

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
        rentals.addElement(arg);
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
     * @return how big is the bag.
     */
    public int capacityRentalElements() {
        return rentals.capacity();
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
        Enumeration rentals = this.rentals.elements();
        System.out.println(customerName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            thisPrice = each.calculatePriceMovie();
            System.out.println(movieAndPrice(each, thisPrice));
            thisFrequentRenterPoints = each.calculateFrequentRenterPoints();
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

package org.fundacionjala.coding.rodrigo.movierefactor;

/**
 * Rental for the movies.
 */
public final class Rental {
    private Customer customer;
    private String bill;
    private double totalAmount;
    private int totalFRP;

    /**
     * Constructor.
     *
     * @param customer Input customer.
     */
    Rental(final Customer customer) {
        this.customer = customer;
    }

    /**
     * Calculates the total amount.
     *
     * @return The total amount in double.
     */
    public double calculateAmount() {
        for (Movie movie : customer.getMovies()) {
            totalAmount += movie.calculateCharge();
        }
        return totalAmount;
    }

    /**
     * Getter for totalAmount.
     *
     * @return total.
     */
    double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Calculates the Frequent renter points.
     *
     * @return The Frequent renter points Integer.
     */
    public int calculateFrequentRenterPoints() {
        for (Movie movie : customer.getMovies()) {
            totalFRP += movie.getFrequentRenterPoints();
        }
        return totalFRP;
    }

    /**
     * Makes the bill for print.
     */
    public void makeBill() {
        StringBuilder builder = new StringBuilder(String.format("Rental Record for: %s %n", customer.getName()));
        for (Movie movie : customer.getMovies()) {
            builder.append(String.format("\t%s\t", movie.getTitle()));
        }
        builder.append(String.format("Amount owed is %s %n", String.valueOf(calculateAmount())));
        builder.append(String.format("You earned %s frequent renter points %n",
                String.valueOf(calculateFrequentRenterPoints())));
        this.bill = builder.toString();
    }

    /**
     * Getter for the bill.
     *
     * @return bill.
     */
    public String getBill() {
        return bill;
    }

    /**
     * For the frequent renter points.
     *
     * @return the totalFRP.
     */
    int getTotalFRP() {
        return totalFRP;
    }
}

package org.fundacionjala.coding.rodrigo.movierefactor;

/**
 * Subclass of Movie.
 */
public class MovieChildrens extends Movie {
    private int frequentRenterPoints;

    /**
     * Constructor.
     *
     * @param title      input
     * @param daysRented input
     */
    public MovieChildrens(final String title, final int daysRented) {
        super(title, daysRented);
        frequentRenterPoints = 1;
    }

    @Override
    public double calculateCharge() {
        final double initial = 1.5;
        final int three = 3;
        final double factor = 1.5;
        charge += initial;
        if (getDaysRented() > three) {
            charge += (getDaysRented() - three) * factor;
        }
        return charge;
    }

    @Override
    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }


}

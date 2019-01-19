package org.fundacionjala.coding.rodrigo.movierefactor;

/**
 * Subclass of Movie.
 */
public class MovieNewRelease extends Movie {
    private int frequentRenterPoints;

    /**
     * Constructor.
     *
     * @param title      input.
     * @param daysRented input.
     */
    MovieNewRelease(final String title, final int daysRented) {
        super(title, daysRented);
        frequentRenterPoints = 1;
    }

    @Override
    double calculateCharge() {
        final int factor = 3;
        charge += getDaysRented() * factor;
        return charge;
    }

    @Override
    public int getFrequentRenterPoints() {
        if (getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}

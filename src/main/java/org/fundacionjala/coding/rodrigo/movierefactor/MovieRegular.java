package org.fundacionjala.coding.rodrigo.movierefactor;

/**
 * Regular Movie.
 */
public class MovieRegular extends Movie {
    private int frequentRenterPoints;

    /**
     * Constructor.
     *
     * @param title      input.
     * @param daysRented input.
     */
    public MovieRegular(final String title, final int daysRented) {
        super(title, daysRented);
        frequentRenterPoints = 1;
    }

    @Override
    public double calculateCharge() {
        final double factor = 1.5;
        final int two = 2;
        this.charge += two;
        if (getDaysRented() > two) {
            this.charge += (getDaysRented() - two) * factor;
        }
        return charge;
    }

    @Override
    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }
}

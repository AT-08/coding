package org.fundacionjala.coding.nestor.movie;

/**
 * Implement movies children kind.
 */
public class ChildrenMovie extends Movie {
  private static final double PRICE = 1.5;

  /**
   * Constructor.
   *
   * @param title type string.
   */
  public ChildrenMovie(final String title, final int daysRented) {
    super(title, daysRented);
  }

  /**
   * Method to get price for this kind of movies.
   *
   * @param daysRented type integer.
   * @return Price.
   */
  @Override
  public double getPrice() {
    if (daysRented > DAYS) {
      return PRICE + (daysRented - DAYS) * FACTOR;
    }

    return PRICE;
  }

  @Override
  public int getRenterPoints() {
    return RENTER_POINTS;
  }
}

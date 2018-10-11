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
  public ChildrenMovie(final String title) {
    super(title);
  }

  /**
   * Method to get price for this kind of movies.
   *
   * @return Price.
   */
  @Override
  public double getPrice() {
    return daysRented > DAYS ? PRICE + (daysRented - DAYS) * FACTOR : PRICE;
  }

  /**
   * Method to get renter points.
   *
   * @return renter points.
   */
  @Override
  public int getRenterPoints() {
    return RENTER_POINTS;
  }
}

package org.fundacionjala.coding.nestor.movie;

/**
 * Implement regular kind movie.
 */
public class RegularMovie extends Movie {
  private static final double PRICE = 2;

  /**
   * Constructor .
   *
   * @param title type string.
   * @param daysRented type integer.
   */
  public RegularMovie(final String title, final int daysRented) {
    super(title, daysRented);
  }

  /**
   * Method to implement get price for this kind movie.
   *
   * @return price for this kind movie.
   */
  @Override
  public double getPrice() {
    if (daysRented > DAYS) {
      return PRICE + (daysRented - DAYS) * FACTOR;
    }

    return PRICE;
  }

  /**
   * Method to implement get renter points for this kind movie.
   *
   * @return renter points.
   */
  @Override
  public int getRenterPoints() {
    return RENTER_POINTS;
  }
}

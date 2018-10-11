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
   */
  public RegularMovie(final String title) {
    super(title);
  }

  /**
   * Method to implement get price for this kind movie.
   *
   * @return price for this kind movie.
   */
  @Override
  public double getPrice() {
    return daysRented > DAYS ? PRICE + (daysRented - DAYS) * FACTOR : PRICE;
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

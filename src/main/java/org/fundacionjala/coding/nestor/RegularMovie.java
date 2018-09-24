package org.fundacionjala.coding.nestor;

/**
 * Implement regular kind movie.
 */
public class RegularMovie extends Movie {
  public static final double PRICE = 2;

  /**
   * Constructor.
   *
   * @param title type string.
   */
  public RegularMovie(final String title) {
    super(title, MovieType.REGULAR);
  }

  /**
   * Method to implemente get price for this kind movie.
   *
   * @param daysRented type integer.
   * @return price for this kind movie.
   */
  @Override
  public double getPrice(int daysRented) {
    if (daysRented > DAYS) {
      return PRICE + (daysRented - DAYS) * FACTOR;
    }

    return PRICE;
  }
}

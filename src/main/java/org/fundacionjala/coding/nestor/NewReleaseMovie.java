package org.fundacionjala.coding.nestor;

/**
 * Implement new release kind movies.
 */
public class NewReleaseMovie extends Movie {

  /**
   * Constructor.
   *
   * @param title type string.
   */
  public NewReleaseMovie(final String title) {
    super(title, MovieType.NEW_RELEASE);
  }

  /**
   * Implement getter price for new release kind movie.
   *
   * @param daysRented type integer.
   * @return price to rent this movie.
   */
  @Override
  public double getPrice(int daysRented) {
    return (double)(daysRented * DAYS);
  }

}

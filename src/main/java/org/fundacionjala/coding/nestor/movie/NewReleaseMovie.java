package org.fundacionjala.coding.nestor.movie;

/**
 * Implement new release kind movies.
 */
public class NewReleaseMovie extends Movie {

  /**
   * Construnctor.
   *
   * @param title type string.
   * @param daysRented type integer.
   */
  public NewReleaseMovie(final String title, final int daysRented) {
    super(title, daysRented);
  }

  /**
   * Implement getter price for new release kind movie.
   *
   * @return price to rent this movie.
   */
  @Override
  public double getPrice() {
    return (double) (daysRented * DAYS);
  }

  /**
   * Implement getter renter points for new release kind movie.
   *
   * @return renter points.
   */
  @Override
  public int getRenterPoints() {
    if (daysRented > 1) {
      return RENTER_POINTS + 1;
    }
    return RENTER_POINTS;
  }

}

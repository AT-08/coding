package org.fundacionjala.coding.nestor.movie;

/**
 * Implement new release kind movies.
 */
public class NewReleaseMovie extends Movie {

  /**
   * Construnctor.
   *
   * @param title type string.
   */
  public NewReleaseMovie(final String title) {
    super(title);
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
    return daysRented > 1 ? RENTER_POINTS + 1 : RENTER_POINTS;
  }

}

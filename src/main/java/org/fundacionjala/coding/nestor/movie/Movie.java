package org.fundacionjala.coding.nestor.movie;

/**
 * This abstract Movie Class allow implement get Price depends on Movie Type.
 */
public abstract class Movie {
  protected static final double FACTOR = 1.5;
  protected static final int DAYS = 3;
  protected static final int RENTER_POINTS = 1;
  String title;
  int daysRented;

  /**
   * Constructor.
   *
   * @param title type string.
   * @param movieType type MovieType.
   */
  public Movie(final String title, final int daysRented) {
    this.title = title;
    this.daysRented = daysRented;
  }

  /**
   * Method to get title.
   *
   * @return title of the movie.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Abstract method. To implement get price depends on kind of movie.
   *
   * @param daysRented type integer.
   * @return price type double.
   */
  public abstract double getPrice();

  public abstract int getRenterPoints();

}

package org.fundacionjala.coding.nestor.movie;

/**
 * This abstract Movie Class allow implement get Price depends on Movie Type.
 */
public abstract class Movie {
  protected static final double FACTOR = 1.5;
  protected static final int DAYS = 3;
  protected static final int RENTER_POINTS = 1;
  protected String title;
  protected int daysRented;

  /**
   * Constructor.
   *
   * @param title type string.
   */
  public Movie(final String title) {
    this.title = title;
  }

  /**
   * Set days rental.
   *
   * @param daysRented type integer.
   */
  public void setDaysRented(final int daysRented) {
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
   * Abstract method to implement get price depends on kind of movie.
   *
   * @return price type double.
   */
  public abstract double getPrice();

  /**
   * Abstract method to implement get renter points.
   *
   * @return renter points.
   */
  public abstract int getRenterPoints();

}

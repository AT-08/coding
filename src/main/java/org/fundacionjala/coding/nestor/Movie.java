package org.fundacionjala.coding.nestor;

/**
 * This abstract Movie Class allow implement get Price depends on Movie Type.
 */
public abstract class Movie {
  protected static final double FACTOR = 1.5;
  protected static final int DAYS = 3;
  private String title;
  private MovieType movieType;

  /**
   * Constructor.
   *
   * @param title type string.
   * @param movieType type MovieType.
   */
  public Movie(final String title, final MovieType movieType) {
    this.title = title;
    this.movieType = movieType;
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
   * Method to get movie type.
   *
   * @return movie type.
   */
  public MovieType getMovieType() {
    return movieType;
  }

  /**
   * Abstract method. To implement get price depends on kind of movie.
   *
   * @param daysRented type integer.
   * @return price type double.
   */
  public abstract double getPrice(int daysRented);

}

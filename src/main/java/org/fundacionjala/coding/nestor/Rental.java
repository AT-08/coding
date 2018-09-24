package org.fundacionjala.coding.nestor;

import java.util.ArrayList;
import java.util.List;

/**
 * Rental class.
 */
public class Rental {
  private List<Movie> movieList = new ArrayList<>();
  private int daysRented;
  private int frequentRenterPoints;

  /**
   * Constructor.
   *
   * @param daysRented type integer.
   */
  public Rental(int daysRented) {
    this.daysRented = daysRented;
    this.frequentRenterPoints = 0;
  }

  /**
   * Method to add new movie.
   *
   * @param movie type Movie Object.
   */
  public void addMovie(final Movie movie) {
    this.movieList.add(movie);
  }

  /**
   * Method to get total Charge.
   *
   * @return total for this rental.
   */
  public double getCharge() {
    double charge = 0;

    for (Movie item : this.movieList) {
      charge += item.getPrice(this.daysRented);
      if (item.getMovieType() == MovieType.NEW_RELEASE && daysRented > 1) {
        frequentRenterPoints++;
      }
      frequentRenterPoints++;
    }

    return charge;
  }

  /**
   * Method gether to frequent renter points.
   *
   * @return frequent renter points.
   */
  public int getFrequentRenterPoints() {
    return frequentRenterPoints;
  }

}

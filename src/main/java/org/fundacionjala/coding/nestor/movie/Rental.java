package org.fundacionjala.coding.nestor.movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Rental class.
 */
public class Rental {
  private List<Movie> movieList = new ArrayList<>();
  private int daysRented;

  /**
   * Constructor.
   *
   * @param daysRented type integer.
   */
  public Rental(final int daysRented) {
    this.daysRented = daysRented;
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
  public double calculateCharge() {
    double charge = 0;

    for (Movie item : this.movieList) {
      charge += item.getPrice();
    }

    return charge;
  }

  /**
   * Method gether to frequent renter points.
   *
   * @return frequent renter points.
   */
  public int calculateRenterPoints() {
    int renterPoints = 0;

    for (Movie item: this.movieList) {
      renterPoints += item.getRenterPoints();
    }

    return renterPoints;
  }

}

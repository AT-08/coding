package org.fundacionjala.coding.nestor.movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Rental class.
 */
public class Rental {
  private List<Movie> moviesList = new ArrayList<>();
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
    movie.setDaysRented(daysRented);
    this.moviesList.add(movie);
  }

  /**
   * Method to get total Charge.
   *
   * @return total for this rental.
   */
  public double calculateCharge() {
    double charge = 0;

    for (Movie item : this.moviesList) {
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

    for (Movie item: this.moviesList) {
      renterPoints += item.getRenterPoints();
    }

    return renterPoints;
  }

  /**
   * Method to get movies list.
   *
   * @return Movies list.
   */
  public List<Movie> getMoviesList() {
    return moviesList;
  }

}

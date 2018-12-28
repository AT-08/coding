package org.fundacionjala.coding.nestor.movie;

import java.util.List;

/**
 * Class to implement customer behavior.
 */
public class Customer {
  private String name;
  private Rental movies;

  /**
   * Constructor.
   *
   * @param name type string.
   */
  public Customer(final String name) {
    this.name = name;
  }

  /**
   * Method getter customer name.
   *
   * @return customer name.
   */
  public String getCustomerName() {
    return this.name;
  }

  /**
   * Method to create a new rental.
   *
   * @param daysRented type integer.
   */
  public void createRental(int daysRented) {
    movies = new Rental(daysRented);
  }

  /**
   * Method to add movie to new rental.
   *
   * @param movie type Movie.
   */
  public void addMovie(final Movie movie) {
    movies.addMovie(movie);
  }

  /**
   * Method to get movies list.
   *
   * @return Movies list.
   */
  public List<Movie> getMoviesList() {
    return movies.getMoviesList();
  }
}

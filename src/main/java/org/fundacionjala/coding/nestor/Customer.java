package org.fundacionjala.coding.nestor;

/**
 * Class to implement customer behavior.
 */
public class Customer {
  private String name;
  private Rental rental;

  /**
   * Constructor.
   *
   * @param name type string.
   */
  public Customer(final String name) {
    this.name = name;
  }

  /**
   * Method to create a new rental.
   *
   * @param daysRented type integer.
   */
  public void createRental(int daysRented) {
    rental = new Rental(daysRented);
  }

  /**
   * Method to add movie to new rental.
   *
   * @param movie type Movie.
   */
  public void addMovie(final Movie movie) {
    rental.addMovie(movie);
  }

  /**
   * Method to show statment for this customer.
   *
   * @return string with statement.
   */
  public String statement() {
    String result = new StringBuilder()
        .append("Rental Record for ")
        .append(name).append("\n")
        .toString();
    result += new StringBuilder()
        .append("Amount owed is ")
        .append(String.valueOf(rental.getCharge()))
        .append("\n")
        .toString();
    result += new StringBuilder()
        .append("You earned ")
        .append(String.valueOf(rental.getFrequentRenterPoints()))
        .append(" frequent renter points")
        .toString();
    return result;
  }
}

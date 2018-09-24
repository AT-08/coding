package org.fundacionjala.coding.nestor;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Main class to run this project.
 */
final class Main {
  public final static int DAYS_RENTER = 3;
  private final static Logger logger = Logger.getLogger("");

  /**
   * Static method, main method.
   *
   * @param args type array of Strings.
   */
  public static void main(final String[] args) {
    Movie terminator = new RegularMovie("Terminator");
    Movie srek = new ChildrenMovie("Srek");
    Movie frozen = new ChildrenMovie("Frozen");
    Movie chicago = new RegularMovie("Chicago");
    Movie ralph = new NewReleaseMovie("Ralph breaks the Internet");

    Customer customer = new Customer("Katerina Anzoleaga");
    customer.createRental(DAYS_RENTER);
    customer.addMovie(terminator);
    customer.addMovie(chicago);
    customer.addMovie(srek);
    customer.addMovie(frozen);
    customer.addMovie(ralph);
    logger.log(Level.INFO, customer.statement());
  }
}

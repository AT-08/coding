package org.fundacionjala.coding.nestor;

/**
 * Main class to run this project.
 */
public final class Main {
  public static final int DAYS_RENTER = 3;

  /**
   * Static method, main method.
   *
   * @param args type array of Strings.
   */
  public static void main(final String[] args) {
    Movie terminator = new RegularMovie("Terminator");
    Movie srek = new ChildrenMovie("Srek");
    Movie frozen = new ChildrenMovie("Frozen");
    Movie goldFather = new RegularMovie("The Gold Father");
    Movie chicago = new RegularMovie("Chicago");
    Movie ralph = new NewReleaseMovie("Ralph breaks the Internet");

    Customer customer = new Customer("Katerina Anzoleaga");
    customer.createRental(DAYS_RENTER);
    customer.addMovie(terminator);
    customer.addMovie(chicago);
    customer.addMovie(srek);
    customer.addMovie(frozen);
    customer.addMovie(ralph);
    System.out.println(customer.statement());
  }
}

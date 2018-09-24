package org.fundacionjala.coding.nestor;

/**
 * Implement movies children kind.
 */
public class ChildrenMovie extends Movie {
  public static final double PRICE = 1.5;

  /**
   * Constructor.
   *
   * @param title type string.
   */
  public ChildrenMovie(final String title) {
    super(title, MovieType.CHILDRENS);
  }

  /**
   * Method to get price for this kind of movies.
   *
   * @param daysRented type integer.
   * @return Price.
   */
  @Override
  public double getPrice(int daysRented) {
    if (daysRented > DAYS) {
      return PRICE + (daysRented - DAYS) * FACTOR;
    }

    return PRICE;
  }
}

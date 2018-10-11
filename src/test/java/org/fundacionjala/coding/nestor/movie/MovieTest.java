package org.fundacionjala.coding.nestor.movie;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test Movie class.
 */
public class MovieTest {
  private static final int PRICE = 5;

  private Movie childrenMovie = new ChildrenMovie("Frozen") {
    private static final int RENTER_POINTS = 1;
    @Override
    public double getPrice() {
      return PRICE;
    }

    @Override
    public int getRenterPoints() {
      return RENTER_POINTS;
    }
  };

  /**
   * Test assert if title get correct string.
   */
  @Test
  public void verifyTitleMovie() {
    assertEquals("Frozen", childrenMovie.getTitle());
  }

  /**
   * Test assert if price get correct value.
   */
  @Test
  public void verifyPrice() {
    assertEquals(PRICE, childrenMovie.getPrice(), 0);
  }

  /**
   * Test assert if renter point get correct value.
   */
  @Test
  public void verifyRenterPoints() {
    assertEquals(1, childrenMovie.getRenterPoints());
  }
}

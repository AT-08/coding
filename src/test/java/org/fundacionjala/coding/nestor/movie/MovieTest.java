package org.fundacionjala.coding.nestor.movie;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test Movie class.
 */
public class MovieTest {
  private Movie childrenMovie = new ChildrenMovie("Frozen", 2) {
    @Override
    public double getPrice() {
      return 5;
    }

    @Override
    public int getRenterPoints() {
      return 1;
    }
  };

  /**
   * Test assert if title get correct string.
   */
  @Test
  public void VerifyTitleMovie() {
    assertEquals("Frozen", childrenMovie.getTitle());
  }

  @Test
  public void VerifyPrice() {
    assertEquals(5, childrenMovie.getPrice(), 0);
  }

  @Test
  public void VerifyRenterPoints() {
    assertEquals(1, childrenMovie.getRenterPoints());
  }
}

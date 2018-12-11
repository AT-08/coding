package org.fundacionjala.coding.nestor;

/**
 * Class to calculate days while product still.
 */
public class DeodorantEvaporator {
  private static final int PERCENT = 100;

  /**
   * Method to calculate product util days.
   *
   * @param content type double.
   * @param evapPerDay type double.
   * @param threshold type doble.
   * @return util days.
   */
  public int evaporator(final double content, final double evapPerDay, final double threshold) {
    double percent = PERCENT;
    int days = 0;
    while (percent > threshold) {
      percent -= percent * (evapPerDay / PERCENT);
      days++;
    }
    return days;
  }

}

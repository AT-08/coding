package org.fundacionjala.coding.nestor;

/**
 * To Counter Characters.
 */
public class CounterCharacter {

  /**
   * Method to get count char.
   *
   * @param str type String.
   * @param appear type Character.
   * @return times c appears on str.
   */
  public int charCount(final String str, final char appear) {
    return str.toLowerCase()
        .replaceAll(String.format("[^%s]", Character.toLowerCase(appear)), "")
        .length();
  }
}

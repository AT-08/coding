package org.fundacionjala.coding.nestor;

import java.util.StringJoiner;

/**
 * To Spinning word which length is greater than 4.
 */
public class SpinWords {
  private static final String SPACE = " ";
  private static final int FLAG = 4;

  /**
   * Method to return new String with spinner words.
   *
   * @param sentence type String.
   * @return new string.
   */
  public String spinWords(final String sentence) {
    String[] words = sentence.split(SPACE);
    StringJoiner result = new StringJoiner(SPACE);

    for (String s : words) {
      result.add(s.length() > FLAG ? new StringBuilder(s).reverse().toString() : s);
    }

    return result.toString();
  }
}

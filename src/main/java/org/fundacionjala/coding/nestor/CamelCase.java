package org.fundacionjala.coding.nestor;

/**
 * To convert words to fist character capitalize.
 */
public class CamelCase {

  /**
   * Method to convert camel case to CamelCase.
   *
   * @param str type String
   * @return a new string CamelCase
   */
  public String camelCase(final String str) {
    String strList = str.trim().replaceAll("\\s+", " ");
    if (strList.length() == 0) {
      return strList;
    }
    String[] words = strList.split(" ");
    StringBuilder uppers = new StringBuilder();

    for (String s : words) {
      uppers.append(Character.toUpperCase(s.charAt(0)))
          .append(s.substring(1));
    }

    return uppers.toString();
  }

}

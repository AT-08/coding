package org.fundacionjala.coding.nestor;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to resolve complementary DNA.
 */
public class DnaStrand {
  static final Map<Character, Character> DNA_COMPLEMENT = new HashMap<>();
  static {
    DNA_COMPLEMENT.put('A', 'T');
    DNA_COMPLEMENT.put('C', 'G');
    DNA_COMPLEMENT.put('G', 'C');
    DNA_COMPLEMENT.put('T', 'A');
  }
  /**
   * Method make complement.
   *
   * @param dna type String.
   * @return return a string with dna complementary.
   */
  public String makeComplement(final String dna) {
    char[] chars = dna.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      chars[i] = DNA_COMPLEMENT.get(chars[i]);
    }

    return new String(chars);
  }
}

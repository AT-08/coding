package org.fundacionjala.coding.abel;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public final class VowelCount {
    /**
     *
     */
    private VowelCount() {

    }
  /**
     *
     */
    private static final List<Character> WOLVES = Arrays.asList(
            'a', 'e', 'i', 'o', 'u'
    );
    /**
     * @param str input parameter
     * @return return of value

     */
    public static int getCount(final String str) {
        int volwesCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (WOLVES.contains(c)) {
                volwesCount++;
            }
        }
        return volwesCount;
    }
}

package org.fundacionjala.coding;
/**
 * kata vowels-Count.
 */
public final class Vowels {

    /**
     * constructor.
     */
    private Vowels() {
    }

    /**
     * get vowels count.
     * @return vowels count
     * @param str String to search
     */
        public static int getCount(final String  str) {
            int vowelsCount = 0;
            String validos = "aeiou";
            // your code here
            char[] cadena = str.toCharArray();
            for (char c:cadena) {
                if (validos.indexOf(c) >= 0) {
                    vowelsCount++;
                }
            }
            return vowelsCount;
        }


}

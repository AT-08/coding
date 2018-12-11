package org.fundacionjala.coding.abel.cipher;

/**
 *
 */
public class Vigenere extends Cipher {

    private static final int UNO_1 = 1;

    /**
     * @param string    string of input
     * @param condition num of variation
     * @return value return
     */
    @Override
    public String encode(final String string, final String condition) {
        String[] nummbers = condition.split("");
        String container = "";
        int numIndex = 0;
        for (int i = 0; i < string.length(); i++) {
            if (ALPHABET.contains(String.valueOf(string.charAt(i)))) {
                int newPosition = newPosition(ALPHABET.indexOf(string.charAt(i))
                        + ALPHABET.indexOf(nummbers[numIndex]));
                char newLetter = ALPHABET.charAt(newPosition + UNO_1);
                container = container.concat(String.valueOf(newLetter));
                numIndex = numIndex < nummbers.length - UNO_1 ? numIndex + UNO_1 : 0;
            } else {
                container = container.concat(String.valueOf(string.charAt(i)));
            }
        }
        return container;
    }

    /**
     * @param string    string input
     * @param condition num of variation
     * @return value return
     */
    @Override
    public String decode(final String string, final String condition) {
        String[] nummbers = condition.split("");
        String container = "";
        int numIndex = 0;
        for (int i = 0; i < string.length(); i++) {
            if (ALPHABET.contains(String.valueOf(string.charAt(i)))) {
                int newPosition = newPosition(ALPHABET.indexOf(string.charAt(i))
                        + ALPHABET.length() - ALPHABET.indexOf(nummbers[numIndex]));
                char newLetter = ALPHABET.charAt(newPosition - UNO_1);
                container = container.concat(String.valueOf(newLetter));
                numIndex = numIndex < nummbers.length - UNO_1 ? numIndex + UNO_1 : 0;
            } else {
                container = container.concat(String.valueOf(string.charAt(i)));
            }
        }
        return container;
    }
}

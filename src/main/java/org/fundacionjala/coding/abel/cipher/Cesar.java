package org.fundacionjala.coding.abel.cipher;

/**
 *
 */
public class Cesar extends Cipher {

    /**
     * @param string         string of input
     * @param conditionInput input condition
     * @return return value
     */
    public String encode(final String string, final String conditionInput) {
        int condition = Integer.parseInt(conditionInput);
        String container = "";
        for (int i = 0; i < string.length(); i++) {
            if (ALPHABET.contains(String.valueOf(string.charAt(i)))) {
                container = container.concat(String.valueOf(ALPHABET.charAt(
                        newPosition(ALPHABET.indexOf(string.charAt(i)) + condition))));
            } else {
                container = container.concat(String.valueOf(string.charAt(i)));
            }
        }
        return container;
    }

    /**
     * @param string         string input
     * @param conditionInput input condition
     * @return value return
     */
    public String decode(final String string, final String conditionInput) {


        return encode(string, String.valueOf(ALPHABET.length() - Integer.parseInt(conditionInput)));
    }

}

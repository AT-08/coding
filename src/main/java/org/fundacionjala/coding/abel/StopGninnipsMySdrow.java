package org.fundacionjala.coding.abel;

/**
 *
 */
public class StopGninnipsMySdrow {
    private static final int MIN = 5;

    /**
     * @param sentence string of input
     * @return value return
     */
    public String spinWords(final String sentence) {
        String[] string = sentence.split(" ");

        for (int i = 0; i < string.length; i++) {
            string[i] = string[i].length() >= MIN ? new StringBuilder(string[i]).reverse().toString() : string[i];
        }
        return String.join(" ", string);
    }
}

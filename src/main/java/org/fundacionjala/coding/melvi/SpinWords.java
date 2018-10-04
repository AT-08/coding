package org.fundacionjala.coding.melvi;

/**
 *
 */
public class SpinWords {
    private static final int LIMIT = 4;
    private static final String DELIMITER = " ";

    /**
     * @param sentence the String to be processed
     * @return the words with more than 5 letters are reversed
     */
    public String spinWords(final String sentence) {
        String[] words = sentence.split(DELIMITER);

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > LIMIT) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(DELIMITER, words);
    }
}

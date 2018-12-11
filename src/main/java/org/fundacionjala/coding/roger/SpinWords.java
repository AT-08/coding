package org.fundacionjala.coding.roger;

import java.util.StringJoiner;

/**
 * Write a function that takes in a string of one or more words,
 * and returns the same string, but with all five or more letter
 * words reversed (Just like the name of this Kata). Strings passed
 * in will consist of only letters and spaces. Spaces will be included
 * only when more than one word is present.
 *
 */


public class SpinWords {
    private static final int LIMIT = 4;

    /**
     *@param sentence input String.
     *@return return the string in camel case.
     */
    public String spinWords(final String sentence) {
        StringJoiner sj = new StringJoiner(" ");
        for (String word : sentence.trim().split(" ")) {
            sj.add(word.length() > LIMIT ? new StringBuilder(word).reverse() : word);
        }
        return sj.toString();

    }
}

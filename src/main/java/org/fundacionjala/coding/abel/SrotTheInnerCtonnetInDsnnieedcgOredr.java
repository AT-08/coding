package org.fundacionjala.coding.abel;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 */
public class SrotTheInnerCtonnetInDsnnieedcgOredr {

    /**
     *
     */
    private static final int MIN = 4;


    /**
     * @param sentence input string
     * @return value of return
     */
    public String sortTheInnerContent(final String sentence) {
        String[] string = sentence.split(" ");
        for (int i = 0; i < string.length; i++) {
            string[i] = string[i].length() >= MIN ? invertedOrderCharacteres(string[i]) : string[i];
        }
        return String.join(" ", string);
    }

    /**
     * @param string text input
     * @return value of return
     */
    public String invertedOrderCharacteres(final String string) {
        String ini = String.valueOf(string.charAt(0));
        String fin = String.valueOf(string.charAt(string.length() - 1));
        String subWord = string.substring(1, string.length() - 1);
        String[] arrayChars = subWord.split("");
        Arrays.sort(arrayChars, Collections.reverseOrder());
        return String.join("", ini, String.join("", arrayChars), fin);

    }

}

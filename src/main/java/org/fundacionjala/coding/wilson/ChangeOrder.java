package org.fundacionjala.coding.wilson;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 */
public final class ChangeOrder {
    /**
     *
     */

    private ChangeOrder() {

    }

    /**
     *
     * @param words is a sentence
     * @return sentence with change order
     */
    public static String sortTheInnerContent(final String words) {
        String[] wa = words.split(" ");
        for (int i = 0; i < wa.length; i++) {
            if (wa[i].length() > 2) {
                String[] s1 = wa[i].substring(1, wa[i].length() - 1).split("");
                Arrays.sort(s1, Collections.reverseOrder());
                String firstC = Character.toString(wa[i].charAt(0));
                String lastC = Character.toString(wa[i].charAt(wa[i].length() - 1));
                String aux = String.join("", s1);
                wa[i] = firstC.concat(aux).concat(lastC);
            }
        }
        return String.join(" ", wa);
    }
}

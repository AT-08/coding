package org.fundacionjala.coding.wilson;

import java.util.Arrays;

/**
 *
 */
public final class Meeting {

    /**
     *
     */
    private Meeting() {

    }

    /**
     *
     * @param s names for meeting
     * @return order names and lastnames
     */
    public static String meeting(final String s) {
        String[] guests = s.toUpperCase().split(";");
        for (int i = 0; i < guests.length; i++) {
            int index = guests[i].indexOf(":");
            guests[i] = "(" + guests[i].substring(index + 1) + ", " + guests[i].substring(0, index) + ")";
        }
        Arrays.sort(guests);

        return String.join("", guests);
    }
}

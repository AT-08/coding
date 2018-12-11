package org.fundacionjala.coding.wilson;

/**
 *
 */
public final class HighAndLow {

    /**
     *
     */
    private HighAndLow() {

    }
    /**
     *
     * @param numbers recibe a String with numbers
     * @return the max an min number
     */
    public static String methodHighAndLow(final String numbers) {
        String[] s = numbers.split(" ");
        int h = Integer.parseInt(s[0]);
        int l = Integer.parseInt(s[0]);
        for (String subS : s) {
            int curI = Integer.parseInt(subS);
            h = curI > h ? curI : h;
            l = curI < l ? curI : l;
        }
        return Integer.toString(h).concat(" ").concat(Integer.toString(l));
    }
}

package org.fundacionjala.coding.wilson;

/**
 *
 */
public final class Solution {

    /**
     *
     */
    private Solution() {

    }

    /**
     *
     * @param num is int
     * @return string
     */
    public static String dashatize(int num) {
        return Integer.toString(num)
                .replaceAll("([13579])", "-$1-").replaceAll("--", "-").replaceAll("^-", "").replaceAll("-$", "");
    }
}

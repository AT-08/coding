package org.fundacionjala.coding.rodrigo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * In this little assignment you are given a string of space separated numbers,
 * and have to return the highest and lowest number.
 */
public final class HighLow {
    /**
     * Empty constructor.
     */
    private HighLow() {
    }

    /**
     * Find the high and low.
     *
     * @param numbers Input number.
     * @return the High and Low.
     */
    public static String highAndLow(final String numbers) {
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .summaryStatistics();
        return String.format("%d %d", intSummaryStatistics.getMax(), intSummaryStatistics.getMin());
    }
}

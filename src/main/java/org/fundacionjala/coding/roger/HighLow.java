package org.fundacionjala.coding.roger;
import java.util.Arrays;
/**
 * SortTwisted37 3
 * by Roger.
 *
 */
public class HighLow {
    /**
     *@param numbers input String.
     *@return return number high and number low.
     */
    public String highAndLow(final String numbers) {

        String[] numbersStr = numbers.split(" ");
        int[] numbersList = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbersList[i] = Integer.parseInt(numbersStr[i]);
        }
        Arrays.sort(numbersList);
        return String.format("%d %d", numbersList[numbersList.length - 1], numbersList[0]);
    }
}


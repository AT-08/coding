package org.fundacionjala.coding.dennis;

import java.util.ArrayList;
import java.util.Collections;

public class SortOdd {

    public static int[] sortArray(int[] array) {
        ArrayList<Integer> oddList = new ArrayList<>(1);
        ArrayList<Integer> oddListSort = new ArrayList<>(1);
        int[] finalList = new int[array.length];
        for (int number : array) {
            oddList.add(number);
        }
        oddList.removeIf(num -> num % 2 == 0);
        oddListSort.addAll(oddList);
        Collections.sort(oddListSort);
        Collections.reverse(oddListSort);
        for (int index = 0; index < array.length; index++) {
            finalList[index] = array[index];
            if (oddList.contains(array[index])) {
                finalList[index] = oddListSort.get(oddListSort.size()-1);
                Collections.rotate(oddListSort, 1);
            }
        }
        return finalList;
    }
}

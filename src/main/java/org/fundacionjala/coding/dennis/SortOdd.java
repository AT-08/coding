package org.fundacionjala.coding.dennis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortOdd {

//    private static final Map<Integer, Integer> mapNotEven = null;
//
//    public static ArrayList<Integer> sortArray(final ArrayList<Integer> listToSort) {
//        ArrayList<Integer> notEven = new ArrayList<>(1);
//        ArrayList<Integer> notEven2 = new ArrayList<>(1);
//        ArrayList<Integer> finalList = new ArrayList<>(1);
//        int elementIndex;
//        for (int number : listToSort) {
//            notEven.add( number % 2 != 0 ? number : 0);
//            notEven2.add( number % 2 != 0 ? number : 0);
//        }
//        Collections.sort(notEven);
//        Collections.reverse(notEven2);
//        notEven.removeIf(n -> n == 0);
//        notEven2.removeIf(n -> n == 0);
//        for (int index = 0; index < notEven.size() ; index++) {
//            mapNotEven.put(notEven.get(index), notEven2.get(index));
//        }
//        for(int index = 0; index < listToSort.size() ; index++) {
//            elementIndex = listToSort.get(index);
//            finalList.add(notEven.contains(elementIndex) ? mapNotEven.get(elementIndex) : elementIndex);
//        }
//        return finalList;
//    }

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

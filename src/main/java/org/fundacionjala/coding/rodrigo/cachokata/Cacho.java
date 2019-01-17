package org.fundacionjala.coding.rodrigo.cachokata;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cacho {
    private static final Map<Integer, Punctuation> CATEGORY = new HashMap<>();

    static {
        CATEGORY.put(5, Punctuation.GRANDE);
        CATEGORY.put(41, Punctuation.POKER);
        CATEGORY.put(14, Punctuation.POKER);
        CATEGORY.put(32, Punctuation.FULL);
        CATEGORY.put(23, Punctuation.FULL);
        CATEGORY.put(12345, Punctuation.ESCALERA);
    }

    public int play(final int[] array) {
        Arrays.sort(array);
        List<Integer> listOfDices = Arrays.stream(array).boxed().collect(Collectors.toList());
        HashSet<Integer> dicesCount = countDices(listOfDices);
        int puntaje;
        int a;
        if (dicesCount.size() == 1) {
            a = Integer.parseInt(listOfDices.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining("")));
        } else {
            a = Integer.parseInt(dicesCount.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining("")));
        }
        System.out.println("num==" + a);
        System.out.println("Number of times who the dices repeat==" + dicesCount);
        if (CATEGORY.containsKey(a)) {
            System.out.println(CATEGORY.get(a));
            return CATEGORY.get(a).getScore();
        } else {
            int maxNumber = Arrays.stream(array).max().getAsInt();
            puntaje = maxNumber * Collections.frequency(listOfDices, maxNumber);
        }
        return puntaje;
    }

    private HashSet<Integer> countDices(List<Integer> listOfDices) {
        HashSet<Integer> dicesCount = new HashSet<>();
        for (int i : listOfDices) {
            dicesCount.add(Collections.frequency(listOfDices, i));
        }
        return dicesCount;
    }

}


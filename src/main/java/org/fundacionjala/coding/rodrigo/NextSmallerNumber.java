package org.fundacionjala.coding.rodrigo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class NextSmallerNumber {
    public static long nextSmaller(long n) {
        long aux = Long.parseLong(Arrays.stream(String.valueOf(n).split(""))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining()));
        return Long.toString(aux).length() != String.valueOf(n).length() ? -1 : aux;
    }
}

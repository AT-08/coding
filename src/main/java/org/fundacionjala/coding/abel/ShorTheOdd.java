package org.fundacionjala.coding.abel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShorTheOdd {

    public static int[] sortArray(int[] array) {
        ShorTheOdd.print(array);

        System.out.println("----------");
        int num = 0;
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                number.add(i);
            }
        }

        Comparator<Integer> comparador = Collections.;

        Collections.sort(number,comparador);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = number.get(num);
                System.out.println("*****"+number.get(num));


                num=num+1;

                System.out.println(">"+num);
            }
        }
        ShorTheOdd.print(array);
        return array;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}



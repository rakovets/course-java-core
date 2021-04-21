package com.rakovets.course.java.core.practice.generic_types;

import javax.crypto.spec.PSource;

public class MathDemo<T> {
    public static void main(String[] args) {
        //   Integer[] ah = Math.bubbleSort(new Integer[]{10, 2, 4});
        //  for (Integer valuee : ah) {
        //      System.out.println(valuee);
        //  }


       // Integer[] ah2 = Math.bubbleSort(new Integer[]{9, 1, 1, 666, -2});
       // for (Integer valuee2 : ah2) {
       //     System.out.println(valuee2);
       // }
        String[] ah2 = Math.bubbleSort(new String[]{"z","a", "d", "b", "e", "g"});
        for (String valuee2 : ah2) {
            System.out.println(valuee2);
        }
        System.out.println(Math.binarySearch(ah2, "b"));
    }

}

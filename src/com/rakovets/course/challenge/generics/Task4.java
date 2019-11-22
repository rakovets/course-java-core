package com.rakovets.course.challenge.generics;

public class Task4 {
    public static <T extends Comparable<T>> void lessValueInArray(T[] array) {
        T res = array[0];
        for (int i = 0; i < (array.length - 1); i++) {
            if (res.compareTo(array[i+1]) > 0) {
                res = array[i + 1];
            }
        }
        System.out.println("less value in array is " + res);

    }
}

package com.rakovets.course.challenge.generics.Math;

import java.util.Arrays;

public class Task6 {
    public static <T> void sortOfArray(T[] array) {
        Arrays.sort(array);
        System.out.println("Array after sort: " + Arrays.toString(array) + "\n");
    }
}

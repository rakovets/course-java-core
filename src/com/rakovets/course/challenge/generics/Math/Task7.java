package com.rakovets.course.challenge.generics.Math;

import java.util.Arrays;

public class Task7 {
    public static <T> void searchInArray(T[] array,T x) {
        int positionOfValueInArray = Arrays.binarySearch(array, x);
        System.out.println("Position of value is: " + positionOfValueInArray + "\n");
    }
}

package com.rakovets.course.java.core.practice.generics.math;

import java.util.Arrays;

public class MathDemo {
    public static void main(String[] args) {
        System.out.printf(Math.maxOfThree(1, 3, 4) + "\n\n");

        System.out.printf(Math.minOfFive(4.0, 2.0, 3.0, 4.0, 5.0) + "\n\n");

        Number[] arrayAvg = {2, 2, 2, 3};
        System.out.printf(Math.avgInArray(arrayAvg) + "\n\n");

        Number[] arrayMax = {1, 2, 3, 4};
        System.out.printf(Math.maxInArray(arrayMax) + "\n\n");

        Number[] arrayMin = {1.1, 2.0, 3.1, 4.1};
        System.out.printf(Math.minInArray(arrayMin) + "\n\n");

        Number[] arraySort = {4.1, 3.2, 2, 1.1};
        System.out.printf(Arrays.toString(Math.bubbleSort(arraySort)) + "\n\n");

        Number[] arraySearch = {4.1, 3.2, 2.0, 1.1};
        System.out.printf(Math.binarySearch(arraySearch, 2.0) + "\n");
    }
}

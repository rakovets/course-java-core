package com.rakovets.course.java.core.practice.generics.math;

public class MathDemo {
    public static void main(String[] args) {
        System.out.printf(Math.maxOfThree(1, 3, 4) + "\n\n");

        System.out.printf(Math.minOfFive(4.0, 2.1, 3.0, 4.0, 5.0) + "\n\n");

        Number[] arrayAvg = {2, 2, 2, 2.2};
        System.out.println(Math.avgInArray(arrayAvg));

        Number[] arrayMax = {1, 2, 3, 4};
        System.out.println();

        Number[] arrayMin = {1, 2, 3, 4};
        System.out.println();
    }
}

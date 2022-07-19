package com.rakovets.course.java.core.practice.generics;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.getMaxValueOfThree(141, 412, 0));
        System.out.println(Math.getMaxValueOfThree(1, 23, 214));

        System.out.println(Math.getMinValueOfFive(42, -23, 523, -4.0, 0));
        System.out.println(Math.getMinValueOfFive(100, -100, 23, 41, 23));

        System.out.println(Math.getAverageNumberInArray(new Double[]{63.9, 0.0, 1.0, 23.0, 12.0}));
        System.out.println(Math.getAverageNumberInArray(new Integer[]{50, 10, 10, 40, 123}));

        System.out.println(Math.getMinNumberInArray(new Double[]{0.0, 0.0, 0.0, -1.0}));
        System.out.println(Math.getMinNumberInArray(new Integer[]{-64, 95, 96, 1, 23}));

        System.out.println(Math.getMaxNumberInArray(new Double[]{123.2, 23.0, 250.0, 95.0}));
        System.out.println(Math.getMaxNumberInArray(new Integer[]{101, -404, 39, 686, 420}));

        Math.bubbleSort(new Double[]{123.2, 23.0, 250.0, 95.0});
        Math.iterativeSearch(new Integer[]{101, -404, 39, 686, 420}, 420);
    }
}

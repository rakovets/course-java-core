package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Collection;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        MathStatistics m = new MathStatistics();
        System.out.println("random generated numbers array: " + m.generateRandomNumbers(10, 0, 15));

        Collection<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(4);
        arr.add(0);
        arr.add(0);
        arr.add(27);
        arr.add(15);

        System.out.println("static array for demonstration: " + arr);
        System.out.println("total elements count is: " + m.countElements(arr));
        System.out.println("even numbers count is: " + m.countEvenNumbers(arr));
        System.out.println("odd numbers count is: " + m.countOddNumbers(arr));
        System.out.println("zeros count is: " + m.countZeros(arr));
        System.out.println("27 count is: " + m.countMatches(arr, 27));
    }
}

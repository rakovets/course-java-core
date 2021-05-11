package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        int[] arr = MathStatistics.randomNumbers(20, -10, 10);

        System.out.println("Random array - " + Arrays.toString(arr));
        System.out.println("Number of even numbers in array = " + MathStatistics.countEvenNumbers(arr));
        System.out.println("Number of odd numbers in array = " + MathStatistics.countOddNumbers(arr));
        System.out.println("Number of zero numbers in array = " + MathStatistics.countZeroNumbers(arr));
        System.out.println("Number '5' in array = " + MathStatistics.countThisNumber(arr, 5));
    }
}

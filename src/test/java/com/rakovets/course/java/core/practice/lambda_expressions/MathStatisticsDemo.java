package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        int[] arr = MathStatistics.getSetRandomNumbers(10, -20, 20);

        System.out.println(Arrays.toString(arr));
        System.out.println(MathStatistics.countEvenNumbers(arr));
        System.out.println(MathStatistics.countOddNumbers(arr));
        System.out.println(MathStatistics.countNumbersEqualZero(arr));
        System.out.println(MathStatistics.countNumberEqualThis(arr, 10));
    }
}

package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        MathStatistics mathStatistics = new MathStatistics();
        int[] array = mathStatistics.getRandomNumbers(12);
        System.out.println(Arrays.toString(array));
        System.out.println(mathStatistics.getCountEven(array));
        System.out.println(mathStatistics.getCountOdd(array));
        System.out.println(mathStatistics.getZerros(array));
        System.out.println(mathStatistics.getNotNull(array));
    }
}

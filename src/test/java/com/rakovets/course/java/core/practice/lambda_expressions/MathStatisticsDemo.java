package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;

class MathStatisticsDemo {
    public static void main(String[] args) {

        MathStatistics mathStatistics = new MathStatistics();
        int[] arr = mathStatistics.random(10);

        System.out.println(Arrays.toString(arr));
        System.out.println("Quantity of even numbers");
        System.out.println(mathStatistics.countEven(arr));
        System.out.println("Quantity of odd numbers");
        System.out.println(mathStatistics.countOdd(arr));
        System.out.println("Quantity of zeros");
        System.out.println(mathStatistics.countZero(arr));
        System.out.println("Quantity of specific value");
        System.out.println(mathStatistics.equalToValue(arr, 1000));
    }
}

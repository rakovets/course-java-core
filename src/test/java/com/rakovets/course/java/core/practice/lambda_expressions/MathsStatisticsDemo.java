package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;

public class MathsStatisticsDemo {
    public static void main(String[] args) {
        int[] arrayNumbers = MathsStatistics.getRandomNumber(10, -50, 50);
        System.out.println("Array : " + Arrays.toString(arrayNumbers));
        System.out.print("Count of even numbers : ");
        System.out.println(MathsStatistics.getCountEvenNumber(arrayNumbers));
        System.out.print("Count of odd numbers : ");
        System.out.println(MathsStatistics.getCountOddNumber(arrayNumbers));
        System.out.print("Count of zeros : ");
        System.out.println(MathsStatistics.getCountZeroNumber(arrayNumbers));
        System.out.print("Count of some value : ");
        System.out.println(MathsStatistics.equalToValue(arrayNumbers,15));
    }
}

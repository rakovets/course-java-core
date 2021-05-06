package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;

public class MathsStatisticsDemo {
    public static void main(String[] args) {
        System.out.print("Array : ");
        System.out.println(Arrays.toString(MathsStatistics.randomArray));
        System.out.print("Count of even numbers : ");
        System.out.println(MathsStatistics.getCountEvenNumber());
        System.out.print("Count of odd numbers : ");
        System.out.println(MathsStatistics.getCountOddNumber());
        System.out.print("Count of zeros : ");
        System.out.println(MathsStatistics.getCountZeroNumber());
        System.out.print("Count of some value : ");
        System.out.println(MathsStatistics.equalToValue(15));
    }
}

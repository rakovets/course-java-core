package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        System.out.print("Quantity of even numbers : ");
        System.out.println(MathStatistics.getEvenCount());
        System.out.print("Quantity of odd numbers : ");
        System.out.println(MathStatistics.getOddCount());
        System.out.print("Quantity of zeros : ");
        System.out.println(MathStatistics.getZeroCount());
        System.out.print("Quantity of specific value : ");
        System.out.println(MathStatistics.equalToValue(0));
        System.out.print("Array : ");
        System.out.println(Arrays.toString(MathStatistics.randomArray));
    }
}

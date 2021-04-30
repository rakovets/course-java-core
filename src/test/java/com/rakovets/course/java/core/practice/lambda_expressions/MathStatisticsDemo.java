package com.rakovets.course.java.core.practice.lambda_expressions;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        int[] values = new int[] {67, 51, 0, 90, 71, 60, 16, 6, 68, 0, 12, 77, 16, 21, 39, 63, 0, 67, 54, 99, 79, 0};
        System.out.println(MathStatistics.getRandomValues(25, 100));
        System.out.println(MathStatistics.getAmountEvenNumbers(values));
        System.out.println(MathStatistics.getAmountOddNumbers(values));
        System.out.println(MathStatistics.getAmountZeroNumbers(values));
        System.out.println(MathStatistics.getAmountEqualsNumbers(values, 0));
    }
}

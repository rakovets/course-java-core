package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        List<Integer> test = MathStatistics.getRandomInteger(100, -10, 11);
        System.out.println(test);
        System.out.println(MathStatistics.getCountEvenNumbers(test));
        System.out.println(MathStatistics.getCountOddNumbers(test));
        System.out.println(MathStatistics.getCountOfZero(test));
        System.out.println(MathStatistics.getCountOfThisNumber(test, 10));
    }
}

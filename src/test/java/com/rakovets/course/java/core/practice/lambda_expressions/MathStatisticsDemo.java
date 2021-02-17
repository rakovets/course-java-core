package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        List<Integer> list = MathsStatistics.getRandomDigits(29,-5, 9);

        System.out.println(list);

        System.out.println(MathsStatistics.getQuantityOfEven(list));

        System.out.println(MathsStatistics.getQuantityOfEven(list));

        System.out.println(MathsStatistics.getQuantityOfOdd(list));

        System.out.println(MathsStatistics.getQuantityOfZero(list));

        System.out.println(MathsStatistics.getQuantityOfSomeValue(list, 2));
    }
}

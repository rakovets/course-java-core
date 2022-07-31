package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        MathStatistics mathUtil = new MathStatistics();
        List<Integer> randomNumbers = mathUtil.getRandomNumbers(5, 0, 5);

        System.out.println(randomNumbers);

        System.out.println(mathUtil.countEvenNumbers(randomNumbers));
        System.out.println(mathUtil.countOddNumbers(randomNumbers));
        System.out.println(mathUtil.countZero(randomNumbers));
        System.out.println(mathUtil.countEqualToValue(randomNumbers, 1));
    }
}

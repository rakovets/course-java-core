package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        MathStatistics mathUtil = new MathStatistics();
        List<Integer> randomNumbers = mathUtil.getRandomNumbers(10, 0, 11);

        System.out.println("Random numbers: " + randomNumbers);
        System.out.println("Number of even: " + mathUtil.countEvenNumbers(randomNumbers));
        System.out.println("Number of odd: " + mathUtil.countOddNumbers(randomNumbers));
        System.out.println("Number of zero: " + mathUtil.countZero(randomNumbers));
        System.out.println("Number of 1: " + mathUtil.countEqualToValue(randomNumbers, 1));
    }
}

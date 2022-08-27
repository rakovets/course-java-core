package com.rakovets.course.java.core.practice.lambda_expressions.demo;

import com.rakovets.course.java.core.practice.lambda_expressions.tasks.MathStatistics;

import java.util.List;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        MathStatistics mathUtil = new MathStatistics();
        List<Integer> randomNumbers = mathUtil.getRandomNumbers(10, 0, 10);

        System.out.println(randomNumbers);

        System.out.println(mathUtil.countEvenNumbers(randomNumbers));
        System.out.println(mathUtil.countOddNumbers(randomNumbers));
        System.out.println(mathUtil.countZero(randomNumbers));
        System.out.println(mathUtil.countEqualToValue(randomNumbers, 1));
    }
}

package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        Arrays.stream(MathsStatistics.getRandomNumbers(10)).forEach(System.out::println);
    }
}

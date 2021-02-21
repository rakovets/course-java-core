package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.project_math_statistics.MathStatistic;

import java.util.List;

public class MathStatisticDemo {
    public static void main(String[] args) {
        List<Integer> number = MathStatistic.getRandomNumbers(25, 0, 50);
        System.out.println(number);
    }
}

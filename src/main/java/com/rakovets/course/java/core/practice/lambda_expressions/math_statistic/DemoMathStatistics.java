package com.rakovets.course.java.core.practice.lambda_expressions.math_statistic;

public class DemoMathStatistics {
    public static void main(String[] args) {
        int[] array = MathStatistics.generateSetOfNumbers();
        System.out.println(MathStatistics.countEvenNumber(array));
        System.out.println(MathStatistics.countNegativeNumber(array));
        System.out.println(MathStatistics.countNumberEqualsZero(array));
        System.out.println(MathStatistics.countNumberEqualsParameter(array));
    }
}

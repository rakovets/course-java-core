package com.rakovets.course.java.core.practice.lambda_expressions;

public class MathStatisticDemo {
    public static void main(String[] args) {
        System.out.println(MathStatistic.getEvenCount(MathStatistic.getArrayOfRandomNumbers()));
        System.out.println(MathStatistic.getNotEvenCount(MathStatistic.getArrayOfRandomNumbers()));
        System.out.println(MathStatistic.getZeroNumbers(MathStatistic.getArrayOfRandomNumbers()));
        System.out.println(MathStatistic.getNeededNumbersCount(3, MathStatistic.getArrayOfRandomNumbers()));
    }
}

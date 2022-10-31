package com.rakovets.course.java.core.practice.lambda_expressions.project_math_statistics;

import java.util.Arrays;

public class DemoMathStatistics {
    public static void main(String[] args) {
        MathStatistics mathStatistics = new MathStatistics();
        int[] randomArray = mathStatistics.generateArrayOfRandomInt(10, -100, 200);
        Arrays.stream(randomArray).sequential()
                .forEach(x -> System.out.printf("%d ", x));
        System.out.println();
        long numberOfEven2 = mathStatistics.getNumberOfEven(randomArray);
        System.out.println(numberOfEven2);
        long numberOfOdd2 = mathStatistics.getNumberOfOdd(randomArray);
        System.out.println(numberOfOdd2);
        long numberOfZero = mathStatistics.getNumberOfZero(randomArray);
        System.out.println(numberOfZero);
        long numberSpecifiedIntNumber = mathStatistics.getNumberOfSpecifiedIntNumber(randomArray, 74);
        System.out.println(numberSpecifiedIntNumber);
    }
}

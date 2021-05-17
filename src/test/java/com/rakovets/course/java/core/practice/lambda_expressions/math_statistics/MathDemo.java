package com.rakovets.course.java.core.practice.lambda_expressions.math_statistics;

import java.util.List;

public class MathDemo {
    public static void main(String[] args) {
        List<Integer> integersList = new Math().randomValue(10, 0, 50);
        System.out.println(integersList);
        System.out.println(Math.numberEven(integersList));
        System.out.println(Math.numberOdd(integersList));
        System.out.println(Math.equalZero(integersList));
        System.out.println(Math.equalGivenValue(integersList, 4));
    }
}

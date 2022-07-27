package com.rakovets.course.java.core.practice.lambda_expressions;

public class ExpressionHelper {
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    static boolean isZero(int number) {
        return number == 0;
    }

    static boolean isEqualNumberValue(int number, int n) {
        return number == n;
    }
}

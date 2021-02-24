package com.rakovets.course.java.core.practice.lambda_expressions.math_statistic;

import java.util.Random;

public class MathStatistics {
    static int LIMIT = 100;
    static int countEven = 0;
    static int countOdd = 0;
    static int countZero = 0;
    static int countEqualsParameter = 0;
    static int PARAMETER = 16845165;
    // генерация набора случайных целых чисел
    public static int[] generateSetOfNumbers() {
        Random random = new Random();
        int[] array = new int[random.nextInt((LIMIT))];
        for (int i = 0; i < array.length; i ++) {
            array[i] = random.nextInt();
        }
        return array;
    }
    //  подсчет количества четных
    public static int countEvenNumber(int[] array) {
        Expression expr = arr -> {
            for (int i : array) {
                if (i % 2 == 0) {
                    countEven++;
                }
            }
            return countEven;
        };
        return expr.countNumbers(array);
    }
    //  подсчет количества нечетных
    public static int countNegativeNumber(int[] array) {
        Expression expr = arr -> {
            for (int i : array) {
                if (i % 2 != 0) {
                    countOdd++;
                }
            }
            return countOdd;
        };
        return expr.countNumbers(array);
    }
    // подсчет количества равных 0
    public static int countNumberEqualsZero(int[] array) {
        Expression expr = arr -> {
            for (int i : array) {
                if (i == 0) {
                    countZero++;
                }
            }
            return countZero;
        };
        return expr.countNumbers(array);
    }
    // Подсчет количества равных некоторому значению
    public static int countNumberEqualsParameter(int[] array) {
        Expression expr = arr -> {
            for (int i : array) {
                if (i == PARAMETER) {
                    countEqualsParameter++;
                }
            }
            return countEqualsParameter;
        };
        return expr.countNumbers(array);
    }
}

interface Expression {
    int countNumbers(int[] array);
}

package com.rakovets.course.java.core.practice.lambda_expressions.project_math_statistics;

import java.util.stream.IntStream;

public class DemoMathStatistics {
    public static void main(String[] args) {
        final int ANY_NUMBER = 50;

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201 - 100);
            System.out.printf("%d\t", array[i]);
        }
        System.out.println();
        long numberOfEven = IntStream.of(array)
                .filter(x -> x % 2 == 0)
                .count();
        System.out.printf("Сгенерировано %d четных чисел.\n", numberOfEven);
        long numberOfOdd = IntStream.of(array)
                .filter(x -> x % 2 != 0)
                .count();
        System.out.printf("Сгенерировано %d нечетных чисел.\n", numberOfOdd);
        long numberOfNull = IntStream.of(array)
                .filter(x -> x == 0)
                .count();
        System.out.printf("Сгенерировано %d чисел, равных нулю.\n", numberOfNull);
        long numberOfAnyNumber = IntStream.of(array)
                .filter(x -> x == ANY_NUMBER)
                .count();
        System.out.printf("Сгенерировано %d чисел, равных %d.\n", numberOfAnyNumber, ANY_NUMBER);
    }
}

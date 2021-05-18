package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Random;

public class MathStatistics {
    public static int[] getSetRandomNumbers(int size, int start, int end) {
        return new Random()
                .ints(size, start, end)
                .toArray();
    }

    public static long countEvenNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .count();
    }

    public static long countOddNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(x -> x % 2 != 0)
                .count();
    }

    public static long countNumbersEqualZero(int[] arr) {
        return Arrays.stream(arr)
                .filter(x -> x == 0)
                .count();
    }

    public static long countNumberEqualThis(int[] arr, int number) {
        return Arrays.stream(arr)
                .filter(x -> x == number)
                .count();
    }
}

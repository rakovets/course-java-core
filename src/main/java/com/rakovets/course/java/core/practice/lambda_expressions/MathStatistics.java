package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Random;

public class MathStatistics {
    public static String getRandomValues(int amountValues, int maxNumberValues) {
        Random random = new Random();
        return Arrays.toString(Arrays.stream(new int[amountValues])
                .map(n -> random.nextInt(maxNumberValues))
                .toArray());
    }

    public static long getAmountEvenNumbers(int[] array) {
        return Arrays.stream(array)
                .filter(n -> n % 2 == 0)
                .count();
    }

    public static long getAmountOddNumbers(int[] array) {
        return Arrays.stream(array)
                .filter(n -> n % 2 != 0)
                .count();
    }

    public static long getAmountZeroNumbers(int[] array) {
        return Arrays.stream(array)
                .filter(n -> n == 0)
                .count();
    }

    public static long getAmountEqualsNumbers(int[] array, int value) {
        return Arrays.stream(array)
                .filter(n -> n == value)
                .count();
    }
}

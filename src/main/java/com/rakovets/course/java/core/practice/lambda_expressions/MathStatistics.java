package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Random;

public class MathStatistics {
    public static String getRandomValues(int amountValues, int maxNumberValues) {
        Random random = new Random();
        return Arrays.toString(Arrays.stream(new int[amountValues]).
                map(n -> random.nextInt(maxNumberValues)).
                toArray());
    }

    public static int getAmountEvenNumbers(int[] array) {
        return (int)Arrays.stream(array).
                filter(n -> n % 2 == 0).
                count();
    }

    public static int getAmountOddNumbers(int[] array) {
        return (int)Arrays.stream(array).
                filter(n -> n % 2 != 0).
                count();
    }

    public static int getAmountZeroNumbers(int[] array) {
        return (int)Arrays.stream(array).
                filter(n -> n == 0).
                count();
    }

    public static int getAmountEqualsNumbers(int[] array, int value) {
        return (int)Arrays.stream(array).
                filter(n -> n == value).
                count();
    }
}

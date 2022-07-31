package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Random;

public class MathsStatistics {
    private static final Random RANDOM = new Random();

    public static int[] getRandomNumbers(int amount) {
        return RANDOM.ints(amount).toArray();
    }

    public long countEvenNumbers(int[] array) {
        return Arrays.stream(array)
                .filter(c -> c % 2 == 0)
                .count();
    }

    public long countOddNumbers(int[] array) {
        return Arrays.stream(array)
                .filter(c -> c % 2 != 0)
                .count();
    }

    public long countEqualZero(int[] array) {
        return Arrays.stream(array)
                .filter(c -> c == 0)
                .count();
    }

    public long countEqualNumberValue(int[] array, int number) {
        return Arrays.stream(array)
                .filter(c -> c == number)
                .count();
    }
}

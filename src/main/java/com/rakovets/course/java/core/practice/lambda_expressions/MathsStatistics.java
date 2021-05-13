package com.rakovets.course.java.core.practice.lambda_expressions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class MathsStatistics {
    public static int[] randomArray() {
        Random random = new Random();
        return random.ints(0, 10).limit(20).toArray();
    }

    public static long countEvenNumber(int[] array) {
        return Arrays.stream(array)
                .filter(number -> number % 2 == 0)
                .count();
    }

    public static long countOddNumber(int[] array) {
        return Arrays.stream(array)
                .filter(number -> number % 2 != 0)
                .count();
    }

    public static long countZeroNumber(int[] array) {
        return Arrays.stream(array)
                .filter(number -> number == 0)
                .count();
    }

    public static long countEquivalNumber(int[] array, int equvivalNumber) {
        return Arrays.stream(array)
                .filter(number -> number == equvivalNumber)
                .count();
    }
}

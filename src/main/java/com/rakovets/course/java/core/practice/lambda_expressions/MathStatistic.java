package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Random;

public class MathStatistic {
    private static final int[] RANDOM_NUMBERS_ARRAY = new Random().ints(100,-5,40 ).toArray();

    static long getEvenCount() {
       return Arrays.stream(RANDOM_NUMBERS_ARRAY)
                .filter(number -> number % 2 == 0)
                .count();
    }

    static long getNotEvenCount() {
        return  Arrays.stream(RANDOM_NUMBERS_ARRAY)
                .filter(number -> number % 2 != 0)
                .count();
    }

    static long getZeroNumbers() {
        return Arrays.stream(RANDOM_NUMBERS_ARRAY)
                .filter(number -> number == 0)
                .count();
    }

    static long getNeededNumbers(int neededNumber) {
        return Arrays.stream(RANDOM_NUMBERS_ARRAY)
                .filter(number -> number == neededNumber)
                .count();
    }
}

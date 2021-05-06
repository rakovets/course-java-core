package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Random;

public class MathsStatistics {
    static int[] randomArray = new Random().ints(new Random().nextInt(50), -10, 70).toArray();

    public static long getCountEvenNumber() {
        return Arrays.stream(randomArray)
                .filter(number -> number % 2 == 0)
                .count();
    }

    public static long getCountOddNumber() {
        return Arrays.stream(randomArray)
                .filter(number -> number % 2 != 0)
                .count();
    }

    public static long getCountZeroNumber() {
        return Arrays.stream(randomArray)
                .filter(number -> number == 0)
                .count();
    }

    public static long equalToValue(int value) {
        return Arrays.stream(randomArray)
                .filter(number -> number == value)
                .count();
    }
}

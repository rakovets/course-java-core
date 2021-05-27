package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MathsStatistics {
    public static int[] getRandomNumber (int size, int firstNumber, int lastNumber) {
        return new Random()
                .ints(size, firstNumber, lastNumber)
                .toArray();
    }
    public static long getCountEvenNumber(int[] arrayNumbers) {
        return Arrays.stream(arrayNumbers)
                .filter(number -> number % 2 == 0)
                .count();
    }

    public static long getCountOddNumber(int[] arrayNumbers) {
        return Arrays.stream(arrayNumbers)
                .filter(number -> number % 2 != 0)
                .count();
    }

    public static long getCountZeroNumber(int[] arrayNumbers) {
        return Arrays.stream(arrayNumbers)
                .filter(number -> number == 0)
                .count();
    }

    public static long equalToValue(int[] arrayNumbers, int value) {
        return Arrays.stream(arrayNumbers)
                .filter(number -> number == value)
                .count();
    }
}


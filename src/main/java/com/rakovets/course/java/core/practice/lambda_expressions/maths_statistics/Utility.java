package com.rakovets.course.java.core.practice.lambda_expressions.maths_statistics;

import java.util.Random;
import java.util.stream.IntStream;

public class Utility {
    public int[] generateArrayOfRandomIntegers(int amountOfIntegers) {
        int[] arrayOfRandomIntegers = new int[amountOfIntegers];
        Random randomInteger = new Random();

        for (int i = 0; i < arrayOfRandomIntegers.length; i++) {
            arrayOfRandomIntegers[i] = randomInteger.nextInt();
        }
        return arrayOfRandomIntegers;
    }

    public long countEvenNumber(int[] array) {
        return IntStream.of(array)
                .filter(number -> number % 2 == 0)
                .count();
    }

    public long countOddNumber(int[] array) {
        return IntStream.of(array)
                .filter(number -> number % 2 != 0)
                .count();
    }

    public long countNumbersEqualZero(int[] array) {
        return IntStream.of(array)
                .filter(number -> number == 0)
                .count();
    }

    public long countNumbersEqualSetValue(int[] array, int setValue) {
        return IntStream.of(array)
                .filter(number -> number == setValue)
                .count();
    }
}

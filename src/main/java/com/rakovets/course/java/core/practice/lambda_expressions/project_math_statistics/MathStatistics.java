package com.rakovets.course.java.core.practice.lambda_expressions.project_math_statistics;

import java.util.stream.IntStream;

public class MathStatistics {
    public int[] generateArrayOfRandomInt(int sizeOfArray, int minValue, int maxValue) {
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (maxValue - minValue) + minValue);
        }
        return array;
    }

    public long getNumberOfEven(int[] array) {
        return IntStream.of(array)
                .filter(x -> x % 2 == 0 && x != 0)
                .count();
    }

    public long getNumberOfOdd(int[] array) {
        return IntStream.of(array)
                .filter(x -> x % 2 != 0)
                .count();
    }

    public long getNumberOfZero(int[] array) {
        return IntStream.of(array)
                .filter(x -> x == 0)
                .count();
    }

    public long getNumberOfSpecifiedIntNumber(int[] array, int specifiedIntNumber) {
        return IntStream.of(array)
                .filter(x -> x == specifiedIntNumber)
                .count();
    }
}

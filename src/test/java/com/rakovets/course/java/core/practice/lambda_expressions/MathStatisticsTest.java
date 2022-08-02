package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MathStatisticsTest {
    private final MathsStatistics mathsStatistics = new MathsStatistics();

    @Test
    public void testCountEvenNumbers() {
        int expected = 5;

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long actual = mathsStatistics.countEvenNumbers(numbers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenNumbersZeroEven() {
        int expected = 0;

        int[] numbers = {1, 3, 3, 5, 5, 7, 7, 9, 9, 9};
        long actual = mathsStatistics.countEvenNumbers(numbers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountOddNumbers() {
        int expected = 5;

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long actual = mathsStatistics.countOddNumbers(numbers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountOddNumbersZeroOdd() {
        int expected = 0;

        int[] numbers = {2, 2, 4, 4, 8, 6, 8, 8, 10, 10};
        long actual = mathsStatistics.countOddNumbers(numbers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountZero() {
        int expected = 2;

        int[] numbers = {1, 2, 3, 0, 5, 6, 7, 8, 0, 10};
        long actual = mathsStatistics.countEqualZero(numbers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountNoZero() {
        int expected = 0;

        int[] numbers = {1, 2, 3, 5, 5, 6, 7, 8, 6, 10};
        long actual = mathsStatistics.countEqualZero(numbers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountEqualValue() {
        int expected = 2;

        int[] numbers = {1, 5, 3, 0, 5, 6, 7, 8, 0, 10};
        long actual = mathsStatistics.countEqualNumberValue(numbers, 5);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountEqualValueNoValue() {
        int expected = 0;

        int[] numbers = {1, 1, 3, 0, 1, 6, 7, 8, 0, 10};
        long actual = mathsStatistics.countEqualNumberValue(numbers, 5);

        Assertions.assertEquals(expected, actual);
    }
}

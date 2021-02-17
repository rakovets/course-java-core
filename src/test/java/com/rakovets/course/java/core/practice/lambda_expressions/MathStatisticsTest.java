package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathStatisticsTest {

    @Test
    void getNumberOfEvenNumbers() {
        int[] numbersOfRandom = {1, 4, 16, 3, 12, 48};
        int expected = 4;

        int actual = MathStatistics.getNumberOfEvenNumbers(numbersOfRandom);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNumberOfOddNumbers() {
        int[] numbersOfRandom = {1, 4, 16, 3, 12, 48};
        int expected = 2;

        int actual = MathStatistics.getNumberOfOddNumbers(numbersOfRandom);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNumberOfZero() {
        int[] numbersOfRandom = {1, 0, 16, 3, 0, 48};
        int expected = 2;

        int actual = MathStatistics.getNumberOfZero(numbersOfRandom);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNumberOfValue() {
        int[] numbersOfRandom = {1, 4, 16, 3, 4, 48};
        int expected = 2;

        int actual = MathStatistics.getNumberOfValue(numbersOfRandom, 4);

        Assertions.assertEquals(expected, actual);
    }
}

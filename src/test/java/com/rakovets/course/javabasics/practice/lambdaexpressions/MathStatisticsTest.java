package com.rakovets.course.javabasics.practice.lambdaexpressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathStatisticsTest {
    private int[] array;
    private int countOfEvenNumbers;
    private int countOfOddNumbers;
    private int countOfZeroNumbers;
    private int countOfTwo;

    @BeforeEach
    void init() {
        array = new int[]{1, 3, 2, 7, 2, 0, 6, 0, 11};
        countOfEvenNumbers = 3;
        countOfOddNumbers = 4;
        countOfZeroNumbers = 2;
        countOfTwo = 2;
    }

    @Test
    void getCountOfEvenNumbersTest() {
        assertEquals(countOfEvenNumbers, MathStatistics.getCountOfEvenNumbers(array));
    }

    @Test
    void getCountOfOddNumbersTest() {
        assertEquals(countOfOddNumbers, MathStatistics.getCountOfOddNumbers(array));
    }

    @Test
    void getCountOfZeroNumbersTest() {
        assertEquals(countOfZeroNumbers, MathStatistics.getCountOfZeroNumbers(array));
    }

    @Test
    void getCountOfSomeNumbersTest() {
        assertEquals(countOfTwo, MathStatistics.getCountOfSomeNumbers(array, 2));
    }
}

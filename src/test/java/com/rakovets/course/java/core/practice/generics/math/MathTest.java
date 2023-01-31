package com.rakovets.course.java.core.practice.generics.math;

import org.junit.jupiter.api.*;

public class MathTest {
    Number[] array;
    Number result;
    Number expected;

    @BeforeEach
    void init() {
        array = new Number[]{4.0, 2.0, 3.0, 4.0, 5.0};
    }

    @DisplayName("Test maxOfThree(), returns maximum of three arguments")
    @Test
    void maxOfThreeTest() {
        result = Math.maxOfThree(1, 3, 4);
        expected = 4;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test minOfFive(), returns minimum of five arguments")
    @Test
    void minOfFiveTest() {
        result = Math.minOfFive(1, 3, 4, 6, 9);
        expected = 1;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test avgInArray(), returns average of all Numbers in array")
    @Test
    void avgInArrayTest() {
        result = Math.avgInArray(array);
        expected = 3.6;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test minInArray(), returns minimum of all Numbers in array")
    @Test
    void minInArrayTest() {
        result = Math.minInArray(array);
        expected = 2.0;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test binarySearch(), returns sorted array from minimum to maximum")
    @Test
    void bubbleSortTest() {
        Math.bubbleSort(array);
        Number[] expected = new Number[]{2.0, 3.0, 4.0, 4.0, 5.0};

        Assertions.assertArrayEquals(expected ,Math.bubbleSort(array));
    }

    @DisplayName("Test bubbleSort(), returns index of element to search in sorted array")
    @Test
    void binarySearch() {
        Math.bubbleSort(array);
        result = Math.binarySearch(array, 3.0);
        expected = 1;

        Assertions.assertEquals(expected, result);
    }
}

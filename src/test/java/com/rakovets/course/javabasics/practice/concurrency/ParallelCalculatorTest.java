package com.rakovets.course.javabasics.practice.concurrency;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ParallelCalculatorTest {

    ParallelCalculator obj = new ParallelCalculator();

    @Test
    public void shouldEqualHash() {
        int[] expectedResult = new int[] {100, 300};

        int[] arr1 = new int[] {1, 2, 3, 100, 5, 6};
        int[] arr2 = new int[] {1, 300, 3, 105, 5, 6};
        List<int[]> list = Arrays.asList(arr1, arr2);

        int[] actualResult = obj.getArrayWithRandom(list);

        assertArrayEquals(actualResult, expectedResult);
    }
}

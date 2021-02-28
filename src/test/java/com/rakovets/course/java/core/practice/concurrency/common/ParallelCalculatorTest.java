package com.rakovets.course.java.core.practice.concurrency.common;

import com.rakovets.course.java.core.practice.concurrency.common.parallel_calculator.ParallelCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ParallelCalculatorTest {
    @Test
    void calculate() {
        // GIVEN
        int[] first = new int[]{1, 2, 3};
        int[] second = new int[]{4, 5, 6};
        int[] third = new int[]{7, 8, 9};

        List<int[]> data = new ArrayList<>();
        Collections.addAll(data, first, second, third);

        Map<Integer, int[]> expectedMap = new HashMap<>();
        expectedMap.put(6, first);
        expectedMap.put(15, second);
        expectedMap.put(24, third);

        // WHEN
        Map<Integer, int[]> actualMap = ParallelCalculator.calculate(data);

        // THEN
        Assertions.assertEquals(expectedMap.entrySet(), actualMap.entrySet());
    }

    @Test
    void calculateInThreads() {
        // GIVEN
        int[] first = new int[]{1, 2, 3};
        int[] second = new int[]{4, 5, 6};
        int[] third = new int[]{7, 8, 9};

        List<int[]> data = new ArrayList<>();
        Collections.addAll(data, first, second, third);

        Map<Integer, int[]> expectedMap = new HashMap<>();
        expectedMap.put(6, first);
        expectedMap.put(15, second);
        expectedMap.put(24, third);

        // WHEN
        Map<Integer, int[]> actualMap = ParallelCalculator.calculateInThreads(data, 3);

        // THEN
        Assertions.assertEquals(expectedMap.entrySet(), actualMap.entrySet());
    }
}

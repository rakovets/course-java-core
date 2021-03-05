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

        Map<int[], Integer> expectedMap = new HashMap<>();
        expectedMap.put(first, 6);
        expectedMap.put(second, 15);
        expectedMap.put(third, 24);

        // WHEN
        Map<int[], Integer> actualMap = ParallelCalculator.calculate(data);

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

        Map<int[], Integer> expectedMap = new HashMap<>();
        expectedMap.put(first, 6);
        expectedMap.put(second, 15);
        expectedMap.put(third, 24);

        // WHEN
        Map<int[], Integer> actualMap = ParallelCalculator.calculateInThreads(data, 3);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Thread interrupted");
        }

        // THEN
        Assertions.assertEquals(expectedMap.entrySet(), actualMap.entrySet());
    }
}

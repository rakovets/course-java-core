package com.rakovets.course.java.core.practice.concurrent_utilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ImprovedParallelCalculatorTest {
    @Test
    void getSummaNumbersInAraysTest() {
        int[] firstArrayOfNumbers = new int[]{1, 2, 3};
        int[] secondArrayOfNumbers = new int[]{4, 5, 6};
        int[] thirdArrayOfNumbers = new int[]{7, 8, 9, 10};
        List<int[]> result = new ArrayList<>();
        Collections.addAll(result, firstArrayOfNumbers, secondArrayOfNumbers, thirdArrayOfNumbers);

        Map<int[], Integer> expectedMap = new HashMap<>();
        expectedMap.put(firstArrayOfNumbers, 6);
        expectedMap.put(secondArrayOfNumbers, 15);
        expectedMap.put(thirdArrayOfNumbers, 34);

        Map<int[], Integer> actualMap = ImprovedParallelCalculator.getSummaNumbersInArays(result);

        Assertions.assertEquals(expectedMap.entrySet(), actualMap.entrySet());
    }

    @Test
    void getSummaNumbersInAraysInThreadTest() {
        int[] firstArrayOfNumbers = new int[]{1, 2, 3};
        int[] secondArrayOfNumbers = new int[]{4, 5, 6};
        int[] thirdArrayOfNumbers = new int[]{7, 8, 9, 10};
        List<int[]> result = new ArrayList<>();
        Collections.addAll(result, firstArrayOfNumbers, secondArrayOfNumbers, thirdArrayOfNumbers);

        Map<int[], Integer> expectedMap = new HashMap<>();
        expectedMap.put(firstArrayOfNumbers, 6);
        expectedMap.put(secondArrayOfNumbers, 15);
        expectedMap.put(thirdArrayOfNumbers, 34);

        Map<int[], Integer> actualMap = ImprovedParallelCalculator.getSummaNumbersInAraysInThread(result, 4);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("InterruptedException");
        }

        Assertions.assertEquals(expectedMap.entrySet(), actualMap.entrySet());
    }
}

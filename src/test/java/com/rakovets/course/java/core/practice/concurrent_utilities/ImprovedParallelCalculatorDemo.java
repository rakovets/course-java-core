package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.*;

public class ImprovedParallelCalculatorDemo {
    public static void main(String[] args) {
        int[] firstArrayNumbers = new int[]{55, 66, 77};
        int[] secondArrayNumbers = new int[]{88, 99, 44};
        int[] thirdArrayNumbers = new int[]{11, 22, 33, 1};

        List<int[]> result = new ArrayList<>();
        Collections.addAll(result, firstArrayNumbers, secondArrayNumbers, thirdArrayNumbers);

        Map<int[], Integer> map = ImprovedParallelCalculator.getSummaNumbersInArays(result);
        for (Map.Entry<int[], Integer> item : map.entrySet()) {
            System.out.printf("Array: %s Summa numbers: %d \n", Arrays.toString(item.getKey()), item.getValue());
        }

        List<int[]> result1 = new ArrayList<>();
        for (int x = 0; x < 10; x++) {
            result1.add(new Random().ints(new Random().nextInt(1_000_000), 1, 301).toArray());
        }
        ImprovedParallelCalculator.getSummaNumbersInAraysInThread(result1, 1);
        ImprovedParallelCalculator.getSummaNumbersInAraysInThread(result1, 2);
        ImprovedParallelCalculator.getSummaNumbersInAraysInThread(result1, 5);
        ImprovedParallelCalculator.getSummaNumbersInAraysInThread(result1, 10);
    }
}

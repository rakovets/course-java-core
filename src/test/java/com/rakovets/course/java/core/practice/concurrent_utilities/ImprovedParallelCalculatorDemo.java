package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.*;

public class ImprovedParallelCalculatorDemo {
    public static void main(String[] args) {
        int[] firstArrayOfNumbers = new int[]{1, 2, 3};
        int[] secondArrayOfNumbers = new int[]{4, 5, 6};
        int[] thirdArrayOfNumbers = new int[]{7, 8, 9, 10};

        List<int[]> result = new ArrayList<>();
        Collections.addAll(result, firstArrayOfNumbers, secondArrayOfNumbers, thirdArrayOfNumbers);

        Map<int[], Integer> map = ImprovedParallelCalculator.getSummaNumbersInArays(result);
        for (Map.Entry<int[], Integer> item : map.entrySet()) {
            System.out.printf("Array numbers: %s Summa numbers in array: %d \n", Arrays.toString(item.getKey()), item.getValue());

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

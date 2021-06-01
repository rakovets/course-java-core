package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import com.rakovets.course.java.core.practice.improved_parallel_calculator.ImprovedParallelCalculator;

import java.util.*;

public class ImprovedParallelCalculatorDemo {
    public static void main(String[] args) {
        int[] firstArray = new int[]{123, 632, 2};
        int[] secondArray = new int[]{24, 934, 43, 35, 4, 3, 23};
        int[] thirdArray = new int[]{17, 22, 42, 24, 65};
        List<int[]> result = new ArrayList<>();
        List<int[]> resultInThread = new ArrayList<>();
        Collections.addAll(result, firstArray, secondArray, thirdArray);
        Map<int[], Integer> map = ImprovedParallelCalculator.getSum(result);

        for (Map.Entry<int[], Integer> item : map.entrySet()) {
            System.out.printf(" %s Sum of numbers : %d \n", Arrays.toString(item.getKey()), item.getValue());
        }
        for (int x = 0; x < 10; x++) {
            resultInThread.add(new Random()
                    .ints(new Random()
                            .nextInt(1_000_000), 1, 301).toArray());
        }
        ImprovedParallelCalculator.getSumInThread(resultInThread, 1);
        ImprovedParallelCalculator.getSumInThread(resultInThread, 2);
        ImprovedParallelCalculator.getSumInThread(resultInThread, 5);
        ImprovedParallelCalculator.getSumInThread(resultInThread, 10);
    }
}

package com.rakovets.course.java.core.practice.concurrency.common.parallel_calculator;

import java.util.*;

public class ArraySum {
    public static Map<int[], Integer> getArraySum(List<int[]> arraysList) {
        Map<int[], Integer> sumMap = new HashMap<>();
        for (int[] array : arraysList) {
            int sum = Arrays.stream(array).sum();
            sumMap.put(array, sum);
        }
        return sumMap;
    }

    public static Map<int[], Integer> getArraySumThroughThreads(List<int[]> arraysList, int threads) throws InterruptedException {
        Map<int[], Integer> sumMap = new HashMap<>();
        List<int[]> copyOfArrayList = new ArrayList<>(arraysList);
        for (int i = 1; i < arraysList.size() + 1/threads; i++) {
            Thread thread = new Thread(new SumThread(copyOfArrayList, sumMap));
            thread.start();
            thread.join();
        }
        return sumMap;
    }
}



package com.rakovets.course.java.core.practice.concurrency;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ParallelCalculator {
    public static Map<int[], Integer> getSum(List<int[]> list) {
        Map<int[], Integer> hashMap = new HashMap<>();

        for (int[] arr : list) {
            int sum = 0;
            for (Integer num : arr) {
                sum += num;
            }
            hashMap.put(arr, sum);
        }
        return hashMap;
    }

    public static Map<int[], Integer> fewThreads(List<int[]> list, int threadsQuantity) {
        Map<int[], Integer> mapSumThreads = new HashMap<>();
        Stack<int[]> stack = new Stack<>();
        stack.addAll(list);
        long startTime = System.currentTimeMillis();
        String numberOfThreads = "" + threadsQuantity;

        Runnable runnable = () -> {
            while (!stack.isEmpty()) {
                try {
                    int[] array = stack.pop();
                    int sum = 0;
                    for (int num : array) {
                        sum += num;
                    }
                    mapSumThreads.put(array, sum);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            long timeSpent = System.currentTimeMillis() - startTime;
            System.out.println(numberOfThreads + " Threads spent " + timeSpent + " milliseconds");
        };

        for (int x = 0; x <= threadsQuantity; x++) {
            new Thread(runnable).start();
        }
        return mapSumThreads;
    }
}

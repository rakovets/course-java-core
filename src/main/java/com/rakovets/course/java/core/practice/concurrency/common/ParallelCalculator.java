package com.rakovets.course.java.core.practice.concurrency.common;

import java.util.*;

public class ParallelCalculator {

    public static Map<Integer, int[]> getSum(List<int[]> list) {
        Map<Integer, int[]> hashMap = new HashMap<>();

        for (int[] arr : list) {
            int sum = 0;
            for (Integer num : arr) {
                sum += num;
            }
            hashMap.put(sum, arr);
        }
        return hashMap;
    }

    public static Map<Integer, int[]> fewThreads(List<int[]> list, int threadsQuantity) {
        Map<Integer, int[]> mapSumThreads = new HashMap<>();
        List<int[]> list1 = new ArrayList<>(list);
        long startTime = System.currentTimeMillis();
        String numberOfThreads = "" + threadsQuantity;

        Runnable runnable = () -> {
            while (!list1.isEmpty()) {
                try {
                    int[] array = list1.remove(0);
                    int sum = 0;
                    for (int num : array) {
                        sum += num;
                    }
                    mapSumThreads.put(sum, array);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            long timeSpent = System.currentTimeMillis() - startTime;
            System.out.println(numberOfThreads + " Threads spent " + timeSpent +" milliseconds");
        };

        for (int x = 0; x <= threadsQuantity; x++) {
            new Thread(runnable).start();
        }
        return mapSumThreads;
    }
}

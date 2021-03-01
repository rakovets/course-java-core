package com.rakovets.course.java.core.practice.concurrency.common.ParallelCalculator;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ParallelCalculator {
    private final List<Integer[]> listOfArrays = new ArrayList<>();

    public Map<List<Integer[]>, Integer> arraysAndSum(List<Integer[]> listOfArrays) {
        Map<List<Integer[]>, Integer> arraysAndSum = new HashMap<>();
        arraysAndSum.put(listOfArrays, sum(listOfArrays));
        return arraysAndSum;
    }

    public List<Integer[]> listOfArrays(int numberOfArrays) {
        Integer[] arr = new Integer[(int) (Math.random() * 1000000) + 1];
        for (int i = 1; i <= numberOfArrays; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = (int) (Math.random() * 300);
            }
            listOfArrays.add(arr);
        }
        return listOfArrays;
    }

    public int sum(List<Integer[]> listOfArrays) {
        int sum = 0;
        for (Integer[] arr : listOfArrays) {
            for (int num : arr) {
                sum = sum + num;
            }
        }
        return sum;
    }

    public void sumInDifferentThreads(int numberOfThreads, List<Integer[]> listOfArrays) {
        int arraysInThread;
        if (listOfArrays.size() % numberOfThreads == 0)
            arraysInThread = listOfArrays.size() / numberOfThreads;
        else
            arraysInThread = listOfArrays.size() / numberOfThreads + 1;
        int i;
        for (i = 0; i < numberOfThreads; i++) {
            int finalI = i;
            Runnable runnable = () -> {
                AtomicInteger j = new AtomicInteger();
                for (j.set(finalI * arraysInThread); j.get() < (finalI + 1) * arraysInThread; j.getAndIncrement()) {
                    sum(listOfArrays);
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}

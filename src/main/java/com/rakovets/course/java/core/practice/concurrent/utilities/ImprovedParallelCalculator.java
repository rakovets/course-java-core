package com.rakovets.course.java.core.practice.concurrent.utilities;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class ImprovedParallelCalculator {

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
        CopyOnWriteArrayList<int[]> list1 = new CopyOnWriteArrayList<>(list);
        ReentrantLock lock = new ReentrantLock();
        long startTime = System.currentTimeMillis();
        String numberOfThreads = "" + threadsQuantity;

        Runnable calculatorThread = () -> {
            while (!list1.isEmpty()) {
                lock.lock();
                if (!list1.isEmpty()) {
                    int[] array = list1.remove(0);
                    lock.unlock();
                    int sum = 0;
                    for (int num : array) {
                        sum += num;
                    }
                    mapSumThreads.put(array, sum);
                } else {
                    lock.unlock();
                }
            }
            System.out.println("Thread " + numberOfThreads + " - " + (System.currentTimeMillis() - startTime));
        };

        for (int x = 0; x < threadsQuantity; x++) {
            new Thread(calculatorThread).start();
        }
        return mapSumThreads;
    }
}

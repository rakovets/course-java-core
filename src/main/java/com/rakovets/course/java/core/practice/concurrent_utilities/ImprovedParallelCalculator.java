package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public class ImprovedParallelCalculator {
    public static Map<int[], Integer> getSummaNumbersInArays(List<int[]> numbers) {
        Map<int[], Integer> result = new HashMap<>();
        for (int[] arrays : numbers) {
            OptionalInt summa = Arrays.stream(arrays)
                    .reduce(Integer::sum);
            if (summa.isPresent()) {
                result.put(arrays, summa.getAsInt());
            }
        }
        return result;
    }

    public static Map<int[], Integer> getSummaNumbersInAraysInThread(List<int[]> numbers, int numberOfThreads) {
        Map<int[], Integer> result = new HashMap<>();
        CopyOnWriteArrayList<int[]> arrayListInThread = new CopyOnWriteArrayList<>(numbers);
        ReentrantLock lock = new ReentrantLock();
        long startTime = System.currentTimeMillis();
        String markerOfThread = "" + numberOfThreads;

        Runnable calculateThread = () -> {
            while (!arrayListInThread.isEmpty()) {
                lock.lock();
                if (!arrayListInThread.isEmpty()) {
                    int[] arrays = arrayListInThread.remove(0);
                    lock.unlock();
                    OptionalInt summa = Arrays.stream(arrays)
                            .reduce(Integer::sum);
                    if (summa.isPresent()) {
                        result.put(arrays, summa.getAsInt());
                    }
                } else {
                    lock.unlock();
                }

            }
            System.out.println(markerOfThread + " - " + (System.currentTimeMillis() - startTime));
        };
        Executor executor = e -> new Thread(e).start();
        for (int x = 1; x <= numberOfThreads; x++) {
            executor.execute(calculateThread);
        }
        return result;
    }
}

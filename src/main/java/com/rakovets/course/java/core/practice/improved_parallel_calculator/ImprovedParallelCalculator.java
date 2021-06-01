package com.rakovets.course.java.core.practice.improved_parallel_calculator;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public class ImprovedParallelCalculator {
    public static Map<int[], Integer> getSum(List<int[]> numbers) {
        Map<int[], Integer> result = new HashMap<>();
        for (int[] number : numbers) {
            OptionalInt sum = Arrays.stream(number)
                    .reduce(Integer::sum);
            if (sum.isPresent()) {
                result.put(number, sum.getAsInt());
            }
        }
        return result;
    }

    public static Map<int[], Integer> getSumInThread(List<int[]> numbers, int numberOfThread) {
        Map<int[], Integer> result = new HashMap<>();
        long startTime = System.currentTimeMillis();
        CopyOnWriteArrayList<int[]> arrayList = new CopyOnWriteArrayList<>(numbers);
        ReentrantLock reentrantLock = new ReentrantLock();
        String markerOfThread = " " + numberOfThread;

        Runnable calculateThread = () -> {
            while (!arrayList.isEmpty()) {
                reentrantLock.lock();
                if (!arrayList.isEmpty()) {
                    int[] array = arrayList.remove(0);
                    reentrantLock.unlock();
                    OptionalInt sum = Arrays.stream(array)
                            .reduce(Integer::sum);
                    if (sum.isPresent()) {
                        result.put(array, sum.getAsInt());
                    }
                } else {
                    reentrantLock.unlock();
                }
            }
            System.out.println(markerOfThread + " - " + (System.currentTimeMillis() - startTime));
        };
        Executor executor = e -> new Thread(e).start();
        for (int i = 1; i <= numberOfThread; i++) {
            executor.execute(calculateThread);
        }
        return result;
    }
}

package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ParallelCalculator {
    public Map<Integer[], Integer> getSumArrays(List<Integer[]> arrays) {
        Map<Integer[], Integer> arraysSum = new HashMap<>();
        int sumArray = 0;
        for (var iterator : arrays) {
            for (var jump : iterator) {
                sumArray += jump;
            }
            arraysSum.put(iterator, sumArray);
            sumArray = 0;
        }
        return arraysSum;
    }

    public static Map<Integer[], Integer> calculateWithThreads(List<Integer[]> arraysOfInt, int numberOfThreads) {
        Map<Integer[], Integer> map = new HashMap<>();
        List<Integer[]> list = new ArrayList<>(arraysOfInt);
        long startTime = System.currentTimeMillis();
        ReentrantLock locker = new ReentrantLock();
        Runnable task = () -> {
            while (!list.isEmpty()) {
                locker.lock();
                if (!list.isEmpty()) {
                    Integer[] array = list.remove(0);
                    locker.unlock();
                    Optional<Integer> sum = Arrays.stream(array).reduce(Integer::sum);
                    sum.ifPresent(integer -> map.put(array, integer));
                } else {
                    locker.unlock();
                }
            }
            System.out.printf("%d Threads: %d ms\n", numberOfThreads, System.currentTimeMillis() - startTime);
        };
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        for (int x = 0; x < numberOfThreads; x++) {
            executorService.execute(task);
        }
        executorService.shutdown();
        return map;
    }
}

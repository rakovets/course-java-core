package com.rakovets.course.java.core.practice.concurrent.utilities.parallelCalculator;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ParallelCalculator {
    public static Map<int[], Integer> calculateWithThreads(List<int[]> arraysOfInt, int numberOfThreads, AnsiColorCode codes) {
        Map<int[], Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>(arraysOfInt);
        long startTime = System.currentTimeMillis();
        ReentrantLock locker = new ReentrantLock();
        Runnable task = () -> {
            while (!list.isEmpty()) {
                locker.lock();
                if (!list.isEmpty()) {
                    int[] array = list.remove(0);
                    locker.unlock();
                    OptionalInt sum = Arrays.stream(array).reduce(Integer::sum);
                    if (sum.isPresent()) {
                        map.put(array, sum.getAsInt());
                    }
                } else {
                    locker.unlock();
                }
            }
                    System.out.printf(codes + "%d Threads: %d ms\n" + codes, numberOfThreads, System.currentTimeMillis() - startTime);
        };
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        for (int x = 0; x < numberOfThreads; x++) {
            executorService.execute(task);
        }
        executorService.shutdown();
        return map;
    }
}

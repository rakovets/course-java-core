package com.rakovets.course.java.core.practice.concurrent.utilities.parallelCalculator;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public abstract class ParallelCalculator {
    public static Map<int[], Integer> calculate(List<int[]> arraysOfInt) {
        Map<int[], Integer> map = new HashMap<>();
        for (int[] number : arraysOfInt) {
            OptionalInt sum = Arrays.stream(number).reduce(Integer::sum);
            if (sum.isPresent()) {
                map.put(number, sum.getAsInt());
            }
        }
        return map;
    }

    public static Map<int[], Integer> calculateWithThreads(List<int[]> arraysOfInt, int numberOfThreads, AnsiColorCode codes) {
        Map<int[], Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>(arraysOfInt);
        long startTime = System.currentTimeMillis();
        ReentrantLock locker = new ReentrantLock();
        Runnable thread = () -> {
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
        for (int x = 1; x <= numberOfThreads; x++) {
            new Thread(thread).start();
        }
        return map;
    }
}

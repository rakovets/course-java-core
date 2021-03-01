package com.rakovets.course.java.core.practice.concurrency.common.parallelCalculator;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.*;

public abstract class ParallelCalculator {
    public static Map<Integer, int[]> calculate(List<int[]> arraysOfInt) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int[] number : arraysOfInt) {
            OptionalInt sum = Arrays.stream(number).reduce(Integer::sum);
            if (sum.isPresent()) {
                map.put(sum.getAsInt(), number);
            }
        }
        return map;
    }

    public static Map<Integer, int[]> calculateWithThreads(List<int[]> arraysOfInt, int numberOfThreads, AnsiColorCode codes) {
        Map<Integer, int[]> map = new HashMap<>();
        List<int[]> list = new ArrayList<>(arraysOfInt);
        long startTime = System.currentTimeMillis();
        Runnable thread = () -> {
            while (!list.isEmpty()) {
                try {
                    int[] array = list.remove(0);
                    OptionalInt sum = Arrays.stream(array).reduce(Integer::sum);
                    if (sum.isPresent()) {
                        map.put(sum.getAsInt(), array);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
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

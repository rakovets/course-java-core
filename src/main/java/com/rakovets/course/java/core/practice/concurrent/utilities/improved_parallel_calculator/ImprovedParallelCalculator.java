package com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public abstract class ImprovedParallelCalculator {
    public static Map<int[], Integer> calculate(List<int[]> data) {
        Map<int[], Integer> result = new HashMap<>();
        for (int[] member : data) {
            OptionalInt sum = Arrays.stream(member).reduce(Integer::sum);
            if (sum.isPresent()) {
                result.put(member, sum.getAsInt());
            }
        }
        return result;
    }

    public static Map<int[], Integer> calculateInThreads(List<int[]> data, int numberOfThreads) {
        Map<int[], Integer> result = new HashMap<>();
        CopyOnWriteArrayList<int[]> stackForProcessing = new CopyOnWriteArrayList<>(data);
        long start = System.currentTimeMillis();
        String marker = String.format("Thread of %d threads", numberOfThreads);

        Runnable calculatorUnit = () -> {
                while (!stackForProcessing.isEmpty()) {
                    int[] array = stackForProcessing.remove(0);
                    OptionalInt sum = Arrays.stream(array).reduce(Integer::sum);
                    if (sum.isPresent()) {
                        result.put(array, sum.getAsInt());
                    }
                }
            System.out.println(marker + " - " + (System.currentTimeMillis() - start));
        };

        Executor executor = (runnable) -> new Thread(runnable).start();

        for (int x = 1; x <= numberOfThreads; x++) {
            executor.execute(calculatorUnit);
        }
        return result;
    }
}

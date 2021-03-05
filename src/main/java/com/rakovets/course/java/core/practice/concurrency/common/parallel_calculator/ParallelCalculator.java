package com.rakovets.course.java.core.practice.concurrency.common.parallel_calculator;

import java.util.*;

public abstract class ParallelCalculator {
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
        Stack<int[]> stackForProcessing = new Stack<>();
        stackForProcessing.addAll(data);
        long start = System.currentTimeMillis();
        String marker = String.format("Thread of %d threads", numberOfThreads);

        Runnable calculatorUnit = () -> {
            while (!stackForProcessing.isEmpty()) {
                int[] array = stackForProcessing.pop();
                OptionalInt sum = Arrays.stream(array).reduce(Integer::sum);
                if (sum.isPresent()) {
                    result.put(array, sum.getAsInt());
                }
            }
            System.out.println(marker + " - " + (System.currentTimeMillis() - start));
        };

        for (int x = 1; x <= numberOfThreads; x++) {
            new Thread(calculatorUnit).start();
        }
        return result;
    }
}

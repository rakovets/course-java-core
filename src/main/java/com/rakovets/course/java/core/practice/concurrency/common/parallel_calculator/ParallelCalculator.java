package com.rakovets.course.java.core.practice.concurrency.common.parallel_calculator;

import java.util.*;

public abstract class ParallelCalculator {
    public static Map<Integer, int[]> calculate(List<int[]> data) {
        Map<Integer, int[]> result = new HashMap<>();
        for (int[] member : data) {
            OptionalInt sum = Arrays.stream(member).reduce(Integer::sum);
            if (sum.isPresent()) {
                result.put(sum.getAsInt(), member);
            }
        }
        return result;
    }

    public static Map<Integer, int[]> calculateInThreads(List<int[]> data, int numberOfThreads) {
        Map<Integer, int[]> result = new HashMap<>();
        List<int[]> listForProcessing = new ArrayList<>(data);
        long start = System.currentTimeMillis();
        String marker = String.format("Thread of %d threads", numberOfThreads);

        Runnable calculatorUnit = () -> {
            while (!listForProcessing.isEmpty()) {
                try {
                    int[] array = listForProcessing.remove(0);
                    OptionalInt sum = Arrays.stream(array).reduce(Integer::sum);
                    if (sum.isPresent()) {
                        result.put(sum.getAsInt(), array);
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
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

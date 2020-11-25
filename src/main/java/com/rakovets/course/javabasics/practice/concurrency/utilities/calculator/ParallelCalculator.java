package com.rakovets.course.javabasics.practice.concurrency.utilities.calculator;

import com.rakovets.course.javabasics.practice.concurrency.utilities.calculator.model.ArrayMax;

import java.util.*;
import java.util.concurrent.*;

public class ParallelCalculator<T> implements Callable<T> {
    private static List<ArrayMax> result;
    private final int[] array;

    public ParallelCalculator(int[] array) {
        this.array = array;
    }

    public static List<ArrayMax> calcMax(List<int[]> list){
        int defaultNumberOfThreads = 1;
        return calcMax(list, defaultNumberOfThreads);
    }

    public static List<ArrayMax> calcMax(List<int[]> list, int numberOfThreads){
        result = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        List<Callable<Object>> calculators = new ArrayList<>();
        for(int[] array : list) {
            calculators.add(new ParallelCalculator<>(array));
        }
        try {
            executor.invokeAll(calculators);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();
        return new ArrayList<>(result);
    }

    @Override
    public T call() {
        int max = Arrays.stream(array).max().getAsInt();
        result.add(new ArrayMax(array, max));
        return null;
    }
}

package com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.service;

import com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.model.ArrayAndSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ImprovedParallelCalculatorService implements Callable<Integer> {
    private static final List<Callable<Integer>> callableTasks = new ArrayList<>();
    private final int[] array;
    private static final List<ArrayAndSum> arrayAndSum = new ArrayList<>();

    public ImprovedParallelCalculatorService(int[] array) {
        this.array = array;
    }

    public static List<ArrayAndSum> arraysAndSum(List<int[]> listOfArrays, int numberOfThreads) {
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        for (int[] array : listOfArrays) {
            callableTasks.add(new ImprovedParallelCalculatorService(array));
        }
        try {
            executor.invokeAll(callableTasks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();
        try {
            if (!executor.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
        return new ArrayList<>(arrayAndSum);
    }

    public Integer call() {
        int sum = Arrays.stream(array).sum();
        arrayAndSum.add(new ArrayAndSum(array, sum));
        return null;
    }
}

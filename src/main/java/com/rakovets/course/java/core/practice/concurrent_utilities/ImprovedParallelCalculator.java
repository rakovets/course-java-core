package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ImprovedParallelCalculator {
    private final List<Callable<int[]>> list = new ArrayList<>();
    private final Map<int[], Integer> map = new HashMap<>();
    private final ExecutorService executorService;
    private final Random random = new Random();

    public ImprovedParallelCalculator(int amountOfThreads) {
        this.executorService = Executors.newFixedThreadPool(amountOfThreads);
    }

    public int[] createArray(int amountOfNumbersInArray, int bottomLine, int upperLine) {
        return random.
                ints(amountOfNumbersInArray, bottomLine, upperLine).toArray();
    }

    public int getSum(int[] array) {
        return Arrays.stream(array).sum();
    }

    public List<int[]> createListOfArrays(int amountOfArrays, int amountOfNumbersInArray, int bottomLine, int upperLine) throws InterruptedException {
        for (int i = 0; i < amountOfArrays; i++) {
            list.add(() -> createArray(amountOfNumbersInArray, bottomLine, upperLine));
        }
        List<Future<int[]>> result = executorService.invokeAll(list);
        return result.stream().map(e -> {
            try {
                return e.get();
            } catch (InterruptedException | ExecutionException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(Collectors.toList());
    }

    public Map<int[], Integer> calculate(List<int[]> list) throws InterruptedException {
        for (int[] ints : list) {
            executorService.submit(() -> map.put(ints, getSum(ints)));
        }
        executorService.shutdown();
        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        return map;
    }
}

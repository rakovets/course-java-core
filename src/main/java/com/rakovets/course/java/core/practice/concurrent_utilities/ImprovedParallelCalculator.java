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
import java.util.stream.Collectors;

public class ImprovedParallelCalculator {
    private final List<Callable<int[]>> list = new ArrayList<>();
    private final Map<String, Integer> map = new HashMap<>();

    public int[] createArray() {
        Random random = new Random();
        return random.
                ints(1000000, 1, 300).toArray();
    }

    public int getSum(int[] array) {
        return Arrays.stream(array).sum();
    }

    public Map<String, Integer> calculate(int amountOfThreads, int amountOfArrays) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(amountOfThreads);
        for (int i = 0; i < amountOfArrays; i++) {
            list.add(this::createArray);
        }
        List<Future<int[]>> result = executorService.invokeAll(list);
        List<int[]> listOfArray = result.stream().map(e -> {
            try {
                return e.get();
            } catch (InterruptedException | ExecutionException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(Collectors.toList());
        for (int[] ints : listOfArray) {
            executorService.submit(() -> map.put(Arrays.toString(ints), getSum(ints)));
        }
        executorService.shutdown();
        System.out.println(map);
        return map;
    }
}

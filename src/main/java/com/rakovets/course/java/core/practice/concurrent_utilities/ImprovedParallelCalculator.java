package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ImprovedParallelCalculator {
    public List<int[]> createList(int amountOfArrays) {
        List<int[]> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < amountOfArrays; i++) {
            list.add(random.
                    ints(1000000, 1, 300).toArray());
        }
        return list;
    }

    public Map<int[], Integer> getSum(List<int[]> list) {
        Map<int[], Integer> map = new HashMap<>();
        for (int[] ints : list) {
            map.put(ints, Arrays.stream(ints).sum());
        }
        return map;
    }

    public Future<Map> countSumOfArray(List list, int amountOfThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(amountOfThreads);
        Future<Map> future = executorService.submit(() -> getSum(list));
        return future;
    }
}

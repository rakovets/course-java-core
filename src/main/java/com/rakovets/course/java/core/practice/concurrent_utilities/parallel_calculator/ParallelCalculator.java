package com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public class ParallelCalculator {
    public Map<Integer[], Integer> oneThreadCalculation(Queue<Integer[]> arrays) {
        Map<Integer[], Integer> result = new HashMap<>();
        for (Integer[] array : arrays) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            result.put(array, sum);
        }
        return result;
    }

    public ConcurrentHashMap<Integer[], Integer> multiThreadsCalculation(Queue<Integer[]> arrays, int numberOfThreads) {
        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread();
            thread.setName("Thread" + i);
            thread.start();
        }
        ConcurrentHashMap<Integer[], Integer> result = new ConcurrentHashMap<>();
        for (Integer[] array : arrays) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            result.put(array, sum);
        }
        return result;
    }
}

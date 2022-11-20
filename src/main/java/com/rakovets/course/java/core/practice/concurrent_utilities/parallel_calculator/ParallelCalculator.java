package com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator;

import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.Container;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.logging.Logger;

public class ParallelCalculator {
    private final Logger logger = Logger.getLogger(ParallelCalculator.class.getName());

    private final Map<Integer[], Integer> finalList;

    public ParallelCalculator(Map<Integer[], Integer> finalList) {
        this.finalList = finalList;
    }

    public Map<Integer[], Integer> oneCalculation(Queue<Integer[]> arrays) {
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

    public void multiThreadCalculation(Queue<Integer[]> arrays, int numberOfThreads) {
        int arraysOnOneThread = arrays.size() / numberOfThreads;
        Queue<Integer[]> arraysForThisThread = new LinkedList<>();
        try {
            for (int i = 0; i < arraysOnOneThread; i++) {
                Integer[] oneArray = arrays.poll();
                arraysForThisThread.add(oneArray);
            }
            for (Integer[] array : arraysForThisThread) {
                int sum = 0;
                for (int num : array) {
                    sum += num;
                }
                finalList.put(array, sum);
            }
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
    }
}

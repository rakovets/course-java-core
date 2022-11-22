package com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator;

import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.Container;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class ParallelCalculator {
    private final Logger logger = Logger.getLogger(ParallelCalculator.class.getName());
    private final ReentrantLock locker;
    private final Map<Integer[], Integer> finalList;

    public ParallelCalculator(Map<Integer[], Integer> finalList, ReentrantLock locker) {
        this.finalList = finalList;
        this.locker = locker;
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
            while (!arrays.isEmpty()) {
                locker.lock();
                for (int i = 0; i < arraysOnOneThread; i++) {
                    Integer[] oneArray = arrays.poll();
                    arraysForThisThread.add(oneArray);
                }
                locker.unlock();
                for (Integer[] array : arraysForThisThread) {
                    int sum = 0;
                    for (int num : array) {
                        sum += num;
                    }
                    finalList.put(array, sum);
                }
            }
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
    }
}

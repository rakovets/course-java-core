package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class ParallelCalculator {
    private static final Logger logger = Logger.getLogger(ParallelCalculator.class.getName());

    public List<Pair> getNumbersAndSum(List<int[]> arrays) {
        List<Pair> pairs = new ArrayList<>();
        for (int[] array : arrays) {
            Pair pair = new Pair();
            pair.setSum(Arrays.stream(array).sum());
            pair.setArray(array);
            pairs.add(pair);
        }
        return pairs;
    }

    public List<Pair> getNumbersAndSumWithSomeThreads(List<int[]> arrays, int countOfThread) {
        List<Pair> pairs = new ArrayList<>();
        List<int[]> arraysCopy = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        ReentrantLock locker = new ReentrantLock();

        Runnable threadCalculator = () -> {
            locker.lock();
            if (!arraysCopy.isEmpty()) {
                int[] array = arraysCopy.remove(0);
                locker.unlock();
                Pair pair = new Pair();
                pair.setSum(Arrays.stream(array).sum());
                pair.setArray(array);
                pairs.add(pair);
            } else {
                locker.unlock();
            }
            logger.info("Thread " + countOfThread + " worked time: " + (System.currentTimeMillis() - startTime));
        };

        ExecutorService poolThread = Executors.newFixedThreadPool(countOfThread);
        for (int i = 1; i < countOfThread; i++) {
            poolThread.execute(threadCalculator);
        }
        poolThread.shutdown();
        return pairs;
    }
}

package com.rakovets.course.java.core.practice.concurrent_utilities.ImprovedParallelCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class ParallelCalculator {
    private static final Logger LOGGER = Logger.getLogger(ParallelCalculator.class.getName());

    public List<Pair> getArraysAndSumOfTheirElements(List<int[]> arraysList) {
        List<Pair> pairs = new ArrayList<>();
        for (int[] i : arraysList) {
            pairs.add(new Pair(i, Arrays.stream(i).sum()));
        }
        return pairs;
    }

    public List<Pair> getArraysAndSumUsingThreads(List<int[]> arraysList, int threadCounter) {
        List<Pair> pairs = new ArrayList<>();
        List<int[]> arraysListCopy = new ArrayList<>();
        ReentrantLock reentrantLock = new ReentrantLock();
        long start = System.currentTimeMillis();

        Runnable calculatorUsingThreads = () -> {
            reentrantLock.lock();
            if(!arraysListCopy.isEmpty()) {
                arraysListCopy.remove(0);
                reentrantLock.unlock();
                for (int[] ints : arraysList) {
                    pairs.add(new Pair(ints, Arrays.stream(ints).sum()));
                }
            } else {
                reentrantLock.unlock();
            }
            LOGGER.info("Thread " + threadCounter + " : " + (System.currentTimeMillis() - start));
        };

        ExecutorService executorService = Executors.newFixedThreadPool(threadCounter);
        for(int i = 1; i < threadCounter; i++) {
            executorService.execute(calculatorUsingThreads);
        }
        executorService.shutdown();
        return pairs;
    }
}

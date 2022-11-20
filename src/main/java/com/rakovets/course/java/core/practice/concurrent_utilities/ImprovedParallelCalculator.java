package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class ImprovedParallelCalculator {
    public static final Logger logger = Logger.getLogger(ImprovedParallelCalculator.class.getName());

    public List<Pair> getArrayAndSum(List<int[]> list) {
        List<Pair> pairs = new ArrayList<>();
        for (int[] array : list) {
            long sum = 0;
            for (int number : array) {
                sum += number;
            }
            Pair pair = new Pair();
            pair.setSum(sum);
            pair.setArray(array);
            pairs.add(pair);
        }
        return pairs;
    }

    public List<Pair> getArraySumAndAcceptingCountOfThreads(List<int[]> list, int countThread) {
        List<Pair> pairs = new ArrayList<>();
        List<int[]> listCopy = new ArrayList<>(list);
        long startTime = System.currentTimeMillis();
        ReentrantLock lock = new ReentrantLock();

        Runnable calculatorWithThread = () -> {
            lock.lock();
            if (!listCopy.isEmpty()) {
                int[] array = listCopy.remove(0);
                lock.unlock();
                long sum = 0;
                for (int number : array) {
                    sum += number;
                }
                Pair pair = new Pair();
                pair.setSum(sum);
                pair.setArray(array);
                pairs.add(pair);
            } else {
                lock.unlock();
            }
            logger.info("Thread " + countThread + " - " + (System.currentTimeMillis() - startTime));
        };

        ExecutorService executor = Executors.newFixedThreadPool(countThread);
        for (int i = 1; i <= countThread; i++) {
            executor.execute(calculatorWithThread);
        }
        executor.shutdown();
        return pairs;
    }
}

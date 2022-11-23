package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class ImprovedParallelCalculator {
    public static final Logger logger = Logger.getLogger(ImprovedParallelCalculator.class.getName());
    private final Lock lock = new ReentrantLock();

    public List<Pair> getArrayAndSum(List<int[]> list) {
        List<Pair> pairs = new ArrayList<>();
        for (int[] ints : list) {
            pairs.add(new Pair(Arrays.stream(ints).sum(), ints));
        }
        return pairs;
    }

    public List<Pair> getArraySumAndAcceptingCountOfThreads(List<int[]> list, int countThread) {
        List<Pair> pairs = Collections.synchronizedList(new ArrayList<>(list.size()));
        try {
            lock.lock();
            CountDownLatch latch = new CountDownLatch(list.size());
            ExecutorService es = Executors.newFixedThreadPool(countThread);
            for (int[] ints : list) {
                es.execute(() -> {
                    pairs.add(new Pair(Arrays.stream(ints).sum(), ints));
                    latch.countDown();
                });
            }
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
        return pairs;
    }
}

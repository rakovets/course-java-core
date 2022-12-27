package com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class ParallelCalculator extends Calculator {
    public static final Logger logger = Logger.getLogger(ParallelCalculator.class.getName());
    private final ReentrantLock locker = new ReentrantLock();

    public List<PairSumArray> getArraySumAcceptingCountOfThreads(List<int[]> list, int countThread) {
        List<PairSumArray> pairs = Collections.synchronizedList(new ArrayList<>(list.size()));
        logger.info("Calculating in " + countThread + " thread started. Time: " + LocalDateTime.now());
        try {
            locker.lock();
            CountDownLatch latch = new CountDownLatch(list.size());
            ExecutorService es = Executors.newFixedThreadPool(countThread);
            for (int[] ints : list) {
                es.execute(() -> {
                    pairs.add(new PairSumArray(Arrays.stream(ints).sum(), ints));
                    latch.countDown();
                });
            }
            es.shutdown();
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            locker.unlock();
        }
        logger.info("Calculating in " + countThread + " thread ended. Time: " + LocalDateTime.now());
        return pairs;
    }
}

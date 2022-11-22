package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class ImprovedParallelCalculator extends Thread {
    private static final Logger logger = Logger.getLogger(ImprovedParallelCalculator.class.getName());
    private ReentrantLock locker = new ReentrantLock();

    public Map<String, Integer> getMapArraysAndSumArrays(List<int[]> list) {
        Map<String, Integer> map = new HashMap<>();
        for (int[] array : list) {
            map.put(Arrays.toString(array), Arrays.stream(array).sum());
        }
        return map;
    }

    public Map<String, Integer> getMapArraysAndSumArraysInThreads(List<int[]> list, int countThread) {
        Map<String, Integer> map = new HashMap<>();

        Date currentTime = new Date();
        for (int i = 0; i < countThread; i++) {
            Thread thread = new Thread();
            thread.start();
            locker.lock();
            for (int[] array : list) {
                map.put(Arrays.toString(array), Arrays.stream(array).sum());
            }
            locker.unlock();
        }
        Date newTime = new Date();
        logger.info("Time work: " + (newTime.getTime() - currentTime.getTime()) + " ms.");
        return map;
    }
}

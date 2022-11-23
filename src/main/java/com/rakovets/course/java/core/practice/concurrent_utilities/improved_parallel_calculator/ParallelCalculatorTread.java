package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ParallelCalculatorTread {
    public Map<String, Integer> getListArraysAndSumOfArraysDigitTread(List<int[]> listOfArray, int numberTread) {
        Map<String, Integer> map = new HashMap<>();
        Lock lock = new ReentrantLock();
        Runnable calc = () -> {

            for (int[] arr : listOfArray) {
                lock.lock();
                map.put(Arrays.toString(arr), Arrays.stream(arr).sum());
                lock.unlock();
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(numberTread);
        for (int i = 1; i <= numberTread; i++) {
            executor.execute(calc);
        }
        executor.shutdown();
        return map;
    }
}

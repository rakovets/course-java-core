package com.rakovets.course.java.core.practice.concurrency.common;

import com.rakovets.course.java.core.practice.concurrency.common.parallel_calculator.ParallelCalculator;

import java.util.*;

public class ParallelCalculatorDemo {
    public static void main(String[] args) {
        List<int[]> data = new ArrayList<>();

        for (int x = 0; x < 10; x++) {
            data.add(new Random().ints(new Random().nextInt(1000000), 1, 301).toArray());
        }
        ParallelCalculator.calculateInThreads(data, 1);
        ParallelCalculator.calculateInThreads(data, 2);
        ParallelCalculator.calculateInThreads(data, 5);
        ParallelCalculator.calculateInThreads(data, 10);
    }
}

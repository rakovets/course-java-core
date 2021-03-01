package com.rakovets.course.java.core.practice.concurrency.common;

import com.rakovets.course.java.core.practice.concurrency.common.parallelCalculator.ParallelCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelCalculatorDemo {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        for (int x = 0; x < 10; x++) {
            list.add(new Random().ints(new Random().nextInt(1000000), 1, 301).toArray());
        }
        ParallelCalculator.calculateWithThreads(list, 1);
        ParallelCalculator.calculateWithThreads(list, 2);
        ParallelCalculator.calculateWithThreads(list, 5);
        ParallelCalculator.calculateWithThreads(list, 10);
    }
}

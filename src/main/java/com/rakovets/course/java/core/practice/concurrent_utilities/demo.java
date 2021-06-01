package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) throws InterruptedException {
        List<Integer[]> list = new ArrayList<>();
        list.add(new Integer[]{5, 10, 15, 25});
        list.add(new Integer[]{5, 15, 15, 25});
        list.add(new Integer[]{5, 2, 15, 25});
        list.add(new Integer[]{5, 134, 1231, 25});
        ParallelCalculator.calculateWithThreads(list, 1);
        Thread.sleep(1000);
        ParallelCalculator.calculateWithThreads(list, 2);
        Thread.sleep(1000);
        ParallelCalculator.calculateWithThreads(list, 5);
        Thread.sleep(1000);
        ParallelCalculator.calculateWithThreads(list, 10);
    }
}

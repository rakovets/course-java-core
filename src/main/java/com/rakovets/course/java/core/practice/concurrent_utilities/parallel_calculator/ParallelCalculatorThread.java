package com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class ParallelCalculatorThread implements Runnable{
    CopyOnWriteArrayList<Integer[]> list;
    ConcurrentHashMap<Integer[], Integer> arraysSums;
    public ParallelCalculatorThread(CopyOnWriteArrayList<Integer[]> list, ConcurrentHashMap<Integer[], Integer> arraysSums ) {
        this.list = list;
        this.arraysSums = arraysSums;
    }

    @Override
    public void run() {
        if (list.size() > 0) {
            Integer[] currentArray = list.remove(0);
        int sum = 0;
        for (int i = 0; i < currentArray.length; i++) {
            sum += currentArray[i];
        }
        arraysSums.put(currentArray, sum);
        }
    }
}

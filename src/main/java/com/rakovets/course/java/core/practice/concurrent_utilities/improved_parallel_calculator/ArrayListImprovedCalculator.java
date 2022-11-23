package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.*;
import java.util.concurrent.Phaser;
import java.util.concurrent.Semaphore;

public class ArrayListImprovedCalculator {
    private Phaser phaser;
    public ArrayListImprovedCalculator(Phaser phaser) {
        this.phaser = phaser;
    }
    public Map<int[], Integer> getMapOfIntArrayAndTheirsSum (List<int[]> intArrayList) throws NullPointerException {
        Map<int[], Integer> mapOfIntArrayAndTheirsSum = new LinkedHashMap<>();
        intArrayList.stream()
                .forEach(x -> mapOfIntArrayAndTheirsSum.put(x, Arrays.stream(x).sum()));
        return mapOfIntArrayAndTheirsSum;
    }

    public Map<int[], Integer> getMapOfIntArrayAndTheirsSumMadeByThreads (List<int[]> intArrayList, int numberOfThreads) throws NullPointerException {
        Map<int[], Integer> mapMadeByThreads = new LinkedHashMap<>();
        Semaphore sem = new Semaphore(1, true);
        int start = 0;
        for (int i = 1; i <= numberOfThreads; i++) {
            int end = intArrayList.size() - (intArrayList.size() / numberOfThreads) * (numberOfThreads - i);
            new CalculatorThread("Calculator Thread " + i, sem, mapMadeByThreads, intArrayList, start, end, this.phaser).start();
            start = end;
            try {
                Thread.sleep(0, 10);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        return mapMadeByThreads;
    }
}

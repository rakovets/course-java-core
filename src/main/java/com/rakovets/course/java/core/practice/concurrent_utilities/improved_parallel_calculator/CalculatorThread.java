package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Phaser;
import java.util.concurrent.Semaphore;

public class CalculatorThread extends Thread {
    private String name;
    private Semaphore sem;
    private final Map<int[], Integer> mapMadeByThreads;
    private final List<int[]> intArrayList;
    private int start;
    private int end;
    private Phaser phaser;

    public CalculatorThread(String name, Semaphore sem, Map<int[], Integer> mapMadeByThreads, List<int[]> intArrayList, int start, int end, Phaser phaser) {
        this.name = name;
        this.sem = sem;
        this.mapMadeByThreads = mapMadeByThreads;
        this.intArrayList = intArrayList;
        this.start = start;
        this.end = end;
        this.phaser = phaser;
        phaser.register();
    }

    @Override
    public void run() {
        try {
            List<int[]> myPartOfList;
            myPartOfList = intArrayList.subList(start, end);
            sem.acquire();
            myPartOfList.stream()
                    .forEach(x -> {
                        mapMadeByThreads.put(x, Arrays.stream(x).sum());
                    });
            sem.release();
            phaser.arriveAndAwaitAdvance();
            phaser.arriveAndDeregister();
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}

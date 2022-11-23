package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Phaser;
import java.util.concurrent.Semaphore;

public class CalculatorThread extends Thread {
    private final Semaphore sem;
    private final Map<int[], Integer> mapMadeByThreads;
    private final List<int[]> intArrayList;
    private final int start;
    private final int end;
    private final Phaser phaser;

    public CalculatorThread(String name, Semaphore sem, Map<int[], Integer> mapMadeByThreads, List<int[]> intArrayList, int start, int end, Phaser phaser) {
        super(name);
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
            sem.acquire();
            intArrayList.stream()
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

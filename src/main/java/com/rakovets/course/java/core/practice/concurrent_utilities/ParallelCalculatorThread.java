package com.rakovets.course.java.core.practice.concurrent_utilities;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ParallelCalculatorThread implements Runnable {
    CopyOnWriteArrayList<Integer[]> listOfArrays;
    ConcurrentHashMap<Integer[], Long> sumOfArrays;
    public ParallelCalculatorThread(CopyOnWriteArrayList<Integer[]> listOfArrays, ConcurrentHashMap<Integer[], Long> sumOfArrays) {
        this.listOfArrays = listOfArrays;
        this.sumOfArrays = sumOfArrays;
    }

    @Override
    public void run() {
        if (listOfArrays.size() > 0) {
            Integer[] array = listOfArrays.remove(0);
            long sum = 0;
            for (Integer arrayValue : array) {
                sum += arrayValue;
            }
            sumOfArrays.put(array, sum);
        }
    }
}

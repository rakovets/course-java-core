package com.rakovets.course.java.core.practice.concurrency.common.parallel_calculator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SumThread implements Runnable {
    private final List<int[]> arrayList;
    private final Map<int[], Integer> sumMap;

    public SumThread(List<int[]> arrayList, Map<int[], Integer> sumMap) {
        this.arrayList = arrayList;
        this.sumMap = sumMap;
    }

    @Override
    public void run() {
        {
            while (!arrayList.isEmpty()) {
                for (int[] array : arrayList) {
                    int sum = Arrays.stream(array).sum();
                    sumMap.put(array, sum);
                }
                arrayList.remove(0);
            }
        }
    }
}

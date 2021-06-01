package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelCalculator  {
    private static final Map<Integer[], Long> arraysAndSumMap = new HashMap<Integer[], Long>();
    public static CopyOnWriteArrayList<Integer[]> arrayListThreadSafety = new CopyOnWriteArrayList<>();

    public static Map<Integer[], Long> getSumOfArrays(List<Integer[]> arrayList) {
        Map<Integer[], Long> mapSumOfArrays = new HashMap<>();
        long ArraySum = 0;
        for (Integer[] array : arrayList) {
            for (Integer arraysItem : array) {
                ArraySum += arraysItem;
            }
            mapSumOfArrays.put(array, ArraySum);
            ArraySum = 0;
        }
        return arraysAndSumMap;
    }

    public static Map<Integer[], Long> getSumOfArraysThreading(CopyOnWriteArrayList<Integer[]> listOfArrays, int threadsNumbers) {
        ConcurrentHashMap<Integer[], Long> sumOfArrays = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<Integer[]> localListOfArrays= new CopyOnWriteArrayList<>(listOfArrays);
        ExecutorService executorService = Executors.newFixedThreadPool(threadsNumbers);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        while (localListOfArrays.size() > 0) {
            executorService.execute(new ParallelCalculatorThreading(localListOfArrays,sumOfArrays));
        }
        executorService.shutdown();
        System.out.println(timestamp);
        return sumOfArrays;
    }
}

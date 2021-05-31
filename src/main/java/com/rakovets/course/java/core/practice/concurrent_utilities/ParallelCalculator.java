package com.rakovets.course.java.core.practice.concurrent_utilities;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelCalculator {
    private static final Map<Integer[], Long> mapSumOfArrays = new HashMap<Integer[], Long>();
    public static CopyOnWriteArrayList<Integer[]> listOfArrays = new CopyOnWriteArrayList<>();

    public static Map<Integer[], Long> getSumOfArrays(List<Integer[]> arrayList) {
        Map<Integer[], Long> mapSumOfArrays = new HashMap<>();
        long sum = 0;
        for (Integer[] array : arrayList) {
            for (Integer arrayValue : array) {
                sum += arrayValue;
            }
            mapSumOfArrays.put(array, sum);
            sum = 0;
        }
        return mapSumOfArrays;
    }

    public static Map<Integer[], Long> getThreadSumOfArrays(CopyOnWriteArrayList<Integer[]> listOfArrays, int numberOfThreads) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        ConcurrentHashMap<Integer[], Long> sumOfArrays = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<Integer[]> localListOfArrays= new CopyOnWriteArrayList<>(listOfArrays);
        while (localListOfArrays.size() > 0) {
            executorService.execute(new ParallelCalculatorThread(localListOfArrays,sumOfArrays));
        }
        executorService.shutdown();
        System.out.println(timestamp);
        return sumOfArrays;
    }
}

package com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class ParallelCalculator {

    public static Map<Integer[], Integer> oneThreadCalculation(List<Integer[]> listOfArrays) {
        Map<Integer[], Integer> sumOfNumbersInArray = new HashMap<>();
        listOfArrays
                .forEach(e -> {
                    int sumOfNumbers = 0;
                    for (Integer element : e) {
                        sumOfNumbers += element;
                    }
                    sumOfNumbersInArray.put(e,sumOfNumbers);
                });
        return sumOfNumbersInArray;
    }

    public static Map<Integer[], Integer> multiThreadCalculation(CopyOnWriteArrayList<Integer[]> listOfArrays, int numberOfThreads) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        ConcurrentHashMap<Integer[], Integer> arraysSums = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<Integer[]> localListOfArrays= new CopyOnWriteArrayList<>(listOfArrays);
        while (localListOfArrays.size() > 0) {
            executorService.execute(new ParallelCalculatorThread(localListOfArrays,arraysSums));
        }
        executorService.shutdown();
        System.out.println(timestamp);
        return arraysSums;
    }



}

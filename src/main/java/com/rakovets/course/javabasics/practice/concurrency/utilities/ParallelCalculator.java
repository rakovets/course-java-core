package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelCalculator {
    public static void getArrayAndMaxArrayElement(List<Integer[]> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Number of threads is 1: Array " + i + " length = " + list.get(i).length);
            long sum = 0;
            for(int j = 0; j < list.get(i).length; j++) {
                sum += list.get(i)[j];
            }
            System.out.println("Number of threads is 1. The sum of all elements of array " + i + " = " + sum);
        }
    }


    public static List<Integer[]> getListOfArraysWithRandomDigital(int listSize) {
        List<Integer[]> list = new ArrayList<>();
        for (int i = 1; i <= listSize; i++) {
            int arrayLength = (int) (Math.random() * 1_000_000 + 1);
            Integer[] array = new Integer [arrayLength];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 300);
            }
            list.add(array);
        }
        return list;
    }

    public static void getCalculationInSeveralThreads(int numberOfThreads, List<Integer[]> list) {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        long timeStart = System.currentTimeMillis();
        Iterator<Integer[]> iter = list.iterator();
        int i = 0;
        while (iter.hasNext()) {
            Integer[] array = iter.next();
            Future result = executorService.submit(new ParallelThreads(array));
            i++;
            try {
                Integer sum = (Integer) result.get();
                System.out.println("All elements sum array" + i + " : " + sum);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
        long timeSpent = System.currentTimeMillis() - timeStart;
        System.out.println(numberOfThreads + "threads time: " + timeSpent);
    }


}

package com.rakovets.course.java.core.practice.concurrency;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ParallelCalculatorThreading implements Runnable {

    Map<Integer[], Integer> mapWithSum;
    private static List<Integer[]> listArray = new LinkedList<>();

    public Map<Integer[], Integer> getArraySum(List<Integer[]> list, int countOfThreads) {
        listArray = list;
        for (int i = 0; i < countOfThreads; i++) {
            Thread thread = new Thread();
            thread.start();
        }
        return mapWithSum;
    }

    @Override
    public void run() {
        try {
            while (listArray.size() != 0) {
                Integer[] list = listArray.remove(0);
                int sum = 0;
                for (Integer value : list) {
                    sum += value;
                }
                mapWithSum.put(list, sum);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

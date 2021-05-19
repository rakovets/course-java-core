package com.rakovets.course.java.core.practice.concurrency;

import java.util.*;

public class ParallelCalculatorThreading implements Runnable {
    private static Map<Integer[], Integer> mapWithSum = new HashMap<>();
    private static List<Integer[]> arrayListWithInoutArrays = new ArrayList<>();

    public Map<Integer[], Integer> getArraySum(List<Integer[]> list, int countOfThreads) {
        List<Thread> threads = new LinkedList<>();
        arrayListWithInoutArrays.addAll(list);

        for (int i = 0; i < countOfThreads; i++) {
            Thread thread = new Thread(this);
            threads.add(thread);
            thread.start();
        }
        threads.stream().forEach(x -> {
            try {
                x.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        return mapWithSum;
    }

    @Override
    public void run() {
        try {
            while (arrayListWithInoutArrays.size() != 0) {
                Integer[] list = arrayListWithInoutArrays.remove(0);
                if (!(list.length == 0)) {
                    int sum = 0;
                    for (Integer value : list) {
                        sum += value;
                    }
                    mapWithSum.put(list, sum);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

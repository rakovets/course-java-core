package com.rakovets.course.java.core.practice;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ParallelCalculator implements Runnable {
    private static final Map<Integer[], Integer> mapWithSum = new HashMap<Integer[], Integer>();
    public static CopyOnWriteArrayList<Integer[]> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

    public Map<Integer[], Integer> getArraySum(List<Integer[]> list, int countOfThreads) {
        List<Thread> threads = new LinkedList<>();
        copyOnWriteArrayList.addAll(list);
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
        Integer[] list;
        try {
            while ((list = copyOnWriteArrayList.remove(0)) != null) {
                if (!(list.length == 0)) {
                    int sum = 0;
                    for (int i = 0; i < list.length; i++) {
                        sum += list[i];
                    }
                    mapWithSum.put(list, sum);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Map<Integer[], Integer> getArraySum(List<Integer[]> list) {
        Map<Integer[], Integer> mapWithSum = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            for (Integer value : list.get(i)) {
                sum += value;
            }
            mapWithSum.put(list.get(i), sum);
            sum = 0;
        }
        return mapWithSum;
    }
}

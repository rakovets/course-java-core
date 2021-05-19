package com.rakovets.course.java.core.practice.concurrency;

import java.util.*;

public class ParallelCalculatorThreading implements Runnable {

    private static Map<Integer[], Integer> mapWithSum = new HashMap<>();
    //private static List<Integer[]> listArray = new LinkedList<>();
    private static Queue<Integer[]> queue = new LinkedList<>();

    private static List<Integer[]> listArray2 = new ArrayList<>();


    public Map<Integer[], Integer> getArraySum(List<Integer[]> list, int countOfThreads) throws InterruptedException {
        List<Thread> threads = new LinkedList<>();
        list.addAll(list);
        listArray2.addAll(list);
        list.stream()
                .forEach(x -> queue.add(x));
        //queue.addAll(list);

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
           // while (queue.size() != 0) {
            while (listArray2.size() != 0) {
               // Integer[] list = queue.poll();
                Integer[] list = listArray2.remove(0);
                // Integer[] list = list2.r
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

package com.rakovets.course.java.core.practice.concurrency;

import java.util.*;

public class ParallelCalculatorThreading implements Runnable {

    private static Map<Integer[], Integer> mapWithSum = new HashMap<>();
    private static List<Integer[]> listArray = new LinkedList<>();

    public Map<Integer[], Integer> getArraySum(List<Integer[]> list, int countOfThreads) throws InterruptedException {
        List<Thread> threads = new LinkedList<>();

        listArray.addAll(list);

        for (int i = 0; i < countOfThreads; i++) {
            threads.add(new Thread(this));
        }

        threads.stream()
                .forEach(x -> x.start());

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
        //  System.out.println("P4");

        while (listArray.size() > 0) {
            //    System.out.println("Size in circle is " + listArray.size());
            try {
                Integer[] list = listArray.remove(0);
                //  System.out.println("Взял" + Arrays.toString(list));
                int sum = 0;
                for (Integer value : list) {
                    sum += value;
                }
                mapWithSum.put(list, sum);
                //   System.out.println("Zapisal");
            } catch (NullPointerException | IndexOutOfBoundsException e) {
                e.getMessage();
            }
        }
        System.out.println("i vse " + Thread.currentThread().getName());
    }
}

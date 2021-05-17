package com.rakovets.course.java.core.practice.concurrency;

import java.util.*;

public class ParallelCalculatorThreading implements Runnable {

    private static Map<Integer[], Integer> mapWithSum = new HashMap<>();
    private static List<Integer[]> listArray = new LinkedList<>();

    public Map<Integer[], Integer> getArraySum(List<Integer[]> list, int countOfThreads) throws InterruptedException {
        List<Thread> threads = new LinkedList<>();

        listArray.addAll(list);
    //    System.out.println("P1");
        for (int i = 0; i < countOfThreads; i++) {
            Thread thread = new Thread(this);
            threads.add(thread);
          //  System.out.println("P2");
            thread.start();
         //   System.out.println("P3");
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
      //  System.out.println("P4");
        try {
            while (listArray.size() != 0) {
                Integer[] list = listArray.remove(0);
              //  System.out.println("Взял" + Arrays.toString(list));
                int sum = 0;
                for (Integer value : list) {
                    sum += value;
                }
                mapWithSum.put(list, sum);
             //   System.out.println("Zapisal");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("i vse");
    }
}

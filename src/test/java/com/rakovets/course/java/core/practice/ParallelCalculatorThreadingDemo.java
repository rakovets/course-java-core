package com.rakovets.course.java.core.practice;

import java.util.*;

public class ParallelCalculatorThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Integer[]> inputArray = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            Integer[] array = new Integer[1000000];
            for (int x = 0; x < array.length; x++) {
                array[x] = new Random().nextInt(300);
            }
            inputArray.add(array);
        }

        ParallelCalculator parallelCalculatorThreading = new ParallelCalculator();

        long[][] time = new long[4][3];
        int[] countOfThreads = new int[]{1, 2, 5, 10};

        for (int i = 0; i < countOfThreads.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(inputArray.size());
                Date before = new Date();
                long timeBefore = before.getTime();
                Map<Integer[], Integer> map = parallelCalculatorThreading.getArraySum(inputArray, countOfThreads[i]);
                Date after = new Date();
                time[i][j] = after.getTime() - timeBefore;
                System.out.println(map.size());
            }
        }
        System.out.println(Arrays.deepToString(time));
    }
}

package com.rakovets.course.java.core.practice.concurrency.common;

import java.util.*;

public class ParallelCalculatorDemo {
    public static void main(String[] args) {

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
           int[] array = new int[new Random().nextInt( 1000000)];
                for (int x = 0; x < array.length; x++) {
                   array[x] = new Random().nextInt(300);
                }
                list.add(array);
        }

        ParallelCalculator.fewThreads(list, 1);
        ParallelCalculator.fewThreads(list, 2);
        ParallelCalculator.fewThreads(list, 5);
        ParallelCalculator.fewThreads(list, 10);
    }
}

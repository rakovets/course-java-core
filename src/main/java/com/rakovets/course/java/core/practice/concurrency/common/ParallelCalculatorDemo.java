package com.rakovets.course.java.core.practice.concurrency.common;

import java.util.ArrayList;
import java.util.Random;

import static com.rakovets.course.java.core.practice.concurrency.common.ParallelCalculator.getArraySumByThread;

public class ParallelCalculatorDemo {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        for(int i =0; i<10; i++) {
            Random random = new Random();
            int[] arr = new int[random.nextInt(1_000_000)];
            for (int b = 0; b < arr.length; b++) {
                arr[b] = random.nextInt(301);
            }
            list.add(arr);
        }

        getArraySumByThread(list, 1);
        getArraySumByThread(list, 2);
        getArraySumByThread(list, 5);
        getArraySumByThread(list, 10);

    }
}

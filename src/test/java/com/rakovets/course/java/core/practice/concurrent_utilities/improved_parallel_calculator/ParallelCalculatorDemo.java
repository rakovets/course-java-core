package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelCalculatorDemo {
    public static void main(String[] args) {
        ParallelCalculator parallelCalculator = new ParallelCalculator();
        List<int[]> arrays = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int[] array = new int[new Random().nextInt(5)];
            for (int j = 0; j < array.length; j++) {
                array[j] = new Random().nextInt(300);
            }
            arrays.add(array);
        }

        parallelCalculator.getNumbersAndSum(arrays);

        parallelCalculator.getNumbersAndSumWithSomeThreads(arrays, 1);
        parallelCalculator.getNumbersAndSumWithSomeThreads(arrays, 2);
        parallelCalculator.getNumbersAndSumWithSomeThreads(arrays, 5);
        parallelCalculator.getNumbersAndSumWithSomeThreads(arrays, 10);
    }
}

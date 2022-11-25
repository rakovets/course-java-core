package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DemoParallelCalculatorDemo {
    public static void main(String[] args) {
        int numberOfThreads = 5;
        ImprovedParallelCalculator parallelCalculator = new ImprovedParallelCalculator();

        List<int[]> arrays = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int[] array = new int[new Random().nextInt(2)];
            for (int j = 0; j < array.length; j++) {
                array[j] = new Random().nextInt(1_000);
            }
            arrays.add(array);
        }

        parallelCalculator.printPairs(parallelCalculator.getListOfArray(arrays));
        parallelCalculator.printPairs(parallelCalculator.convertListOfArrayToSumOfElements(arrays, numberOfThreads));
    }
}

package com.rakovets.course.java.core.practice.concurrency.common.ParallelCalculator;

import java.util.List;
import java.util.Map;

public class ParallelCalculatorDemo {
    public static void main(String[] args) {

        ParallelCalculator parallelCalculator = new ParallelCalculator();

        List<Integer[]> listOfArrays = parallelCalculator.listOfArrays(10);

        for (Map.Entry<List<Integer[]>, Integer> entry : parallelCalculator.arraysAndSum(listOfArrays).entrySet()) {
            System.out.println("Sum of elements is " + entry.getValue());
        }

        long startTimeThreads1 = System.nanoTime();
        parallelCalculator.sumInDifferentThreads(1, listOfArrays);
        long executionTimeThreads1 = System.nanoTime() - startTimeThreads1;
        System.out.println("Calculation of sum in 1 thread took " + executionTimeThreads1 + " nanoseconds");

        long startTimeThreads2 = System.nanoTime();
        parallelCalculator.sumInDifferentThreads(2, listOfArrays);
        long executionTimeThreads2 = System.nanoTime() - startTimeThreads2;
        System.out.println("Calculation of sum in 2 threads took " + executionTimeThreads2 + " nanoseconds");

        long startTimeThreads5 = System.nanoTime();
        parallelCalculator.sumInDifferentThreads(5, listOfArrays);
        long executionTimeThreads5 = System.nanoTime() - startTimeThreads5;
        System.out.println("Calculation of sum in 5 threads took " + executionTimeThreads5 + " nanoseconds");

        long startTimeThreads10 = System.nanoTime();
        parallelCalculator.sumInDifferentThreads(10, listOfArrays);
        long executionTimeThreads10 = System.nanoTime() - startTimeThreads10;
        System.out.println("Calculation of sum in 10 threads took " + executionTimeThreads10 + " nanoseconds");

    }
}

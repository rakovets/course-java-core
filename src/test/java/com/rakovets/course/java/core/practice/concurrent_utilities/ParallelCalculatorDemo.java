package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.practice.concurrent_utilities.ImprovedParallelCalculator.ParallelCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelCalculatorDemo {
    public static void main(String[] args) {
        ParallelCalculator parallelCalculator = new ParallelCalculator();
        List<int[]> arraysList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int[] array = new int[new Random().nextInt(5)];
            for(int j = 0; j < array.length; j++) {
                array[j] = new Random().nextInt(999999);
            }
            arraysList.add(array);
        }

        parallelCalculator.getArraysAndSumOfTheirElements(arraysList);

        parallelCalculator.getArraysAndSumUsingThreads(arraysList, 1);
        parallelCalculator.getArraysAndSumUsingThreads(arraysList, 2);
        parallelCalculator.getArraysAndSumUsingThreads(arraysList, 5);
        parallelCalculator.getArraysAndSumUsingThreads(arraysList, 10);
    }
}

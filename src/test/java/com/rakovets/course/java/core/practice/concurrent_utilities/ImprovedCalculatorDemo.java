package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ImprovedCalculatorDemo {

    public static void main(String[] args) {
        ImprovedParallelCalculator calculator = new ImprovedParallelCalculator();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int[] array = new int[new Random().nextInt(1000000)];
            for (int x = 0; x < array.length; x++) {
                array[x] = new Random().nextInt(300);
            }
            list.add(array);
        }
        calculator.getArrayAndSum(list);

        calculator.getArraySumAndAcceptingCountOfThreads(list, 1);
        calculator.getArraySumAndAcceptingCountOfThreads(list, 2);
        calculator.getArraySumAndAcceptingCountOfThreads(list, 5);
        calculator.getArraySumAndAcceptingCountOfThreads(list, 10);
    }
}

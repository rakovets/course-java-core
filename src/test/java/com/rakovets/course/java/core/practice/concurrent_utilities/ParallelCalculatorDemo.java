package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator.Calculator;
import com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator.ParallelCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class ParallelCalculatorDemo {
    public static final Logger logger = Logger.getLogger(ParallelCalculatorDemo.class.getName());

    public static void main(String[] args) throws InterruptedException {
        ParallelCalculator parallelCalculator = new ParallelCalculator();
        Calculator calculator = new Calculator();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int[] array = new int[10000000];
            for (int x = 0; x < array.length; x++) {
                array[x] = new Random().nextInt(300000000);
            }
            list.add(array);
        }

        calculator.getListOfSumsAndArrays(list);

        parallelCalculator.getArraySumAcceptingCountOfThreads(list, 2);
        parallelCalculator.getArraySumAcceptingCountOfThreads(list, 5);
    }
}

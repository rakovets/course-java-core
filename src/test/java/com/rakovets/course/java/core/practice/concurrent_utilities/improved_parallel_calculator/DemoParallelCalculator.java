package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class DemoParallelCalculator {
    private static final Integer ARRAY_LENGTH = 1_000_000;
    private static final Integer CONTAINS_ARRAY_NUMBERS = 1_000_000;

    public static void main(String[] args) {
        ParallelCalculator parallelCalculator = new ParallelCalculator();
        List<int[]> inputArray = new LinkedList<>();
        for (int i = 0; i < new Random().nextInt(5); i++) {
            int[] array = new int[new Random().nextInt(ARRAY_LENGTH)];
            for (int j = 0; j < array.length; j++) {
                array[j] = new Random().nextInt(CONTAINS_ARRAY_NUMBERS);
            }
            inputArray.add(array);
        }
        parallelCalculator.getMap(parallelCalculator.getListArraysAndSumOfArraysDigit(inputArray));

        ParallelCalculatorTread calculatorTread = new ParallelCalculatorTread();
        calculatorTread.getMap1(calculatorTread.getListArraysAndSumOfArraysDigitTread(inputArray, 1));
        calculatorTread.getMap1(calculatorTread.getListArraysAndSumOfArraysDigitTread(inputArray, 3));
        calculatorTread.getMap1(calculatorTread.getListArraysAndSumOfArraysDigitTread(inputArray, 5));
        calculatorTread.getMap1(calculatorTread.getListArraysAndSumOfArraysDigitTread(inputArray, 10));
    }
}

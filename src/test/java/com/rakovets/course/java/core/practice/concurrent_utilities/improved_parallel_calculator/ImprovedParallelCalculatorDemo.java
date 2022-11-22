package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

public class ImprovedParallelCalculatorDemo {
    public static void main(String[] args) {
        ImprovedParallelCalculator calculator = new ImprovedParallelCalculator();
        RandomGenerator randomGenerator = new RandomGenerator();

        System.out.println(calculator.getMapArraysAndSumArrays(
                randomGenerator.getListRandomLengthArraysConsistingOfRandomIntNumbers(
                        5, 1, 10, 3, 15)));

        System.out.println(calculator.getMapArraysAndSumArraysInThreads(
                randomGenerator.getListRandomLengthArraysConsistingOfRandomIntNumbers(
                        10, 1, 3000, 1, 300), 10));
    }
}

package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.List;

public class ImprovedParallelCalculatorDemo {
    public static void main(String[] args) {
        List<Integer[]> list = ParallelCalculator.getListOfArraysWithRandomDigital(10);
        ParallelCalculator.getCalculationInSeveralThreads(1, list);
        ParallelCalculator.getCalculationInSeveralThreads(2, list);
        ParallelCalculator.getCalculationInSeveralThreads(5, list);
        ParallelCalculator.getCalculationInSeveralThreads(10, list);
    }
}

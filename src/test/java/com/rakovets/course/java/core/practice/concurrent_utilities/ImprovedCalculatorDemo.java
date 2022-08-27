package com.rakovets.course.java.core.practice.concurrent_utilities;

public class ImprovedCalculatorDemo {
    private static final ImprovedParallelCalculator calculator = new ImprovedParallelCalculator(10);

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        calculator.calculate(calculator.createListOfArrays
                (10, 1000000, 1, 300));
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}

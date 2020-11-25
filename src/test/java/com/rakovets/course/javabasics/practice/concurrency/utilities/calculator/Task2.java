package com.rakovets.course.javabasics.practice.concurrency.utilities.calculator;


public class Task2 {
    public static void main(String[] args) {
        int maxArrayLength = 15;
        CalculatorManager manager = new CalculatorManager(maxArrayLength);
        int numberOfThreads = 5;
        manager.printList(ParallelCalculator.calcMax(manager.getList(), numberOfThreads));
    }
}


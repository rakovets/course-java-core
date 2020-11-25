package com.rakovets.course.javabasics.practice.concurrency.utilities.calculator;


public class Task1 {
    public static void main(String[] args) {
        int maxArrayLength = 10;
        CalculatorManager manager = new CalculatorManager(maxArrayLength);
        manager.printList(ParallelCalculator.calcMax(manager.getList()));
    }
}

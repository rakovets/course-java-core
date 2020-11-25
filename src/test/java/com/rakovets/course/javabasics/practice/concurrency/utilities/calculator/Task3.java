package com.rakovets.course.javabasics.practice.concurrency.utilities.calculator;


public class Task3 {
    public static void main(String[] args) {
        int maxArrayLength = 1000000;
        CalculatorManager manager = new CalculatorManager(maxArrayLength);
        System.out.println("001 thread: " + manager.getExeTime(1));
        System.out.println("001 thread: " + manager.getExeTime(1));
        System.out.println("001 thread: " + manager.getExeTime(1));
        System.out.println("001 thread: " + manager.getExeTime(1));
        System.out.println("001 thread: " + manager.getExeTime(1));
        System.out.println();
        System.out.println("02 threads: " + manager.getExeTime(2));
        System.out.println("02 threads: " + manager.getExeTime(2));
        System.out.println("02 threads: " + manager.getExeTime(2));
        System.out.println("02 threads: " + manager.getExeTime(2));
        System.out.println("02 threads: " + manager.getExeTime(2));
        System.out.println();
        System.out.println("05 threads: " + manager.getExeTime(5));
        System.out.println("05 threads: " + manager.getExeTime(5));
        System.out.println("05 threads: " + manager.getExeTime(5));
        System.out.println("05 threads: " + manager.getExeTime(5));
        System.out.println("05 threads: " + manager.getExeTime(5));
        System.out.println();
        System.out.println("10 threads: " + manager.getExeTime(10));
        System.out.println("10 threads: " + manager.getExeTime(10));
        System.out.println("10 threads: " + manager.getExeTime(10));
        System.out.println("10 threads: " + manager.getExeTime(10));
        System.out.println("10 threads: " + manager.getExeTime(10));

    }
}

package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelCalculatorRunner {
    private List<Integer[]> list = new ArrayList<>();
    private int maxArrayLength;
    private int maxNumber = 5;
    private int listSize = 10;

    public static void main(String[] args) {
        ParallelCalculatorRunner parallelCalculatorRunner = new ParallelCalculatorRunner();
        System.out.println("1 Thread: " + parallelCalculatorRunner.getExeTime(1));
        System.out.println("2 Thread: " + parallelCalculatorRunner.getExeTime(2));
        System.out.println("5 Thread: " + parallelCalculatorRunner.getExeTime(5));
        System.out.println("10 Thread: " + parallelCalculatorRunner.getExeTime(10));
    }

    public ParallelCalculatorRunner() {
        this.maxArrayLength = (int) (Math.random()*1_000_001);
        for(int i = 0; i < listSize; i++) {
            int arrayLength = new Random().nextInt(maxArrayLength) + 1;
            Integer[] array = new Integer[arrayLength];
            for(int j = 0; j < arrayLength; j++) {
                array[j] = new Random().nextInt(maxNumber);
            }
            list.add(array);
        }
    }

    public long getExeTime(int numberOfThreads) {
        long startTime = System.nanoTime();
        ParallelCalculator.calcMax(list, numberOfThreads);
        long stopTime = System.nanoTime();
        return stopTime - startTime;
    }

    public void printList(List<ArrayMax> list) {
        for(ArrayMax arrayMax : list) {
            System.out.print("array: ");
            for(int number : arrayMax.getArray()) {
                System.out.print(number + " ");
            }
            System.out.println("  max: " + arrayMax.getMax());
        }
    }

    public List<Integer[]> getList() {
        return list;
    }
}

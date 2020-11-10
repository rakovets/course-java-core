package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelCalculatorTest {
    private List<int[]> list = new ArrayList<>();
    private int maxArrayLength;
    private int maxNumber = 300;
    private int listSize = 10;

    public ParallelCalculatorTest(int maxArrayLength) {
        this.maxArrayLength = maxArrayLength;
        for(int i = 0; i < listSize; i++) {
            int arrayLength = new Random().nextInt(maxArrayLength) + 1;
            int[] array = new int[arrayLength];
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

    public List<int[]> getList() {
        return list;
    }
}

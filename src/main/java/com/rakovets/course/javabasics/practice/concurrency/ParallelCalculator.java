package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParallelCalculator extends Thread {
    private int[] array;
    private int max;
    private static List<ArrayMax> result = Collections.synchronizedList(new ArrayList<>());

    public ParallelCalculator(int[] array) {
        this.array = array;
    }

    public static List<ArrayMax> calcMax(List<int[]> list, int defaultNumberOfThreads){
        int defaultNumberOfThreads = 2;
        return calcMax(list, defaultNumberOfThreads);
    }

    public static List<ArrayMax> calcMax(List<int[]> list, int numberOfThreads){
        ParallelCalculator[] calculators = new ParallelCalculator[numberOfThreads];
        int threads = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i >= numberOfThreads) {
                try {
                    calculators[threads].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            calculators[threads] = new ParallelCalculator(list.get(i));
            calculators[threads].start();
            threads++;
            if (threads == numberOfThreads) {
                threads = 0;
            }
        }
        for (ParallelCalculator calculator : calculators) {
            try {
                calculator.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ArrayList<ArrayMax> res = new ArrayList<>();
        res.addAll(result);
        return res;
    }

    public void run() {
        int[] newArray = array.clone();
        Arrays.sort(newArray);
        max = newArray[newArray.length - 1];
        result.add(new ArrayMax(array, max));
    }

}

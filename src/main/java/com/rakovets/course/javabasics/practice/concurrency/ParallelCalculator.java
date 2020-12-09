package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParallelCalculator extends Thread {
    private Integer[] array;
    private int max;
    private static List<ArrayMax> result = new ArrayList<>();

    public ParallelCalculator(Integer[] array) {
        this.array = array;
    }

    public static List<ArrayMax> calcMax(List<Integer[]> list, int numberOfThreads){
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
        Integer[] newArray = array.clone();
        Arrays.sort(newArray);
        max = newArray[newArray.length - 1];
        result.add(new ArrayMax(array, max));
    }

}

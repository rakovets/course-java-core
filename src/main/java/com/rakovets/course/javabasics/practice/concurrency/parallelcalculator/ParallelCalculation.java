package com.rakovets.course.javabasics.practice.concurrency.parallelcalculator;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.HashMap;
import java.util.LinkedList;

public class ParallelCalculation implements Runnable {
    public LinkedList<int[]> list;
    private final int iterator;
    private final int numberOfThreads;

    public ParallelCalculation(LinkedList<int[]> list, int iterator, int numberOfThreads) {
        this.list = list;
        this.iterator = iterator;
        this.numberOfThreads = numberOfThreads;
    }

    @Override
    public void run() {
        int arraysInOneThread;
        if (list.size() % numberOfThreads == 0) {
            arraysInOneThread = list.size() / numberOfThreads;
        } else {
            arraysInOneThread = list.size() / numberOfThreads + 1;
        }
        int iter = iterator * arraysInOneThread;
        HashMap<String, Integer> resultList = new HashMap<>();
        int max = list.get(0)[0];
        for (int n = iter; (n < (iterator * arraysInOneThread + arraysInOneThread)) && (n < list.size()); n++) {
            for (int i = 0; i < list.get(n).length; i++) {
                if (max < list.get(n)[i]) {
                    max = list.get(n)[i];
                }
            }
            resultList.put("Array " + list.indexOf(list.get(n)), max);
        }
        StandardOutputUtil.printlnWithTime("Calculation: started for thread = " + iterator + " max Element= " + resultList, AnsiColorCode.FG_YELLOW_BOLD);
        StandardOutputUtil.printlnWithTime("Print Runnable: finished for thread= " + iterator, AnsiColorCode.FG_RED_BOLD);
    }
}


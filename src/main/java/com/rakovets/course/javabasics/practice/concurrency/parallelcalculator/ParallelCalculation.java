package com.rakovets.course.javabasics.practice.concurrency.parallelcalculator;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ParallelCalculation implements Runnable {
    public LinkedList<int[]> list;

    public ParallelCalculation(LinkedList<int[]> list) {
        this.list = list;
    }

    @Override
    public void run() {
        StandardOutputUtil.printlnWithTime("ParallelCalculation: started", AnsiColorCode.FG_YELLOW_BOLD);
        HashMap<String, Integer> resultList = new HashMap<>();
        for (int[] array : list) {
            int max = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            resultList.put("Array_" + list.indexOf(array), max);
        }
        System.out.println(resultList);
        StandardOutputUtil.printlnWithTime("PrintRunnable: finished", AnsiColorCode.FG_YELLOW_BOLD);

    }
}

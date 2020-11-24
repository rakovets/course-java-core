package com.rakovets.course.javabasics.practice.concurrency.parallelcalculator;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.*;

public class Concurrency {

    public static HashMap<String, Integer> getMaxElementFromArray(List<int[]> arraysCollection) {

        HashMap<String, Integer> resultList = new HashMap<>();
        for (int[] array : arraysCollection) {
            int max = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            resultList.put("Array_" + arraysCollection.indexOf(array), max);
        }
        return resultList;
    }

    public static void getMaxElementFromArrayWithThreads(int numbersThreads, LinkedList<int[]> listArrays) {

      //  LinkedList<int[]> listArrays = Concurrency.getArraysList();
      //  HashMap<String, Integer> resultList = new HashMap<>();
        ParallelCalculation threadsRunnable = new ParallelCalculation(listArrays);
        for (int t = 0; t < numbersThreads; t++) {
            Thread thread = new Thread(threadsRunnable);
            System.out.println("Thread " + thread.getName());
            thread.start();
        }

    }


    public static int getLengthForArray(int i) {

        int lenght;
        lenght = ((int) (Math.random() * 363878) / (i + 1));
        if (lenght > 1000000) {
            lenght = 999999 - 84573 / (i + 1);
        }
        return lenght;
    }

    public static int getElementForArray(int i) {

        int element;
        element = ((int) (Math.random() * (141 + 1)) - 17) / (i + 1);
        if (element > 300) {
            element = 300 / 2 + 16 / i;
        }
        return element;
    }

    public static LinkedList<int[]> getArraysList() {

        LinkedList<int[]> arrayList = new LinkedList<int[]>();
        for (int i = 0; i < 10; i++) {
            int lenght = Concurrency.getLengthForArray(i);
            int[] tempArray = new int[lenght];
            for (int j = 0; j < lenght; j++) {
                int element = Concurrency.getElementForArray(i);
                tempArray[j] = element;
            }
            arrayList.add(tempArray);
            tempArray = null;
        }
        return arrayList;
    }
}

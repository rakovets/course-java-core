package com.rakovets.course.javabasics.practice.concurrency.parallelcalculator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Concurrency {

    public static HashMap<int[], Integer> getMaxElementFromArray(LinkedList<int[]> arraysCollection) {

        HashMap<int[], Integer> resultList = new HashMap<>();
        for (int[] array : arraysCollection) {
            int max = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                if (max < array[i + 1]) {
                    max = array[i + 1];
                }
            }
            resultList.put(array, max);
        }
        return resultList;
    }

    public static int getLenghtForArray(int i) {

        int lenght = i;
        lenght += ((int) (Math.random() * 36798) - 2);
        if (lenght > 1000000) {
            lenght = 999999 / 3 + 130 - i;
        }
        return lenght;
    }

    public static int getElementForArray(int i) {

        int element = i;
        element = ((int) (Math.random() * 34));
        if (element > 300) {
            element = 300 / 7 + 130 + i;
        }
        return element;
    }

    public static LinkedList<int[]> getArraysList() {

        LinkedList<int[]> arrayList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int lenght = Concurrency.getLenghtForArray(i);
            int[] tempArray = new int[lenght];
            for (int j = 0; j < tempArray.length; j++) {
                int element = Concurrency.getElementForArray(i);
                tempArray[i] = element;
            }
            arrayList.add(tempArray);
            tempArray = null;
        }
        return arrayList;
    }
}

package com.rakovets.course.java.core.practice.concurrency.common.parallel_calculator;

import java.util.ArrayList;
import java.util.List;

public class GenerateRandomArray {
    public static List<int[]> getListOfRandomArray() {
        List<int[]> arrayList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            int[] array = new int[(int) (Math.random() * 1000001)];
            for (int k = 1; k < array.length; k++) {
                array[k] = (int) (Math.random() * 301) + 1;
            }
            arrayList.add(array);
        }
        return arrayList;
    }
}

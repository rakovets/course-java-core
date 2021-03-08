package com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListOfArrays {
    public static List<int[]> listOfArrays;
    public static int valueOfElements;
    public static int numberOfArrays;

    static {

        listOfArrays = new ArrayList<>();
        valueOfElements = 300;
        numberOfArrays = 100;

    }

    public ListOfArrays() {
        for(int i = 1; i < numberOfArrays; i++) {
            int arrayLength = new Random().nextInt(numberOfArrays) + 1;
            int[] array = new int[arrayLength];
            for(int j = 0; j < arrayLength; j++) {
                array[j] = new Random().nextInt(valueOfElements);
            }
            listOfArrays.add(array);
        }
    }

    public List<int[]> getList() {
        return listOfArrays;
    }
}

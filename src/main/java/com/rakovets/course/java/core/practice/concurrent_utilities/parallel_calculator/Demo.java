package com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer[]> listOfArrays = new LinkedList<>();
        int listSize = random.nextInt(1000000) + 1;
        for (int i = 1; i < listSize; i++){
            int arraySize = random.nextInt(1000000) + 1;
            Integer[] array = new Integer[arraySize];
            for (int j = 0; j < array.length; j++){
                array[j] = random.nextInt(300) + 1;
            }
        }
        System.out.println(ArrayCalculator.oneThreadCalculation(listOfArrays));
    }
}

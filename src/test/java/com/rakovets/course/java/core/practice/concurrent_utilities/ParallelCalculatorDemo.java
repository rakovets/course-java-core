package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator.ParallelCalculator;

import java.sql.Timestamp;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class ParallelCalculatorDemo {
    public static void main(String[] args) {
      Timestamp timestamp = new Timestamp(System.currentTimeMillis());
       Random random = new Random();
        CopyOnWriteArrayList<Integer[]> listOfArrays = new CopyOnWriteArrayList<>();
        int listSize = 10;
        for (int i = 0; i < listSize; i++){
            int arraySize = random.nextInt(300) + 1;
            Integer[] array = new Integer[arraySize];
            for (int j = 0; j < array.length; j++){
                array[j] = random.nextInt(300) + 1;
            }
            listOfArrays.add(array);
        }
        System.out.println(timestamp);
        System.out.println(ParallelCalculator.multiThreadCalculation(listOfArrays,1));
        System.out.println(ParallelCalculator.multiThreadCalculation(listOfArrays,2));
        System.out.println(ParallelCalculator.multiThreadCalculation(listOfArrays,5));
        System.out.println(ParallelCalculator.multiThreadCalculation(listOfArrays,10));
    }
}

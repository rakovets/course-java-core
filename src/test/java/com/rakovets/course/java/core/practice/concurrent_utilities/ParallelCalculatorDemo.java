package com.rakovets.course.java.core.practice.concurrent_utilities;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
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
        System.out.println(ParallelCalculator.getThreadSumOfArrays(listOfArrays,1));
        System.out.println(ParallelCalculator.getThreadSumOfArrays(listOfArrays,2));
        System.out.println(ParallelCalculator.getThreadSumOfArrays(listOfArrays,5));
        System.out.println(ParallelCalculator.getThreadSumOfArrays(listOfArrays,10));

        List<Integer[]> arrayList = new ArrayList<>();
        int listSize1 = 10;
        for (int i = 0; i < listSize1; i++) {
            int arraySize1 = random.nextInt(300) + 1;
            Integer[] array1 = new Integer[arraySize1];
            for (int j = 0; j < array1.length; j++) {
                array1[j] = random.nextInt(300) + 1;
            }
            arrayList.add(array1);
        }
        System.out.println(ParallelCalculator.getSumOfArrays(arrayList));
    }
}

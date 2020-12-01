package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numberOfElements1 = (int) ( 1 + Math.random() * 1000 );
        int numberOfElements2 = (int) ( 1 + Math.random() * 1000 );
        int numberOfElements3 = (int) ( 1 + Math.random() * 1000 );
        int numberOfElements4 = (int) ( 1 + Math.random() * 1000 );
        int numberOfElements5 = (int) ( 1 + Math.random() * 1000 );
        int numberOfElements6 = (int) ( 1 + Math.random() * 1000 );
        int numberOfElements7 = (int) ( 1 + Math.random() * 1000 );
        int numberOfElements8 = (int) ( 1 + Math.random() * 1000 );

        int[] arr1 = new int[numberOfElements1];
        int[] arr2 = new int[numberOfElements2];
        int[] arr3 = new int[numberOfElements3];
        int[] arr4 = new int[numberOfElements4];
        int[] arr5 = new int[numberOfElements5];
        int[] arr6 = new int[numberOfElements6];
        int[] arr7 = new int[numberOfElements7];
        int[] arr8 = new int[numberOfElements8];

        List<int[]> list = Arrays.asList(arr1, arr2, arr3, arr4, arr5, arr6, arr7, arr8);

        for (int[] arr : list) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) ( 1 + Math.random() * 1000 );
            }
        }

        ParallelCalculator obj = new ParallelCalculator();
        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(obj.getMaxValuesFromArrayThread(list, 8)));
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");





    }

}

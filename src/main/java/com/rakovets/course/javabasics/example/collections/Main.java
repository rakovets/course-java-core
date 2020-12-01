package com.rakovets.course.javabasics.example.collections;

public class Main {
    public static void main(int[] args) {
        /*ParallelCalculator parallelCalculator = new ParallelCalculator();
        System.out.println();*/

        int numberOfElements = (int) ( Math.random() * 1000000 );
        int[] arr = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            arr[i] = (int) ( Math.random() * 300 );
        }

        System.out.println(arr);


    }

}

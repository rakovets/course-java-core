package com.rakovets.course.challenge.generics;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        fillArrayy();
        fillingAnArrayWithRandomNumbers();
        arrayDisplay();
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        findMin(numbers);
        Integer[] numbers1 = {82, 11, 74, 12, 56, 7, 1,};
        findAverage(numbers1);
        Integer[] numbers2 = {9, 231, 4145, 531, 441, 1};
        findMax(numbers2);
    }

    public static void fillArrayy() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }


    public static <T extends Number> void
    fillingAnArrayWithRandomNumbers() {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 12) - 15);
            System.out.println(array[i]);
        }
    }

    public static <T extends Number> void arrayDisplay() {
        int[] a = {1, 3, -7, 2, 8, 23, 21, 54, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static <T extends Number> void findMin(T[] array) {
        T min = array[0];
        Number n1 = null;
        Number n2 = null;
        boolean b = n1.intValue() < n2.intValue();
        for (int i = 0; i < array.length; i++) {
            if (array[i].intValue() < array[0].intValue()) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static <T extends Number> void findAverage(T[] items) {
        int average = 0;
        for (T item : items) {
            average += (int) item;
        }
        average /= items.length;
        System.out.println("The avarage num is : " + average);
    }

    public static <T extends Number> void findMax(T[] array) {
        T max = array[0];
        Number n1 = null;
        Number n2 = null;
        boolean b = n1.intValue() > n2.intValue();
        for (int i = 0; i > array.length; i++) {
            if (array[i].intValue() < array[0].intValue()) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}




package com.rakovets.course.challenge.generics.array;


import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Array<T> {
    public static Integer[] arrayEnteredFromTheKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array.");
        int length = scanner.nextInt();
        Integer[] array = new Integer[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter value[%d]: \n", i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Array was created: " + printArray(array));
        return array;
    }

    public static  Integer[] creatingRandomArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array.");
        int length = scanner.nextInt();
        Random random = new Random();
        Integer[] array = new Integer[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array was created: " + printArray(array));
        return array;
    }

    public static <T> String printArray(T[] array) {
        return Arrays.toString(array);
    }

    public static <T extends Comparable<T>> void searchMaxValue(T[] array) {
        T max = array[0];
        for (T value : array) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        System.out.println("Max value is:" + max);
    }

    public static <T extends Comparable<T>> void searchMinValue(T[] array) {
        T min = array[0];
        for (T value : array) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        System.out.println("Min value is:" + min);
    }

    public static <T> void searchMiddleValue(T[] array) {
        int sum = 0;
        for (T value : array) {
            sum +=(int) value;
        }
        System.out.println("Middle value = " + sum / array.length);
    }

    public static <T> void sortArrayInAscendingOrder(T[] array) {
        Arrays.sort(array);
        System.out.println("Sorting array to max: " + printArray(array));
    }

    public static <T> void sortArrayInDescendingOrder(T[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sorting array to min: " + printArray(array));
    }

    public static <T> void binarySearchInArray(T[] array) {
        int value = Arrays.binarySearch(array, 20);
        if (value < 0) {
            System.out.println("Value not found.");
        } else{
            System.out.println("Value is found");
        }
    }

    public static <T> void changingValueInArray(T[] array, int index, T newValue) {
        if (index > array.length || index < 0) {
            System.out.println("Not correct index!");
        } else {
           array[index] = newValue;
        }
        System.out.printf("Changed array[%d] on %d\n", index, newValue);
        System.out.printf("New array: %s\n", printArray(array));
    }
}

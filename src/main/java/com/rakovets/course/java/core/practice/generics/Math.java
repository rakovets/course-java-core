package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math<T extends Number> {
    public static <T extends Number> T getMaxValueOfThree(T a, T b, T c) {
        T[] numbers = (T[]) new Object[]{a, b, c};
        return getMaxNumberInArray(numbers);
    }

    public static <T extends Number> T getMinValueOfFive(T a, T b, T c, T d, T e) {
        T[] numbers = (T[]) new Object[]{a, b, c, c, e};
        return getMinNumberInArray(numbers);
    }

    public static <T extends Number> double getAverageNumberInArray(T[] numbers) {
        double sum = 0;
        for (T value : numbers) {
            sum += value.doubleValue();
        }
        return sum / numbers.length;
    }

    public static <T extends Number> T getMaxNumberInArray(T[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static <T extends Number> T getMinNumberInArray(T[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    private static <T> void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static <T extends Number> T[] bubbleSort(T[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i].doubleValue() < array[i - 1].doubleValue()) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        return array;
    }

    public static <T extends Number> int iterativeSearch(T[] arrayToSearch, T element) {
        int lowIndex = 0;
        int highIndex = arrayToSearch.length - 1;
        int elementPos = -1;

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (element.doubleValue() == arrayToSearch[midIndex].doubleValue()) {
                elementPos = midIndex;
                break;
            } else if (element.doubleValue() < arrayToSearch[midIndex].doubleValue()) {
                highIndex = midIndex - 1;
            } else if (element.doubleValue() > arrayToSearch[midIndex].doubleValue()) {
                lowIndex = midIndex + 1;
            }
        }
        return elementPos;
    }
}

package com.rakovets.course.java.core.practice.generic_types.project_math;

import java.util.Arrays;

public abstract class Math <T> {
    @SafeVarargs
    public static <T> T getMaxNumber(T... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }

    @SafeVarargs
    public static <T> T getMinNumber(T... values) {
        Arrays.sort(values);
        return values[0];
    }

    public static <T extends Number> double getAverageArray(T[] array) {
        double sum = 0.0;
        for (T value : array) {
            sum += value.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Number> T getMaxInArray(T[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static <T extends Number> T getMinInArray(T[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static <T extends Number> T[] sortArray(T[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].doubleValue() > array[j + 1].doubleValue()) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static <T extends Number> int findElementInArrayBinary(T[] array, T elementToSearch) {
        Arrays.sort(array);
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex].doubleValue() < elementToSearch.doubleValue()) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex].doubleValue() > elementToSearch.doubleValue()) {
                lastIndex = middleIndex - 1;
            } else if (array[middleIndex].doubleValue() == elementToSearch.doubleValue()) {
                return middleIndex;
            }
        }
        return -1;
    }
}

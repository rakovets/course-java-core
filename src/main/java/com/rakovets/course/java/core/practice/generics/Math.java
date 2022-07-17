package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math<T extends Number> {
    public static <T> T getMaxValueOfThree(T a, T b, T c) {
        T[] arr = (T[]) new Object[]{a, b, c};
        return getMaxValueInArray(arr);
    }

    public static <T> T getMinValueOfFive(T a, T b, T c, T d, T e) {
        T[] arr = (T[]) new Object[]{a, b, c, d, e};
        return getMinValueInArray(arr);
    }

    public static <T extends Number> double getAverageValueInArray(T[] arr) {
        double sum = 0.0;
        for (T value : arr) {
            sum += value.doubleValue();
        }
        return sum / arr.length;
    }

    public static <T> T getMaxValueInArray(T[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static <T> T getMinValueInArray(T[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}

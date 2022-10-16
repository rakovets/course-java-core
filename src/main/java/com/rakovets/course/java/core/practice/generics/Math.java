package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math<Arr extends Number> {
    public static <Arr extends Number> Arr getMaxOfParameters(Arr arr1, Arr arr2, Arr arr3) {
        Arr[] array = (Arr[]) new Object[]{arr1, arr2, arr3};
        return getMaxArrayValue(array);
    }

    public static <Arr extends Number> Arr getMinOfParameters(Arr arr1, Arr arr2, Arr arr3, Arr arr4, Arr arr5) {
        Arr[] array = (Arr[]) new Object[]{arr1, arr2, arr3, arr4, arr5};
        return getMinArrayValue(array);
    }

    public static <Arr extends Number> double getMiddleArithmeticValueOfArray(Arr[] array) {
        double sum = 0.0;
        for (Arr number : array) {
            sum += number.doubleValue();
        }
        return sum / array.length;
    }

    public static <Arr extends Number> Arr getMinArrayValue(Object[] array) {
        Arrays.sort(array);
        return (Arr) array[0];
    }

    public static <Arr extends Number> Arr getMaxArrayValue(Object[] array) {
        Arrays.sort(array);
        return (Arr) array[array.length - 1];
    }
}

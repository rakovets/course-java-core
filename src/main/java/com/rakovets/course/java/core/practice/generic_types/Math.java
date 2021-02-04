package com.rakovets.course.java.core.practice.generic_types;

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class Math {

    public static <T extends Number> double getMaxOfThree(T x, T y, T z) {
        return java.lang.Math.max(x.doubleValue(), (java.lang.Math.max(y.doubleValue(), z.doubleValue())));
    }

    public static <T extends Number> T getMinOfFive(T x, T y, T z, T c, T n) {
        Double[] arrayOfNumbers = new Double[5];

        arrayOfNumbers[0] = x.doubleValue();
        arrayOfNumbers[1] = y.doubleValue();
        arrayOfNumbers[2] = z.doubleValue();
        arrayOfNumbers[3] = c.doubleValue();
        arrayOfNumbers[4] = n.doubleValue();

        Arrays.sort(arrayOfNumbers);

        if (arrayOfNumbers[0] == x.doubleValue()) {
            return x;
        } else if (arrayOfNumbers[0] == y.doubleValue()) {
            return  y;
        } else if (arrayOfNumbers[0] == z.doubleValue()) {
            return z;
        } else if (arrayOfNumbers[0] == c.doubleValue()) {
            return c;
        } else {
            return n;
        }
    }

    public static <T extends Number> double getAverageSumOfArray(T[] items) {
        double sum = 0;

        for (T item : items) {
            sum += item.doubleValue();
        }
        return sum / items.length;
    }

    public static <T extends Number> T getMaxOfArray(T[] array) {
        Arrays.sort(array);

        return array[array.length - 1];
    }

    public static <T extends Number> T getMinOfArray(T[] array) {
        Arrays.sort(array);

        return (array[0]);
    }

    public static <T extends Number> T[] getSortOfArray(T[] array) {
        for (int i = array.length - 1; i < 0; i--) {
            for (int n = 0; n < i; n++) {
                if (array[n].doubleValue() > array[n + 1].doubleValue()) {
                    T additionalVar = array[n];
                    array[n] = array[n + 1];
                    array[n + 1] = additionalVar;
                }
            }
        }
        return array;
    }

    public static <T extends Number> int getBinarySearch(T point, T[] arrayForBin) {
        if (point == null || arrayForBin ==null) {
            return -1;
        }
        int index = -1;
        int start = 0;
        int end = arrayForBin.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arrayForBin[mid].doubleValue() < point.doubleValue()) {
                start = mid + 1;
            } else if (arrayForBin[mid].doubleValue() > point.doubleValue()) {
                end = mid - 1;
            } else if (arrayForBin[mid].doubleValue() == point.doubleValue()) {
                index = mid;
                break;
            }
        }
        return index;
    }
}

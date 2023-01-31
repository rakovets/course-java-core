package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math {
    private static Number[] array;

    public Math(Number[] array) {
        Math.array = array;
    }

    public static <T extends Number> Number getMaxOfThreeNumbers(T n1, T n2, T n3) {
        array = new Number[]{n1, n2, n3};
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static <T extends Number> Number getMinOfFiveNumbers(T n1, T n2, T n3, T n4, T n5) {
        array = new Number[]{n1, n2, n3, n4, n5};
        Arrays.sort(array);
        return array[0];
    }

    public static <T extends Number> Double getArithmeticMean(T[] array) {
        double sum = 0.0;
        for (T i : array) {
            sum += i.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Number> T getMaxFromArray(T[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static <T extends Number> T getMinFromArray(T[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static <T extends Number> void getBubbleSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1].doubleValue() > array[j].doubleValue()) {
                    T tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static <T extends Number> int findIndexFoNumber(T[] array, T desiredNumber) {
        getBubbleSort(array);
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int result = -1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (desiredNumber.doubleValue() == array[middleIndex].doubleValue()) {
                result = middleIndex;
                break;
            } else if (desiredNumber.doubleValue() > array[middleIndex].doubleValue()) {
                firstIndex = middleIndex + 1;
            } else if (desiredNumber.doubleValue() < array[middleIndex].doubleValue()) {
                lastIndex = middleIndex - 1;
            }
        }
        return result;
    }
}

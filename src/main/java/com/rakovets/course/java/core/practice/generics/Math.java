package com.rakovets.course.java.core.practice.generics;

public abstract class Math<T extends Number> {
    public static <T> T findMaxElement(T elementOne, T elementTwo, T elementThree) {
        T[] array = (T[]) new Object[]{elementOne, elementTwo, elementThree};
        return findArrayMaxElement(array);
    }

    public static <T> T findMinElement(T elementOne, T elementTwo, T elementThree) {
        T[] array = (T[]) new Object[]{elementOne, elementTwo, elementThree};
        return findArrayMinElement(array);
    }

    public static <T> double findArrayAverage(T[] array) {
        double result = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            } else {
                result += castToDouble(array[i]);
            }
        }
        return result / array.length;
    }

    public static <T> T findArrayMaxElement(T[] array) {
        int maxElementIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            } else if (castToDouble(array[i]) > castToDouble(array[maxElementIndex])) {
                maxElementIndex = i;
            }
        }
        return array[maxElementIndex];
    }

    public static <T> T findArrayMinElement(T[] array) {
        int minElementIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            } else if (castToDouble(array[i]) < castToDouble(array[minElementIndex])) {
                minElementIndex = i;
            }
        }
        return array[minElementIndex];
    }

    public static <T> double castToDouble(T object) {
        return ((Number) object).doubleValue();
    }
}

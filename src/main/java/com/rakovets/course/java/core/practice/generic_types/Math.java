package com.rakovets.course.java.core.practice.generic_types;


public abstract class Math<T> {

    public static <T extends Comparable<T>> T findMaximum(T ... value) {
        T max = value[0];
        for (T i : value) {
            if (max.compareTo(i) < 0) {
                max = i;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T findMinimum(T ... value) {
        T min = value[0];
        for (T i : value) {
            if (min.compareTo(i) > 0) {
                min = i;
            }
        }
        return min;
    }

    public static <T extends Number> Number findArrayArithmetical(T[] array) {
        double sum = 0;
        for (T i : array) {
            sum += i.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Number> Number findArrayMaximum(T[] array) {
        double max = array[0].doubleValue();
        for (T i : array) {
            if (max < i.doubleValue()) {
                max = i.doubleValue();
            }
        }
        return max;
    }

    public static <T extends Number> Number findArrayMinimum(T[] array) {
        double max = array[0].doubleValue();
        for (T i : array) {
            if (max > i.doubleValue()) {
                max = i.doubleValue();
            }
        }
        return max;
    }

    public static <T extends Number> Number[] sortArray(T[] array) {
        boolean check = false;
        T value;
        while(!check) {
            check = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].doubleValue() > array[i + 1].doubleValue()) {
                    value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                    check = false;
                }
            }
        }
        return array;
    }
}

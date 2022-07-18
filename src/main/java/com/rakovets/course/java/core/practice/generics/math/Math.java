package com.rakovets.course.java.core.practice.generics.math;

public abstract class Math<T extends Number> {
    public static <T> T getMaximum(T first, T second, T third) {
        T[] arr = (T[]) new Object[]{first, second, third};
        return getMaximumInArray(arr);
    }

    public static <T> T getMinimum(T first, T second, T third, T fourth, T fifth) {
        T[] arr = (T[]) new Object[]{first, second, third, fourth, fifth};
        return getMinimumInArray(arr);
    }

    public static <T> double getAverageInArray(T[] array) {
        double sum = 0;
        for (T t : array) {
            if (t == null) {
                continue;
            }
            sum += getDouble(t);
        }
        return sum / array.length;
    }

    public static <T> T getMaximumInArray(T[] array) {
        T max = getFirstOrNull(array);
        if (max == null) {
            return null;
        }
        for (T t : array) {
            if (t != null && getDouble(max) < getDouble(t)) {
                max = t;
            }
        }
        return max;
    }

    public static <T> T getMinimumInArray(T[] array) {
        T min = getFirstOrNull(array);
        if (min == null) {
            return null;
        }
        for (T t : array) {
            if (t != null && getDouble(min) > getDouble(t)) {
                min = t;
            }
        }
        return min;
    }

    private static <T> T getFirstOrNull(T[] array) {
        T first = null;
        for (T t : array) {
            if (t != null) {
                first = t;
                break;
            }
        }
        return first;
    }

    private static <T> double getDouble(T element) {
        return Double.parseDouble(element.toString());
    }
}


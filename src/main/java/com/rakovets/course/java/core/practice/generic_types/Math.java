package com.rakovets.course.java.core.practice.generic_types;

public abstract class Math {
    public static void main(String[] args) {
        System.out.println(max(1, 2, 3));

        System.out.println(min('t', 'h', 'f', 'm', 'k'));

        Integer[] arrayInteger = new Integer[]{1, 2, 3, 3};
        System.out.println(average(arrayInteger));

        System.out.println(maxInArray(arrayInteger));
        System.out.println(minInArray(arrayInteger));
    }

    public static <T extends Comparable<T>> T max(T i, T d, T c) {
        T max = i;
        if (d.compareTo(i) > 0) {
            max = d;
        }
        if (c.compareTo(i) > 0) {
            max = c;
        }
        return max;
    }

    public static <T extends Comparable<T>> T min(T i, T d, T c, T a, T z) {
        T min = i;
        if (d.compareTo(i) < 0) {
            min = d;
        }
        if (c.compareTo(i) < 0) {
            min = c;
        }
        if (a.compareTo(i) < 0) {
            min = a;
        }
        if (z.compareTo(i) < 0) {
            min = z;
        }
        return min;
    }

    public static <T extends Number> double average(T[] array) {
        double sum = 0;
        for (T element: array) {
            sum += element.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Number> double maxInArray(T[] array) {
        T max = array[0];
        for (T element: array) {
            if (max.doubleValue() < element.doubleValue()) {
                max = element;
            }
        }
        return max.doubleValue();
    }

    public static <T extends Number> double minInArray(T[] array) {
        T min = array[0];
        for (T element: array) {
            if (min.doubleValue() > element.doubleValue()) {
                min = element;
            }
        }
        return min.doubleValue();
    }
}

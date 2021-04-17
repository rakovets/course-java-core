package com.rakovets.course.java.core.practice.generic_types;

public class Math<T> {

    public static <T extends Comparable<T>> T maxValue(T a, T b, T c) {

        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
            return a;
        else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        } else return c;
    }

    public static <T extends Comparable<T>> T minValue(T a, T b, T c, T d, T e) {

        T minValue = a;
        if (b.compareTo(minValue) < 0)
            minValue = b;
        if (c.compareTo(minValue) < 0)
            minValue = c;
        if (d.compareTo(minValue) < 0)
            minValue = d;
        if (e.compareTo(minValue) < 0)
            minValue = e;
        return minValue;
    }

    public static <T> double averageValue(T[] array) {
        double sum = 0.0;

        for (T value : array) {
            sum += (double) value;
        }
        return sum / array.length;
    }

    public static <T> double maxInArray(T[] array) {
        double maxValue = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (maxValue < (double) array[i]) {
                maxValue = (double) array[i];
            }
        }
        return maxValue;
    }

    public static <T> double minInArray(T[] array) {
        double minValue = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (minValue < (double) array[i]) {
                minValue = (double) array[i];
            }
        }
        return minValue;
    }

    public static <T extends Comparable<T>> T[] bubbleSort(T[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    System.out.println("Ya sravnivay "+ array[j]+ " and " + array[j+1]);
                    T tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    public static <T extends Comparable<T>> int binarySearch(T[] array, T key) {
        int low = 0;
        int high = array.length;
        int index = 0;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (array[mid].compareTo(key) < 0) {
                    low = mid + 1;
                } else if (array[mid].compareTo(key) > 0) {
                    high = mid - 1;
                } else if (array[mid].compareTo(key) == 0) {
                    index = mid;
                    return index;
                }
            }

        return -1;
    }


}

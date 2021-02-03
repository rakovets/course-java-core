package com.rakovets.course.java.core.practice.generic_types;

import java.util.List;

public abstract class Math_Project {

    // TASK 1
    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {

        T max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        return max;
    }

    // TASK 2
    public static <T extends Comparable<T>> T minimum(T a, T b, T c, T d, T e) {

        T min = a;
        if (b.compareTo(min) < 0)
            min = b;
        if (c.compareTo(min) < 0)
            min = c;
        if (d.compareTo(min) < 0)
            min = d;
        if (e.compareTo(min) < 0)
            min = e;
        return min;
    }

    // TASK 3
    public static <T extends Number> double averageValue(List<T> list) {
        double averageValue = 0;
        for (T value : list) {
            averageValue += value.doubleValue() / list.size();
        }
        return averageValue;
    }

    // TASK 4
    public static <T extends Comparable<T>> T maximumValue(List<T> list) {
        T maximumValue = (T) list.get(0);
        for (T type : list) {
            if (type.compareTo(maximumValue) > 0)
                maximumValue = type;
        }
        return maximumValue;
    }

    // TASK 5
    public static <T extends Comparable<T>> T minimumValue(List<T> list) {
        T minimumValue = list.get(0);
        for (T type : list) {
            if (type.compareTo(minimumValue) < 0)
                minimumValue = type;
        }
        return minimumValue;
    }

    // TASK 6
    public static <T extends Comparable<T>> List<T> sortArray(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = i;
            for (int j = min + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(min)) < 0)
                    min = j;
            }
            T tmp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, tmp);
        }
        return list;
    }

    // TASK 7
    public static <T extends Comparable<T>> int binarySearch(List<T> list, T value, int low, int high) {
        if (low < high) {
            int middle = low / 2 + high / 2;
            int cmp = list.get(middle).compareTo(value);
            if (cmp < 0)
                return binarySearch(list, value, low, middle - 1);
            if (cmp > 0)
                return binarySearch(list, value, middle + 1, high);
            return middle;
        }
        return -1;
    }
}

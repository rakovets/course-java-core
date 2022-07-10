package com.rakovets.course.java.core.practice.generics;

public abstract class Math<T extends Number> {
    public static <T> T getMaximum(T one, T two, T three)  {
        T[] array = (T[]) new Object[]{one, two, three};
        return getMaximumInArray(array);
    }

    public static <T> T getMinimum(T one, T two, T three, T four, T five) {
        T[] arr = (T[]) new Object[]{one, two, three, four, five};
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
        int position = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[position] == null) {
                continue;
            } else if (array[i] == null) {
                continue;
            } else if (getDouble(array[position]) < getDouble(array[i])) {
                position = i;
            }
        }
        return array[position];
    }

    public static <T> T getMinimumInArray(T[] array) {
        int position = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[position] == null) {
                continue;
            } else if (array[i] == null) {
                continue;
            } else if (getDouble(array[position]) > getDouble(array[i])) {
                position = i;
            }
        }
        return array[position];
    }

    public static <T> double getDouble(T element) {
        return Double.parseDouble(element.toString());
    }

}

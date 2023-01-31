package com.rakovets.course.java.core.practice.generics;

public abstract class Math <T extends Number> {
    public static <T> T getMax(T one, T two, T three) {
        T[] array = (T[]) new Object[]{one, two, three};
        return getMaximum(array);
    }

    public static <T> T getMin(T one, T two, T three, T four, T five) {
        T[] array2 = (T[]) new Object[]{one, two, three, four, five};
        return getMinimum(array2);
    }

    public static <T> double getAverage(T[] array) {
        double sum = 0;
        for (T t : array) {
            if (t == null) {
                continue;
            }
            sum += getDouble(t);
        }
        return sum / array.length;
    }

    public static <T> T getMaximum(T[] array) {
       int index = 0;
       for (int i = 1; i < array.length; i++) {
           if (array[index] == null) {
               continue;
           } else if (array[i] == null) {
               continue;
           } else if (getDouble(array[index]) < getDouble(array[i])) {
               index = i;
           }
       }
       return array[index];
    }

    public static <T> T getMinimum(T[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[index] == null) {
                continue;
            } else if (array[i] == null) {
                continue;
            } else if (getDouble(array[index]) > getDouble(array[i])) {
                index = i;
            }
        }
        return array[index];
    }

    public static <T> double getDouble(T element) {
        return Double.parseDouble(element.toString());
    }
}

package com.rakovets.course.java.core.practice.generic_types.obscure;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class Math {
    public static <K extends Number> K getMax(K a, K b, K c) {
        List<K> list = new ArrayList<>();
        Stream.of(a, b, c).forEach(x -> list.add(x));
        K max = a;
        for (K item : list) {
            if (item.doubleValue() > max.doubleValue()) {
                max = item;
            }
        }
        return max;
    }

    public static <K extends Number> K getMin(K a, K b, K c, K d, K f) {
        List<K> list = new ArrayList<>();
        Stream.of(a, b, c, d, f).forEach(x -> list.add(x));
        K min = a;
        for (K item : list) {
            if (item.doubleValue() < min.doubleValue()) {
                min = item;
            }
        }
        return min;
    }

    public static <T extends Number> double getAverageInArray(T[] array) {
        double sum = 0;
        for (T items : array) {
            sum += items.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Number> double getMaxInArray(T[] array) {
        double maxValue = array[0].doubleValue();
        for (T item : array) {
            if(item.doubleValue() > maxValue) {
                maxValue = item.doubleValue();
            }
        }
        return maxValue;
    }

    public static <T extends Number> double getMinInArray(T[] array) {
        double minValue = array[0].doubleValue();
        for (T item : array) {
            if(item.doubleValue() < minValue) {
                minValue = item.doubleValue();
            }
        }
        return minValue;
    }

    public static <T extends Number> T[] getSortArray(T[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i].doubleValue() < array[i - 1].doubleValue()) {
                    T tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] =tmp;
                    needIteration = true;
                }
            }
        }
        return array;
    }

    public static <T extends Number> int binarySearch(T[] array, T value) {
       Math.getSortArray(array);
        int firstValue = 0;
        int lastValue = array.length - 1;
        int indexValue = -1;
        while (firstValue <= lastValue) {
            int mid = (firstValue + lastValue) / 2;
            if (array[mid].doubleValue() < value.doubleValue()) {
                firstValue = mid + 1;
            } else if (array[mid].doubleValue() > value.doubleValue()) {
                lastValue = mid - 1;
            } else if (array[mid].doubleValue() == value.doubleValue()) {
                indexValue = mid;
                break;
            }
        }
        return indexValue+1;
    }
}

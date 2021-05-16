package com.rakovets.course.java.core.practice.generic_types;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class Math<T extends  Number> {
    public static <T extends Number> T getMaxValueOfThree(T a, T b, T c) {
        List<T> list = new ArrayList<>();
        Stream.of(a, b, c).forEach(x -> list.add(x));
        T max = a;
        for (T item : list) {
            if (item.doubleValue() > max.doubleValue()) {
                max = item;
            }
        }
        return max;
    }

    public static <T extends Number> T getMinValueOfFive(T a, T b, T c, T d, T f) {
        List<T> list = new ArrayList<>();
        Stream.of(a, b, c, d, f).forEach(x -> list.add(x));
        T min = a;
        for (T item : list) {
            if (item.doubleValue() < min.doubleValue()) {
                min = item;
            }
        }
        return min;
    }

    public static <T extends Number> double getAverageMeanInArray(T[] array) {
        double sum = 0.0;
        for (T item : array) {
            sum += item.doubleValue();
        }
        double result = sum / array.length;
        return BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static <T extends Number> T getMaxValueInArray(T[] array) {
        T min = array[0];
        for (T value : array) {
            if (value.doubleValue() < min.doubleValue()) {
                min = value;
            }
        }
        return min;
    }

    public static <T extends Number> T getMinValueInArray(T[] array) {
        T max = array[0];
        for (T value : array) {
            if (value.doubleValue() > max.doubleValue()) {
                max = value;
            }
        }
        return max;
    }
}

package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math<T extends Number> {
    public static <T extends Number> Number getMaxValue(T first, T second, T third) {
        return getMaxArrayValue(new Number[]{first, second, third});
    }

    public static <T extends Number> Number getMinValue(T first, T second, T third, T fourth, T fifth) {
        return getMinArrayValue(new Number[]{first, second, third, fourth, fifth});
    }

    public static <T extends Number> double getAverageValue(T[] array) {
        double sum = 0.0;
        for (T number : array) {
            sum += number.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Number> T getMaxArrayValue(T[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static <T extends Number> T getMinArrayValue(T[] array) {
        Arrays.sort(array);
        return array[0];
    }
}

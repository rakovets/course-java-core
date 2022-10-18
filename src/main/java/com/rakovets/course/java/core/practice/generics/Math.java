package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math<T extends Number> {
    public static <T extends Number> T getMaxNumber(T parameter1, T parameter2, T parameter3) {
        T[] t = (T[]) new Object[]{parameter1, parameter2, parameter3};
        return getMaxValue(t);
    }

    public static <T extends Number> T getMinNumber(T parameter1, T parameter2, T parameter3, T parameter4, T parameter5) {
        T[] t = (T[]) new Object[]{parameter1, parameter2, parameter3, parameter4, parameter5};
        return getMinValue(t);
    }

    public static <T> T getMaxValue(T[] t) {
        Arrays.sort(t);
        return t[t.length - 1];
    }

    public static <T> T getMinValue(T[] t) {
        Arrays.sort(t);
        return t[0];
    }

    public static <T extends Number> double getAverageValue(T[] t) {
        double average = 0;
        for (T number : t) {
            average += number.doubleValue();
        }
        return average / t.length;
    }
}

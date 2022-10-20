package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math<T extends Number> {
    private T[] array;

    public Math(T[] array) {
        this.array = array;
    }

    public static <T extends Number> Number getMaxOfThree(T number1, T number2, T number3) {
        return getMaxArrayValue(new Number[]{number1, number2, number3});
    }

    public static <T extends Number> Number getMinOfFive(T number1, T number2, T number3, T number4, T number5) {
        return getMinArrayValue(new Number[]{number1, number2, number3, number4, number5});
    }

    public static <T extends Number> double getAverageValue(T[] array) {
        double sum = 0.0;
        for (T number : array) {
            sum = sum + number.doubleValue();
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

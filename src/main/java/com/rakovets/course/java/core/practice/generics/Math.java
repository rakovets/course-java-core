package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math<T extends Number> {
    public static <T> T getMaxValueOfThree(T first, T second, T third) {
        T[] array = (T[]) new Object[]{first, second, third};
        return getMaxValueArray(array);
    }

    public static <T> T getMinValueOfFive(T first, T second, T third, T fourth, T fifth) {
        T[] array = (T[]) new Object[]{first, second, third, fourth, fifth};
        return getMinValueArray(array);
    }

    public static <T extends Number> double getArrayAverage(T[] numbers) {
        double sum = 0;
        for (T number: numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.length;
    }

    public static <T> T getMaxValueArray(T[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static <T> T getMinValueArray(T[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}

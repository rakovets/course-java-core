package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math {
    public static <T extends Number> T getMaxElement(T first, T second, T third) {
        T[] numbers = (T[]) new Object[] {first, second, third};
        return maxValueArray(numbers);
    }

    public static <T extends Number> T getMinElement(T first, T second, T third, T four, T five) {
        T[] numbers = (T[]) new Object[] {first, second, third, four, five};
        return minValueArray(numbers);
    }

    public static <T extends Number> double getAverageArray(T[] numbers) {
        double sum = 0;
        for (T value : numbers) {
            sum += value.doubleValue();
        }
        return sum / numbers.length;
    }

    public static <T> T maxValueArray(T[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static <T> T minValueArray(T[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}

package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math {
    public static <T extends Number> T maxValueOfThree(T a, T b, T c) {
        T[] numbers = (T[]) new Object[]{a, b, c};
        return maxValueInArray(numbers);
    }

    public static <T extends Number> T minValueOfFive(T a, T b, T c, T d, T e) {
        T[] numbers = T[] new Object[]{a, b, c, d, e};
        return minValueInArray(numbers);
    }

    public static <T extends Number> double arithmeticMean(T[] numbers) {
        double sum = 0;
        for (T value : numbers) {
            sum += value.doubleValue();
        }
        return sum / numbers.length;
    }

    public static <T extends Number> T maxValueInArray(T[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static <T extends Number> T minValueInArray(T[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}

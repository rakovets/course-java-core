package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MathStatistics {
    public static void main(String[] args) {
        int[] mm = {1, 3, 4, 7, 8, 2, 46, 0, 47, 49};
        System.out.println(getNumberOfEvenNumbers(mm));
        System.out.println(getNumberOfOddNumbers(mm));
        System.out.println(getNumberOfZero(mm));
        System.out.println(getNumberOfValue(mm, 47));
    }

    public static int[] getRandom(int size, int maxValueOfRandom) {
        int[] arrayOfInt = new int[size];
        for (int i = 0; i < size; i++) {
            arrayOfInt[i] = (int)(Math.random() * maxValueOfRandom);
        }
        return arrayOfInt;
    }

    public static int getNumberOfEvenNumbers(int[] array) {
        return (int) Arrays.stream(array)
                .filter(e -> e % 2 == 0)
                .count();
    }

    public static int getNumberOfOddNumbers(int[] array) {
        return (int) Arrays.stream(array)
                .filter(e -> e % 2 != 0)
                .count();
    }

    public static int getNumberOfZero(int[] array) {
        return (int) Arrays.stream(array)
                .filter(e -> e == 0)
                .count();
    }

    public static int getNumberOfValue(int[] array, int value) {
        return (int) Arrays.stream(array)
                .filter(e -> e == value)
                .count();
    }
}

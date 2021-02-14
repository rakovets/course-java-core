package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Random;

public class MathStatistics {

    public int[] random(int size) {
        return new Random()
                .ints(size)
                .toArray();
    }

    public int countEven(int[] arr) {
        return (int) Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .count();
    }

    public int countOdd(int[] arr) {
        return (int) Arrays.stream(arr)
                .filter(x -> x % 2 != 0)
                .count();
    }

    public int countZero(int[] arr) {
        return (int) Arrays.stream(arr)
                .filter(x -> x == 0)
                .count();
    }

    public int equalToValue(int[] arr, int value) {
        return (int) Arrays.stream(arr)
                .filter(x -> x == value)
                .count();
    }
}

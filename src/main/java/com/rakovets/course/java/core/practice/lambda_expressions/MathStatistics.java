package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Random;

public class MathStatistics {

    public int[] getRandomNumbers(int size) {
        return new Random()
                .ints(size)
                .toArray();
    }

    public int getCountEven(int[] array) {
        return (int) Arrays.stream(array)
                .filter(x -> x % 2 == 0)
                .count();
    }

    public int getCountOdd(int[] array) {
        return (int) Arrays.stream(array)
                .filter(x -> x % 2 != 0)
                .count();
    }
    public int getZerros(int[] array) {
        return (int) Arrays.stream(array)
                .filter(x -> x == 0)
                .count();
    }
    public int getNotNull(int[] array) {
        return (int) Arrays.stream(array)
                .filter(x -> x!=0)
                .count();
    }
}

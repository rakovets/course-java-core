package com.rakovets.course.javabasics.practice.lambdaexpressions.streams;

import java.util.Arrays;
import java.util.Random;

public class MathStatistics {

    public static int[] generateRandomNumbers(int size, int lowBound, int highBound) {
        return new Random().ints(size, lowBound, highBound).toArray();
    }

    public static int getCountEvenNumbers(int[] array) {
        return (int) Arrays.stream(array).filter(i -> (i % 2 == 0) && (i != 0)).count();
    }

    public static int getCountUnevenNumbers(int[] array) {
        return (int) Arrays.stream(array).filter(i -> (i % 2 != 0)).count();
    }

    public static int getCountEqualsZero(int[] array) {
        return (int) Arrays.stream(array).filter(i -> i == 0).count();
    }

    public static int getCountNumberMatches(int[] array, int number) {
        return (int) Arrays.stream(array).filter(i -> i == number).count();
    }
}

package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class MathStat {

    public static int[] generate(int limit) {
        return IntStream.generate(new Random()::nextInt).limit(limit).toArray();
    }

    public static long amountOfEvens(int[] array) {
        return Arrays.stream(array)
                .filter(x -> x % 2 == 0)
                .count();
    }

    public static long amountOfOdds(int[] array) {
        return Arrays.stream(array)
                .filter(x -> x % 2 != 0)
                .count();
    }

    public static long amountOfZeroes(int[] array) {
        return Arrays.stream(array)
                .filter(x -> x == 0)
                .count();
    }

    public static long amountOfCurrentValue(int[] array, int value) {
        return Arrays.stream(array)
                .filter(x -> x == value)
                .count();
    }


}

package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Random;

public class MathStatistics {
    static int[] randomArray = new Random().ints(new Random().nextInt(100), -20, 20).toArray();

    public static int getEvenCount() {
        return (int) Arrays.stream(randomArray)
                .filter(x -> x % 2 == 0)
                .count();
    }

    public static int getOddCount() {
        return (int) Arrays.stream(randomArray)
                .filter(x -> x % 2 != 0)
                .count();
    }

    public static int getZeroCount() {
        return (int) Arrays.stream(randomArray)
                .filter(x -> x == 0)
                .count();
    }

    public static int equalToValue(int value) {
        return (int) Arrays.stream(randomArray)
                .filter(x -> x == value)
                .count();
    }
}

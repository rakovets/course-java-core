package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public abstract class MathStatistics {
    public static List<Integer> getRandomInteger(int size, int start, int end) {
        return new Random()
                .ints(size, start, end)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int getCountEvenNumbers(List<Integer> list) {
        return (int) list.stream()
                .filter(x -> x % 2 == 0)
                .count();
    }

    public static int getCountOddNumbers(List<Integer> list) {
        return (int) list.stream()
                .filter(x -> x % 2 != 0)
                .count();
    }

    public static int getCountOfZero(List<Integer> list) {
        return (int) list.stream()
                .filter(x -> x == 0)
                .count();
    }

    public static int getCountOfThisNumber(List<Integer> list, int number) {
        return (int) list.stream()
                .filter(x -> x == number)
                .count();
    }
}

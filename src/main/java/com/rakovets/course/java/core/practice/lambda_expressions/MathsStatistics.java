package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MathsStatistics {

    public static List<Integer> getRandomDigits(int x, int y, int z) {
            return new Random()
                    .ints(x, y, z)
                    .boxed()
                    .collect(Collectors.toList());
    }

    public static int getQuantityOfEven(List<Integer> list) {
        return (int) list.stream()
                .filter(x -> x % 2 == 0)
                .count();
    }

    public static int getQuantityOfOdd(List<Integer> list) {
        return (int) list.stream()
                .filter(x -> x % 2 != 0)
                .count();
    }

    public static int getQuantityOfZero(List<Integer> list) {
        return (int) list.stream()
                .filter(x -> x == 0)
                .count();
    }

    public static int getQuantityOfSomeValue(List<Integer> list, int i) {
        return (int) list.stream()
                .filter(x -> x == i)
                .count();
    }
}

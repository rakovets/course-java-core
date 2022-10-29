package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MathsStatistics {
    private final List<Integer> list = MathsStatistics.random();

    public MathsStatistics() {
    }

    public static List<Integer> random() {
        return new Random()
                .ints(30, 0, 10)
                .boxed()
                .collect(Collectors.toList());
    }

    public long getEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(c -> c % 2 == 0)
                .count();
    }

    public long getOddNumbers(List<Integer> list) {
        return list.stream()
                .filter(c -> c % 2 != 0)
                .count();
    }

    public long getNumbersNull(List<Integer> list) {
        return list.stream()
                .filter(c -> c == 0)
                .count();
    }

    public long getNumbers(List<Integer> list, int number) {
        return list.stream()
                .filter(c -> c == number)
                .count();
    }
}

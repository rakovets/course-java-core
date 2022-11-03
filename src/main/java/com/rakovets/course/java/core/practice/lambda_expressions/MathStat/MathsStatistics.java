package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MathsStatistics {
    public static List<Integer> getRandomNumbers(int minValue, int maxValue, int streamSize) {
        return new Random()
                .ints(streamSize, minValue, maxValue)
                .boxed()
                .collect(Collectors.toList());
    }

    public long getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x % 2 == 0)
                .count();
    }

    public long getOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x % 2 != 0)
                .count();
    }

    public long getZero(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x == 0)
                .count();
    }

    public long equalValue(List<Integer> numbers, int i) {
        return numbers.stream()
                .filter(x -> x == i)
                .count();
    }
}

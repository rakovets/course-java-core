package com.rakovets.course.java.core.practice.lambda_expressions.tasks;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MathStatistics {
    public List<Integer> getRandomNumbers(int amount, int from, int to) {
        return new Random().ints(amount, from, to)
                .boxed()
                .collect(Collectors.toList());
    }

    public long countEvenNumbers(Collection<Integer> collection) {
        return (int) collection.stream()
                .filter(x -> x % 2 == 0)
                .count();
    }

    public int countOddNumbers(Collection<Integer> collection) {
        return (int) collection.stream()
                .filter(x -> x % 2 != 0)
                .count();
    }

    public int countZero(Collection<Integer> collection) {
        return (int) collection.stream()
                .filter(x -> x == 0)
                .count();
    }

    public int countEqualToValue(Collection<Integer> collection, int value) {
        return (int) collection.stream()
                .filter(x -> x == value)
                .count();
    }
}

package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Collection;
import java.util.Random;
import java.util.stream.Collectors;

public class MathStatistics {
    public Collection<Integer> getRandomNumbers(int size, int minValue, int maxValue) {
        return new Random()
                .ints(size, minValue, maxValue)
                .boxed()
                .collect(Collectors.toList());
    }

    public long countEvenNumbers(Collection<Integer> collection) {
        return collection.stream()
                .filter(x -> x % 2 == 0)
                .count();
    }

    public long countOddNumbers(Collection<Integer> collection) {
        return collection.stream()
                .filter(x -> x % 2 != 0)
                .count();
    }

    public long countEqualZero(Collection<Integer> collection) {
        return collection.stream()
                .filter(x -> x == 0)
                .count();
    }

    public long countEqualNumberValue(Collection<Integer> collection, int number) {
        return collection.stream()
                .filter(x -> x == number)
                .count();
    }
}

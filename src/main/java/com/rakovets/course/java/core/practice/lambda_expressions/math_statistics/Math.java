package com.rakovets.course.java.core.practice.lambda_expressions.math_statistics;

import java.util.*;
import java.util.stream.Collectors;

public class Math {
    public List<Integer> randomValue(int numberOfValues, int firstValue, int lastValue) {
        return new Random()
                .ints(numberOfValues, firstValue, lastValue)
                .boxed()
                .collect(Collectors.toList());
    }

    public static double numberEven(List<Integer> integerList) {
        return integerList.stream()
                .filter(x -> x % 2 == 0)
                .count();
    }

    public static double numberOdd(List<Integer> integerList) {
        return integerList.stream()
                .filter(x -> x % 2 != 0)
                .count();
    }

    public static double equalZero(List<Integer> integerList) {
        return integerList.stream()
                .filter(x -> x == 0)
                .count();
    }

    public static double equalGivenValue(List<Integer> integerList, int givenValue) {
        return integerList.stream()
                .filter(x -> x == givenValue)
                .count();
    }
}

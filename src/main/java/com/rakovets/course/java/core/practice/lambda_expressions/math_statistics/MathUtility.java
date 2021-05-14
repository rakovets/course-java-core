package com.rakovets.course.java.core.practice.lambda_expressions.math_statistics;

import java.util.ArrayList;
import java.util.List;

public class MathUtility {
    public static List<Integer> getCollectionOfRandomNumbers(int number) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i <= number - 1; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        return numbers;
    }

    public static long getNumberOfEvenNumbers(List<Integer> list) {
        return list.stream().
                filter(n -> n % 2 == 0)
                .count();
    }

    public static long getNumberOfOddNumbers(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 != 0)
                .count();
    }

    public static long getNumberOfNumbersEqualsZero(List<Integer> list) {
        return list.stream()
                .filter(n -> n == 0)
                .count();
    }

    public static long getNumberOfNumbersEqualsSomeMeaning(List<Integer> list, int digital) {
        return list.stream()
                .filter(n -> n == digital)
                .count();
    }
}

package com.rakovets.course.java.core.practice.lambda_expressions.math_statistics;

import java.util.ArrayList;
import java.util.Collection;

public class MathUtil {

    public static Collection<Integer> generateRandomNumbers(int amount) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            list.add((int) (Math.random() * 10));
        }
        return list;
    }

    public static long findOddNumbers(Collection<Integer> numbers) {
        return numbers.stream()
                .filter(l -> l % 2 == 0)
                .count();
    }

    public static long findNoOddNumbers(Collection<Integer> numbers) {
        return numbers.stream()
                .filter(l -> l % 2 != 0)
                .count();
    }

    public static long findZero(Collection<Integer> numbers) {
        return numbers.stream()
                .filter(l -> l == 0)
                .count();
    }

    public static long findNumberEqualsParameter(Collection<Integer> numbers, int number) {
        return numbers.stream()
                .filter(l -> l == number)
                .count();
    }
}


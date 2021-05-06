package com.rakovets.course.java.core.practice.lambda_expressions.math_statistics;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.stream.Collectors;

public class MathUtil {
    public static Collection<Integer> generateRandomNumbers(int amount) {
        return new SecureRandom()
                .ints(amount, 1, 100)
                .boxed()
                .collect(Collectors.toList());
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


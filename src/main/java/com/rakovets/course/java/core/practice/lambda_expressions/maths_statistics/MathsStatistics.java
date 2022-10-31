package com.rakovets.course.java.core.practice.lambda_expressions.maths_statistics;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MathsStatistics {
    public List<Integer> creationSetRandomNumbers() {
        return new Random().ints(10, 0, 11)
                .boxed()
                .collect(Collectors.toList());
    }

    public long countingAmountEvenNumbers(List<Integer> listNumbers) {
        return listNumbers.stream()
                .filter(x -> x % 2 == 0).count();
    }

    public long countingAmountOddNumbers(List<Integer> listNumbers) {
        return listNumbers.stream()
                .filter(x -> x % 2 != 0).count();
    }

    public long countingAmountNumbersEqualZero(List<Integer> listNumbers) {
        return listNumbers.stream()
                .filter(x -> x == 0).count();
    }

    public long countingAmountGivenNumbers(List<Integer> list, int number) {
        return list.stream()
                .filter(x -> x == number).count();
    }
}

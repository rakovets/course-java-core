package com.rakovets.course.java.core.practice.lambda_expressions.math_statistics;

import java.util.ArrayList;
import java.util.List;

public class MathStatistics {
    public List<Integer> getListOfRandomNumbers(int length) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            randomNumbers.add((int) (Math.random() * 1000));
        }
        return randomNumbers;
    }

    public long countEvenNumbers(List<Integer> randomNumbers) {
        long countEvenNumbers = randomNumbers.stream()
                .filter(n -> n % 2 == 0)
                .count();
        return countEvenNumbers;
    }

    public long countOddNumbers(List<Integer> randomNumbers) {
        long countOddNumbers = randomNumbers.stream()
                .filter(n -> n % 2 != 0)
                .count();
        return countOddNumbers;
    }

    public long countNullNumbers(List<Integer> randomNumbers) {
        long countNullNumbers = randomNumbers.stream()
                .filter(n -> n == 0)
                .count();
        return countNullNumbers;
    }

    public long countSpecificNumbers(List<Integer> randomNumbers, int specificNumber) {
        long countSpecificNumbers = randomNumbers.stream()
                .filter(n -> n == specificNumber)
                .count();
        return countSpecificNumbers;
    }
}

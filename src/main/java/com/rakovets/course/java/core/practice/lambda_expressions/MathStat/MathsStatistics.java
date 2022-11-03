package com.rakovets.course.java.core.practice.lambda_expressions.MathStat;

import java.util.ArrayList;
import java.util.List;

public class MathsStatistics {
    private final Randomizer randomizer;

    public MathsStatistics(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    public List<Integer> getRandomNumber(int size, int randomNumberOrigin, int randomNumberBound) {
        List<Integer> result = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            result.add(i, randomizer.getRandomValue(randomNumberBound, randomNumberOrigin));
        }
        return result;
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

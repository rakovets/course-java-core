package com.rakovets.course.java.core.practice.lambda_expressions;


import java.util.Arrays;
import java.util.Random;

public class MathsStatistics {

    public int[] getRandomNumbers(int amount) {
        Random random = new Random();
        return random.ints(amount).toArray();
    }

    public long countEvenNumbers(int[] array) {
        return Arrays.stream(array)
                .filter(ExpressionHelper::isEven)
                .count();
    }

    public long countOddNumbers(int[] array) {
        return Arrays.stream(array)
                .filter(ExpressionHelper::isOdd)
                .count();
    }

    public long countEqualZero(int[] array) {
        return Arrays.stream(array)
                .filter(ExpressionHelper::isZero)
                .count();
    }

    public long countEqualNumberValue(int[] array, int number) {
        return Arrays.stream(array)
                .filter(i -> ExpressionHelper.isEqualNumberValue(i, number))
                .count();
    }

}

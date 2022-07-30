package com.rakovets.course.java.core.practice.lambda_expressions.math_statistics;

import java.util.Arrays;
import java.util.Random;

public class MathUtil {
    /**
     * Generates a set of random integers.
     *
     * @param limit  up to what limit.
     * @param random object generating random numbers.
     * @return a set of random numbers.
     */
    public String randomValue(int limit, Random random) {
        return Arrays.toString(Arrays.stream(new int[limit])
                .map(randomValue -> random.nextInt(limit))
                .toArray());
    }

    /**
     * Counts the number of even numbers.
     *
     * @param values set of numbers.
     * @return the number of even numbers.
     */
    public int countEven(int[] values) {
        return Math.toIntExact(Arrays.stream(values)
                .filter(value -> value % 2 == 0).count());
    }

    /**
     * Counts the number of odd numbers.
     *
     * @param values set of numbers.
     * @return the number of odd numbers.
     */
    public int countOdd(int[] values) {
        return Math.toIntExact(Arrays.stream(values)
                .filter(value -> value % 2 != 0).count());
    }

    /**
     * Counts the number of numbers equal to zero.
     *
     * @param values set of numbers.
     * @return the number of numbers equal to zero.
     */
    public int countZero(int[] values) {
        return Math.toIntExact(Arrays.stream(values)
                .filter(value -> value == 0).count());
    }

    /**
     * Counts the number of invalid values.
     *
     * @param values    set of numbers.
     * @param incorrect value.
     * @return number of invalid values.
     */
    public int incorrectValue(int[] values, int incorrect) {
        return Math.toIntExact(Arrays.stream(values)
                .filter(value -> value == incorrect).count());
    }
}

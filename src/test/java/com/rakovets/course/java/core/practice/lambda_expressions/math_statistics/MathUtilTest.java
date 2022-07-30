package com.rakovets.course.java.core.practice.lambda_expressions.math_statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

@DisplayName("Testing the math utility.")
public class MathUtilTest {
    MathUtil mathUtil;
    int[] ints;

    @BeforeEach
    void init() {
        ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        mathUtil = new MathUtil();
    }

    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();
        Random random = new Random();

        System.out.println(mathUtil.randomValue(10, random));
    }

    @Test
    @DisplayName("Finding the number of even numbers.")
    void countEven() {
        int expected = 10;

        int actual = mathUtil.countEven(ints);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Search for the number of odd numbers.")
    void countOdd() {
        int expected = 10;

        int actual = mathUtil.countOdd(ints);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Finding the number of numbers equal to 0.")
    void countZero() {
        int expected = 0;

        int actual = mathUtil.countZero(ints);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Finding the number of numbers equal to a number.")
    void incorrectValue() {
        int expected = 1;

        int actual = mathUtil.incorrectValue(ints, 2);

        Assertions.assertEquals(expected, actual);
    }
}

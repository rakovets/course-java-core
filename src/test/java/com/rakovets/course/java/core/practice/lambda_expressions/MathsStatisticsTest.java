package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MathsStatisticsTest {
    MathsStatistics math = new MathsStatistics();
    List<Integer> list = List.of(0, 0, 0, 5, 6, 7, 2, 1, 9, 4, 3, 3, 4, 6, 5, 8, 8, 6, 7, 3, 2, 2, 1, 3, 0, 8, 7, 4, 6, 7);

    @Test
    public void getEvenNumbersList() {
        long expected = 17;

        long actual = math.getEvenNumbers(list);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getOddNumbersList() {
        long expected = 13;

        long actual = math.getOddNumbers(list);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNumbersNullList() {
        long expected = 4;

        long actual = math.getNumbersNull(list);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNumbersList() {
        long expected = 3;

        long actual = math.getNumbers(list, 2);

        Assertions.assertEquals(expected, actual);
    }
}

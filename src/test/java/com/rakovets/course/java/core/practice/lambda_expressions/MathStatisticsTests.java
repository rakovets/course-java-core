package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.project_math_statistics.MathStatistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MathStatisticsTests {
    MathStatistics mathStatistics = new MathStatistics();
    int[] randomArray = mathStatistics.generateArrayOfRandomInt(10, -100, 200);

    @Test
    public void testGenerateArrayOfRandomInt() {
        boolean max = Arrays.stream(randomArray).max().getAsInt() < 200;
        boolean min = Arrays.stream(randomArray).max().getAsInt() > 100;

        Assertions.assertEquals(10, randomArray.length);
        Assertions.assertEquals(true, max);
        Assertions.assertEquals(true, min);
    }

    @Test
    public void testGetNumberOfEven() {
        int[] array = {0, -5, -17, 18, 4, 199, -9, 0, 7, 11};

        Assertions.assertEquals(2, mathStatistics.getNumberOfEven(array));
    }

    @Test
    public void testGetNumberOfOdd() {
        int[] array = {0, -5, -17, 18, 4, 199, -9, 0, 7, 11};

        Assertions.assertEquals(6, mathStatistics.getNumberOfOdd(array));
    }

    @Test
    public void testGetNumberOfZero() {
        int[] array = {0, -5, -17, 18, 4, 199, -9, 0, 7, 11};

        Assertions.assertEquals(2, mathStatistics.getNumberOfZero(array));
    }

    @Test
    public void testGetNumberOfSpecifiedIntNumber() {
        int[] array = {0, -5, -17, 18, 4, 199, -9, 0, 11, 11};

        Assertions.assertEquals(2, mathStatistics.getNumberOfSpecifiedIntNumber(array, 11));
    }
}

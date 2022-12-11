package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.statistics.ProjectMathsStatistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestProjectMathsStatistics {
    ProjectMathsStatistics projectMathsStatistics = new ProjectMathsStatistics();
    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 8);
    long y = 7;

    @Test
    public void testForMethodGetEven() {
        long expected = 4;

        long actual = projectMathsStatistics.getEven(list);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testForMethodNotGetEven() {
        long expected = 3;

        long actual = projectMathsStatistics.getNotEven(list);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testForMethodGetEqualsZero() {
        long expected = 0;

        long actual = projectMathsStatistics.getEqualsZero(list);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testForMethodGetSomethingValue() {
        long expected = 0;

        long actual = projectMathsStatistics.getSomethingValue(list, y);

        Assertions.assertEquals(expected, actual);
    }
}

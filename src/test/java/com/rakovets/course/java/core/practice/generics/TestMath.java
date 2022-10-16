package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMath {
    @Test
    public void testMax() {
        double expected = 9.0;
        double a = 5.0;
        double b = 4.0;

        Number actual = Math.getMaxArgument(a, b, expected);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxInt() {
        int expected = 9;
        int a = 5;
        int b = 4;

        Number actual = Math.getMaxArgument(a, expected, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxFloat() {
        float expected = 9.0f;
        float a = 5f;
        float b = 4f;

        Number actual = Math.getMaxArgument(a, expected, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxLong() {
        long expected = 9L;
        long a = 5L;
        long b = 4L;

        Number actual = Math.getMaxArgumentUseArray(a, expected, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMin() {
        double expected = 9.0;
        double a = 5.0;
        double b = 4.0;
        double c = 3.0;
        double d = 1.0;

        Number actual = Math.getMaxArgument(a, b, expected);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinInt() {
        int expected = 9;
        int a = 5;
        int b = 4;
        double c = 3;
        double d = 1;

        Number actual = Math.getMaxArgument(a, expected, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinFloat() {
        float expected = 1.0f;
        float a = 5f;
        float b = 4f;
        float c = 3f;
        float d = 9f;

        Number actual = Math.getMinArgument(a, expected, b, c, d);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinLong() {
        long expected = 1L;
        long a = 5L;
        long b = 4L;
        long c = 3L;
        long d = 9L;

        Number actual = Math.getMinArgument(a, expected, b, c, d);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        Double[] array = new Double[]{1.0, 2.0, 3.0};

        Float actual = Math.getAverageArray(array);
        Float expected = 2f;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxArray() {
        Double[] array = new Double[]{1.0, 2.0, 3.0};

        Double actual = Math.getMaxArray(array);
        Double expected = 3.0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinArray() {
        Double[] array = new Double[]{1.0, 2.0, 3.0};

        Double actual = Math.getMinArray(array);
        Double expected = 1.0;

        Assertions.assertEquals(expected, actual);
    }
}

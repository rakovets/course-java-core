package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTests {
    @Test
    void findMaxElementTest() {
        String expected = "280";

        String actual = Math.findMaxElement(56, 280, 1).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findMaxElementWithZeroTest() {
        String expected = "280";

        String actual = Math.findMaxElement(56, 280, 0).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findMaxElementWithNegativeTest() {
        String expected = "56";

        String actual = Math.findMaxElement(56, -280, 0).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findMaxElementWithFloatTest() {
        String expected = "56.28";

        String actual = Math.findMaxElement(56.28, -280, 0).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findMinElementTest() {
        String expected = "1";

        String actual = Math.findMinElement(56, 280, 1).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findMinElementWithZeroTest() {
        String expected = "0";

        String actual = Math.findMinElement(56, 280, 0).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findMinElementWithNegativeTest() {
        String expected = "-280";

        String actual = Math.findMinElement(56, -280, 0).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findMinElementWithFloatTest() {
        String expected = "-280.76";

        String actual = Math.findMinElement(56.28, -280.76, 0).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayMaxElementTest() {
        String expected = "1000";

        String actual = Math.findArrayMaxElement(new Object[]{10, 100, 1000}).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayMaxElementWithZeroTest() {
        String expected = "100";

        String actual = Math.findArrayMaxElement(new Object[]{10, 100, 0}).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayMaxElementWithNegativeTest() {
        String expected = "53";

        String actual = Math.findArrayMaxElement(new Object[]{10, -100, 53}).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayMaxElementWithFloatingPointTest() {
        String expected = "53.49";

        String actual = Math.findArrayMaxElement(new Object[]{10, -100, 53.49}).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayMaxElementWithAllZerosTest() {
        String expected = "0";

        String actual = Math.findArrayMaxElement(new Object[]{0, 0, 0}).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayMinElementTest() {
        String expected = "10";

        String actual = Math.findArrayMinElement(new Object[]{10, 100, 1000}).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayMinElementWithZeroTest() {
        String expected = "0";

        String actual = Math.findArrayMinElement(new Object[]{10, 100, 0}).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayMinElementWithNegativeTest() {
        String expected = "-100";

        String actual = Math.findArrayMinElement(new Object[]{10, -100, 53}).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayMinElementWithFloatingPointTest() {
        String expected = "-100";

        String actual = Math.findArrayMinElement(new Object[]{10, -100, 53.49}).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayMinElementWithAllZerosTest() {
        String expected = "0";

        String actual = Math.findArrayMinElement(new Object[]{0, 0, 0}).toString();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayAverageTest() {
        Double expected = 370.0;

        Double actual = Math.findArrayAverage(new Object[]{10, 100, 1000});

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayAverageWithZeroTest() {
        Double expected = 2.0;

        Double actual = Math.findArrayAverage(new Object[]{3, 3, 0});

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findArrayAverageWithNegativeTest() {
        Double expected = 10.0;

        Double actual = Math.findArrayAverage(new Object[]{100, -100, 30});

        Assertions.assertEquals(actual, expected);
    }
}

package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathTest {
    static Integer[] arrayInt;
    static Double[] arrayDouble;

    @BeforeEach
    public void init() {
        arrayInt = new Integer[]{33, 35, 21, 55, 88, 6, 7, 112, 66};
        arrayDouble = new Double[]{44.5, 11.2, 22.8, 54.3, 45.2, 76.5};
    }

    @Test
    public void getMaxOfThreeNumbersTest1() {
        Number actual = Math.getMaxOfThreeNumbers(44, 55, 22);
        Number expected = 55;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxOfThreeNumbersTest2() {
        Number actual = Math.getMaxOfThreeNumbers(4.3, 3.5, 2.2);
        Number expected = 4.3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinOfFiveNumbersTest1() {
        Number actual = Math.getMinOfFiveNumbers(44, 33, 23, 11, 56);
        Number expected = 11;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinOfFiveNumbersTest2() {
        Number actual = Math.getMinOfFiveNumbers(4.4, 1.3, 4.3, 1.1, 5.6);
        Number expected = 1.1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getArithmeticMeanTest1() {
        Number actual = Math.getArithmeticMean(arrayInt);
        Number expected = 47.0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxFromArrayTest1() {
        Number actual = Math.getMaxFromArray(arrayInt);
        Number expected = 112;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxFromArrayTest2() {
        Number actual = Math.getMaxFromArray(arrayDouble);
        Number expected = 76.5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinFromArrayTest1() {
        Number actual = Math.getMinFromArray(arrayInt);
        Number expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinFromArrayTest2() {
        Number actual = Math.getMinFromArray(arrayDouble);
        Number expected = 11.2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getBubbleSortTest1() {
        Math.getBubbleSort(arrayInt);
        Integer[] expected = {6, 7, 21, 33, 35, 55, 66, 88, 112};

        Assertions.assertArrayEquals(expected, arrayInt);
    }

    @Test
    public void getBubbleSortTest2() {
        Math.getBubbleSort(arrayDouble);
        Double[] expected = {11.2, 22.8, 44.5, 45.2, 54.3, 76.5};

        Assertions.assertArrayEquals(expected, arrayDouble);
    }

    @Test
    public void findIndexFoNumberTest1() {
        Integer actual = Math.findIndexFoNumber(arrayInt, 55);
        Integer expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findIndexFoNumberTest2() {
        Integer actual = Math.findIndexFoNumber(arrayInt, 21);
        Integer expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findIndexFoNumberTest3() {
        Integer actual = Math.findIndexFoNumber(arrayInt, 88);
        Integer expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findIndexFoNumberTest4() {
        Integer actual = Math.findIndexFoNumber(arrayDouble, 44.5);
        Integer expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findIndexFoNumberTest5() {
        Integer actual = Math.findIndexFoNumber(arrayDouble, 54.3);
        Integer expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findIndexFoNumberTest6() {
        Integer actual = Math.findIndexFoNumber(arrayDouble, 76.5);
        Integer expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findIndexFoNumberTest7() {
        Integer actual = Math.findIndexFoNumber(arrayDouble, 96.5);
        Integer expected = -1;

        Assertions.assertEquals(expected, actual);
    }
}

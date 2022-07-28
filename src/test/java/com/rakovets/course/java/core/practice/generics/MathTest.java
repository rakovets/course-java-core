package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    public void testGetMaximum() {
        Number expected = 5;

        Number actual = Math.getMaximum(1, 3, 5);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMaximumDifferentTypes() {
        Number expected = 2;

        Number actual =  Math.getMaximum(2, null, 0.9);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMinimum() {
        Number expected = 2;

        Number actual =  Math.getMinimum(10, 4, 5, 2, 8);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMinimumDifferentTypes() {
        Number expected = 4;

        Number actual =  Math.getMinimum(10.5, 4, 5.4, null, 8);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetAverage() {
        Number expected = 3.5;

        Number actual =  Math.getAverageInArray(new Double[]{5.0, 2.5, 3.0});

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetAverageWithNull() {
        Number expected = 2.0;

        Number actual =  Math.getAverageInArray(new Double[]{null, 3.0, 3.0});

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMinimumInArray() {
        Number expected = 1.0;

        Number actual =  Math.getMinimumInArray(new Double[]{5.0, 2.5, 3.0, 1.0});

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMinimumInArrayWithNull() {
        Number expected = 0.0;

        Number actual =  Math.getMinimumInArray(new Double[]{null, null, 1.0, 0.0, null});

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMaximumInArray() {
        Number expected = 5;

        Number actual = Math.getMaximumInArray(new Integer[]{5, 2, 3});

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMaximumInArrayWithNull() {
        Number expected = 10;

        Number actual = Math.getMaximumInArray(new Integer[]{null, 2, null, 10, null});

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSort() {
        Assertions.assertArrayEquals(new Double[]{2.5, 3.0, 5.0}, Math.sortArray(new Double[]{5.0, 2.5, 3.0}));
    }

    @Test
    public void testGetSortWithNull() {
        Assertions.assertArrayEquals(new Double[]{2.5, 5.0}, Math.sortArray(new Double[]{5.0, 2.5, null}));
    }

    @Test
    public void testBinarySearchInArray() {
        Assertions.assertTrue(Math.binarySearchInArray(new Double[]{5.0, 2.5, 3.0}, 5));
    }

    @Test
    public void testBinarySearchInArrayWithNull() {
        Assertions.assertTrue(Math.binarySearchInArray(new Double[]{5.0, 2.5, 3.0, null}, 2.5));
    }
}

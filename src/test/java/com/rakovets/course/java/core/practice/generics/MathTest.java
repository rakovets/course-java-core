package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    public void testGetMaximum() {
        Assertions.assertEquals(5, Math.getMaximum(1, 3, 5));
    }

    @Test
    public void testGetMaximumDifferentTypes()  {
        Assertions.assertEquals(2, Math.getMaximum(2, null, 0.9));
    }

    @Test
    public void testGetMinimum() {
        Assertions.assertEquals(2, Math.getMinimum(10, 4, 5, 2, 8));
    }

    @Test
    public void testGetMinimumDifferentTypes()  {
        Assertions.assertEquals(4, Math.getMinimum(10.5, 4, 5.4, null, 8));
    }

    @Test
    public void testGetAverage() {
        Assertions.assertEquals(3.5, Math.getAverageInArray(new Double[]{5.0, 2.5, 3.0}));
    }

    @Test
    public void testGetAverageWithNull() {
        Assertions.assertEquals(2, Math.getAverageInArray(new Double[]{null, 3.0, 3.0}));
    }

    @Test
    public void testGetMinimumInArray() {
        Assertions.assertEquals(1.0, Math.getMinimumInArray(new Double[]{5.0, 2.5, 3.0, 1.0}));
    }

    @Test
    public void testGetMinimumInArrayWithNull() {
        Assertions.assertEquals(0.0, Math.getMinimumInArray(new Double[]{null, null, 1.0, 0.0, null}));
    }

    @Test
    public void testGetMaximumInArray() {
        Assertions.assertEquals(5, Math.getMaximumInArray(new Integer[]{5, 2, 3}));
    }

    @Test
    public void testGetMaximumInArrayWithNull() {
        Assertions.assertEquals(10, Math.getMaximumInArray(new Integer[]{null, 2, null, 10, null}));
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
        Assertions.assertTrue(Math.binarySearchInArray(new Double[]{5.0, 2.5, 3.0,null}, 2.5));
    }
}

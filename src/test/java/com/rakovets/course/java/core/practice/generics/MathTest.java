package com.rakovets.course.java.core.practice.generics;

import com.rakovets.course.java.core.practice.exception_handling.InputParameterInvalidException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    public void testGetMaximum() throws InputParameterInvalidException {
        Assertions.assertEquals(5, Math.getMaximum(1, 3, 5));
    }

    @Test
    public void testGetMaximumDifferentTypes() throws InputParameterInvalidException {
        Assertions.assertEquals(2, Math.getMaximum(2, 0.4, 0.9));
    }

    @Test
    public void testGetMaximumException() {
        Assertions.assertThrows(InputParameterInvalidException.class, () -> Math.getMaximum(2, null, 0.9));
    }

    @Test
    public void testGetMinimum() throws InputParameterInvalidException {
        Assertions.assertEquals(2, Math.getMinimum(10, 4, 5, 2, 8));
    }

    @Test
    public void testGetMinimumDifferentTypes() throws InputParameterInvalidException {
        Assertions.assertEquals(2, Math.getMinimum(10.5, 4, 5.4, 2, 8));
    }

    @Test
    public void testGetMinimumException() {
        Assertions.assertThrows(InputParameterInvalidException.class, () -> Math.getMinimum(2, null, 0.9, 10, null));
    }

    @Test
    public void testGetAverage() {
        Assertions.assertEquals(3.5, Math.getAverageInArray(new Double[]{5.0, 2.5, 3.0}));
    }

    @Test
    public void testGetAverageNull() {
        Assertions.assertEquals(2, Math.getAverageInArray(new Double[]{null, 3.0, 3.0}));
    }

    @Test
    public void testGetMinimumInArray() {
        Assertions.assertEquals(1.0, Math.getMinimumInArray(new Double[]{5.0, 2.5, 3.0, 1.0}));
    }

    @Test
    public void testGetMinimumInArrayNull() {
        Assertions.assertEquals(1.0, Math.getMinimumInArray(new Double[]{null, 2.5,null,  1.0}));
    }

    @Test
    public void testGetMaximumInArray() {
        Assertions.assertEquals(5, Math.getMaximumInArray(new Integer[]{5, 2, 3}));
    }

    @Test
    public void testGetMaximumInArrayNull() {
        Assertions.assertEquals(10, Math.getMaximumInArray(new Integer[]{null, 2, null, 10}));
    }

    @Test
    public void testGetSort() {
        Assertions.assertArrayEquals(new Double[]{2.5, 3.0, 5.0}, Math.sortArray(new Double[]{5.0, 2.5, 3.0}));
    }

    @Test
    public void testGetSortNull() {
        Assertions.assertArrayEquals(new Double[]{2.5, 5.0}, Math.sortArray(new Double[]{5.0, 2.5, null}));
    }

    @Test
    public void testBinarySearchInArray() {
        Assertions.assertTrue(Math.binarySearchInArray(new Double[]{5.0, 2.5, 3.0}, 5));
    }

    @Test
    public void testBinarySearchInArrayFalse() {
        Assertions.assertFalse(Math.binarySearchInArray(new Double[]{5.0, 2.5, 3.0}, 1));
    }
}

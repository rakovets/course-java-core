package com.rakovets.course.java.core.practice.generics.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    public void testGetMaximum() {
        Assertions.assertEquals(9, Math.getMaximum(8, 9, 1));
    }

    @Test
    public void testGetMaximumDifferentTypes()  {
        Assertions.assertEquals(22, Math.getMaximum(null, 22, 1.25));
    }

    @Test
    public void testGetMinimum() {
        Assertions.assertEquals(12, Math.getMinimum(12, 88, 15, 22, 35));
    }

    @Test
    public void testGetMinimumDifferentTypes()  {
        Assertions.assertEquals(2, Math.getMinimum(2, 85.5, 8.58, 9, null));
    }

    @Test
    public void testGetAverage() {
        Assertions.assertEquals(9, Math.getAverageInArray(new Double[]{13.0, 6.0, 8.0}));
    }

    @Test
    public void testGetAverageWithNull() {
        Assertions.assertEquals(5, Math.getAverageInArray(new Double[]{null, 10.0, 5.0}));
    }

    @Test
    public void testGetMinimumInArray() {
        Assertions.assertEquals(1.0, Math.getMinimumInArray(new Double[]{1.0, 22.5, 19.0, 6.0}));
    }

    @Test
    public void testGetMinimumInArrayWithNull() {
        Assertions.assertEquals(0.0, Math.getMinimumInArray(new Double[]{0.8, null, 1.0, 0.0, null}));
    }

    @Test
    public void testGetMaximumInArray() {
        Assertions.assertEquals(35, Math.getMaximumInArray(new Integer[]{6, 35, 13}));
    }

    @Test
    public void testGetMaximumInArrayWithNull() {
        Assertions.assertEquals(35, Math.getMaximumInArray(new Integer[]{null, 6, null, 35, null}));
    }
}

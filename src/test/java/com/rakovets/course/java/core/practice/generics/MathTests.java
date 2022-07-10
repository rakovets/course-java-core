package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTests {

    @Test
    public void testGetMaximum() {
        Assertions.assertEquals(3, Math.getMaximum(1, 2, 3));
    }

    @Test
    public void testGetMaximumDifferentTypes() {
        Assertions.assertEquals(2.2, Math.getMaximum(2.2, 2, -2.2));
    }

    @Test
    public void testGetMinimum() {
        Assertions.assertEquals(1, Math.getMinimum(1, 2, 3, 4, 5));
    }

    @Test
    public void testGetMinimumDifferentTypes() {
        Assertions.assertEquals(1.1, Math.getMinimum(1.1, 1.1, 3, 5, 4));
    }

    @Test
    public void testGetAverage() {
        Assertions.assertEquals(2.0, Math.getAverageInArray(new Double[]{1.0, 2.0, 3.0}));
    }

    @Test
    public void testGetMinimumInArray() {
        Assertions.assertEquals(-0.3, Math.getMinimumInArray(new Double[]{1.2, 0.3, -0.3, 1.0}));
    }

    @Test
    public void testGetMaximumInArray() {
        Assertions.assertEquals(4, Math.getMaximumInArray(new Integer[]{1, 2, 3, 4}));
    }
}

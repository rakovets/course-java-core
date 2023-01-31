package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    public void getMaxTest() {
        Assertions.assertEquals(7, Math.getMax(2, 7, 6));
    }

    @Test
    public void getMaximumTest() {
        Assertions.assertEquals(6, Math.getMaximum(new Integer[]{2, 4, 3, 6}));
    }

    @Test
    public void getMinTest() {
        Assertions.assertEquals(2, Math.getMin(4,8,10,2,5));
    }

    @Test
    public void getMinimumTest() {
        Assertions.assertEquals(4, Math.getMinimum(new Integer[]{9, 6, 10, 4}));
    }

    @Test
    public void getAverageTest() {
        Assertions.assertEquals(5.0, Math.getAverage(new Double[]{4.0,5.0,6.0}));
    }
}

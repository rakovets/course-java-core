package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PairTest {
    private Object result;
    private Pair<Integer, Integer> pair;
    private Pair<String, String> pairString;
    private Pair<Double, Double> pairDouble;

    @BeforeEach
    void init() {
        pair = new Pair<>(13, 11);
        pairString = new Pair<>("13", "11");
        pairDouble = new Pair<>(2.55, 6.77);
    }

    @Test
    public void getSwappedTest1() {
        pair = pair.getSwapped();
        result = pair.getObject();

        Assertions.assertEquals(11, result);
    }

    @Test
    public void getSwappedTest2() {
        pairString = pairString.getSwapped();
        result = pairString.getObject();

        Assertions.assertEquals("11", result);
    }

    @Test
    public void getSwappedTest3() {
        pairDouble = pairDouble.getSwapped();
        result = pairDouble.getObject();

        Assertions.assertEquals(6.77, result);
    }

    @Test
    public void swapTest1() {
        Pair<Integer, Integer> pairSwap = Pair.swap(pair);
        result = pairSwap.getObject();

        Assertions.assertEquals(11, result);
    }

    @Test
    public void swapTest2() {
        Pair<String, String> pairSwap = Pair.swap(pairString);
        result = pairSwap.getObject();

        Assertions.assertEquals("11", result);
    }

    @Test
    public void swapTest3() {
        Pair<Double, Double> pairSwap = Pair.swap(pairDouble);
        result = pairSwap.getObject();

        Assertions.assertEquals(6.77, result);
    }
}

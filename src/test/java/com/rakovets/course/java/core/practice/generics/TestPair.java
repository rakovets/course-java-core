package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPair {
    @Test
    public <T> void testPairString() {
        Pair<String, String> actual = new Pair<>("112345", "344").getSwapped();
        Pair<String, String> expected = new Pair<>("344", "112345");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public <T> void testPairStringDouble() {
        Pair<String, Double> actual = new Pair<>("112345", 3440.0).getSwapped();
        Pair<Double, String> expected = new Pair<>(3440.0, "112345");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public <T> void testPairFloatInteger() {
        Pair<Float, Integer> actual = new Pair<>(112345f, 3440).getSwapped();
        Pair<Integer, Float> expected = new Pair<>(3440, 112345f);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public <T> void testPairFloatIntegerSwap() {
        Pair<Float, Integer> actual = Pair.swap(new Pair<>(112345f,3440 ));
        Pair<Integer, Float> expected = new Pair<>(3440, 112345f);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public <T> void testPairStringSwap() {
        Pair<String, String> actual = Pair.swap(new Pair<>("qwe","ewq" ));
        Pair<String, String> expected = new Pair<>("ewq", "qwe");

        Assertions.assertEquals(expected, actual);
    }
}

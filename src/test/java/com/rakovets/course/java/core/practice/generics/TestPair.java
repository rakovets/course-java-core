package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPair {
    @Test
    public <T> void TestPairString() {
        Pair<String, String> actual = new Pair<>("112345", "344").getSwapped();
        Pair<String, String> expected = new Pair<>("344", "112345");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public <T> void TestPairStringDouble() {
        Pair<String, Double> actual = new Pair<>("112345", 3440.0).getSwapped();
        Pair<Double, String> expected = new Pair<>(3440.0, "112345");

        Assertions.assertEquals(expected, actual);
    }
}

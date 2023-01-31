package com.rakovets.course.java.core.practice.generics.pair;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PairTest {
    Object result;
    Object expected;
    Pair<String, String> pair;

    @BeforeEach
    void init() {
        pair = new Pair<>("1", "2");
    }

    @Test
    void getSwappedTest() {
        expected = pair.getFieldK();
        pair = pair.getSwapped();
        result = pair.getFieldV();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void swapTest() {
        Pair<String, String> pairSwapped = Pair.swap(pair);

        result = pairSwapped.getFieldK();
        expected = pair.getFieldV();

        Assertions.assertEquals(expected, result);
    }
}

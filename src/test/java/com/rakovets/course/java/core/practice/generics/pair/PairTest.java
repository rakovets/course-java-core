package com.rakovets.course.java.core.practice.generics.pair;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PairTest {
    Object result;
    Object expected;
    Pair<?, ?> pair;

    @BeforeEach
    void init() {
        pair = new Pair<>("1", "2");
    }

    @Test
    void getSwappedTest() {
        pair = pair.getSwapped();
        result = pair.getFieldV();
        expected = "1";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void swapTest() {
        Pair<?, ?> pairSwapped = Pair.swap(pair);

        result = pairSwapped.getFieldK();
        expected = pair.getFieldV();

        Assertions.assertEquals(expected, result);
    }
}

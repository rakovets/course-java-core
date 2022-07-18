package com.rakovets.course.java.core.practice.generics.pair;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairTest {
    Pair<String, String> pair = new Pair<>("first", "second");

    @Test
    public void testGetSwapped() {
        Pair swapped = pair.getSwapped();
        Assertions.assertSame(swapped, pair);
        Assertions.assertEquals("second", pair.getFirst());
        Assertions.assertEquals("first", pair.getSecond());
    }

    @Test
    public void testSwap() {
        Pair swapped = Pair.swap(pair);
        Assertions.assertEquals("second", swapped.getFirst());
        Assertions.assertEquals("first", swapped.getSecond());
    }
}

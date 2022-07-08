package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairTest {
    Pair<Integer, Integer> pair = new Pair<>(1, 2);

    @Test
    public void testGetSwapped() {
        Pair swapped = pair.getSwapped();
        Assertions.assertSame(swapped, pair);
        Assertions.assertEquals(2, pair.getFirst());
        Assertions.assertEquals(1, pair.getSecond());
    }

    @Test
    public void testSwap() {
        Pair swapped= Pair.swap(pair);
        Assertions.assertEquals(2, swapped.getFirst());
        Assertions.assertEquals(1, swapped.getSecond());
    }
}

package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {
    @Test
    void swap() {
        Pair<Object, Object> pair = new Pair<>(66, "rr");
        Pair<Object, Object> pairSwap = Pair.swap(pair);
        assertEquals("rr", pairSwap.getKey());
        assertEquals(66, pairSwap.getValue());
    }

    @Test
    void getSwapped() {
        Pair<Character, Double> pair = new Pair<>('H', 3.0);
        Pair<Double, Character> pairGetSwapped = pair.getSwapped();
        assertEquals(3.0, pairGetSwapped.getKey());
        assertEquals('H', pairGetSwapped.getValue());
    }
}

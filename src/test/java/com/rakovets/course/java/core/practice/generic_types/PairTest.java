package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    void swap() {
        Pair<Object, Object> pair = new Pair<>(1, 2);
        Pair<Object, Object> swap = Pair.swap(pair);
        assertEquals(2, swap.getKey());
        assertEquals(1, swap.getValue());
    }

    @Test
    void getSwapped() {
        Pair<String, Integer> pair = new Pair<>("Key", 1);
        Pair<Integer, String> getSwapped = pair.getSwapped();
        assertEquals(1, getSwapped.getKey());
        assertEquals("Key", getSwapped.getValue());
    }
}

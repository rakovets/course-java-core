package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    void swap() {
        Pair<Object, Object> pair = new Pair<>(7, 8);

        Pair<Object, Object> swap = Pair.swap(pair);

        assertEquals(8, swap.getFirstParameter());
        assertEquals(7, swap.getSecondParameter());
    }

    @Test
    void getSwapped() {
        Pair<String, Integer> pair = new Pair<>("Java", 5);

        Pair<Integer, String> getSwapped = pair.getSwapped();

        assertEquals(5, getSwapped.getFirstParameter());
        assertEquals("Java", getSwapped.getSecondParameter());
    }
}

package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PairTest {

    @Test
    void swapTest() {
        Pair<Integer, String> pair = new Pair<>(100, "Java");
        Pair<String, Integer> swap = Pair.swap(pair);
        Assertions.assertEquals("Java", swap.getObT());
        Assertions.assertEquals(100, swap.getObV());
    }

    @Test
    void getSwapped() {
        Pair<Integer, String> firstPair = new Pair<>(1000, "Java");
        Pair<String, Integer> secondPair = firstPair.getSwapped();
        Assertions.assertEquals(1000, secondPair.getObV());
        Assertions.assertEquals("Java", secondPair.getObT());
    }
}

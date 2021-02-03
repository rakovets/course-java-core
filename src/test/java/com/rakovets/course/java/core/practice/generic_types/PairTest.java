package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    void swap() {
        Pair<Integer, String> newPair = new Pair<>(4, "test");
        Pair<String, Integer> expected = new Pair<>("test", 4);

        Pair<String, Integer> actual = Pair.swap(newPair);

        Assertions.assertEquals(expected, actual);
    }
}

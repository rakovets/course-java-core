package com.rakovets.course.java.core.practice.generics;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPair {
    Pair <String, Integer> pair =new Pair<>("Anna", 1992);

    @Test
    void testGetSwapped() {
        Pair pairSwapped = pair.getSwapped();
        int actual1 = (int) pairSwapped.getKey();
        String actual2 = (String) pairSwapped.getValue();

        Assertions.assertEquals(1992, actual1);
        Assertions.assertEquals("Anna", actual2);
    }

    @Test
    void testSwap() {
        Pair pairSwapped = Pair.swap(pair);
        int actual1 = (int) pairSwapped.getKey();
        String actual2 = (String) pairSwapped.getValue();

        Assertions.assertEquals(1992, actual1);
        Assertions.assertEquals("Anna", actual2);
    }
}

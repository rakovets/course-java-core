package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairTest {
    Pair <Integer,Integer> pair = new Pair<>(3,4);
    Pair <Integer,String> pair2 = new Pair<>(1, "Java");

    @Test
    public void getSwappedTest() {
        pair.getSwapped();
        Assertions.assertEquals(4, pair.getKey());
        Assertions.assertEquals(3,pair.getValue());
    }

    @Test
    public void swapTest() {
        pair.swap(pair);
        Assertions.assertEquals(4, pair.getKey());
        Assertions.assertEquals(3, pair.getValue());
    }
}

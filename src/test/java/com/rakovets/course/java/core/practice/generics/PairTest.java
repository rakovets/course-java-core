package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicMarkableReference;

public class PairTest {
    Pair<Integer,Integer> pair = new Pair<>(1,2);
    Pair<Integer,String> pair2 = new Pair<>(1,"");

    @Test
    public void testGetSwapped() {
     pair.getSwapped();
     Assertions.assertEquals( 2 ,pair.getFirst());
        Assertions.assertEquals( 1 ,pair.getSecond());
    }

    @Test
    public void testSwap() {
        Pair.swap(pair);
        Assertions.assertEquals(2,pair.getFirst());
        Assertions.assertEquals(1,pair.getSecond());
    }

    @Test
    public void example() {
        Pair.swap(pair);
    }
}

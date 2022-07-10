package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairTests {
        Pair<Integer,Integer> pair = new Pair<>(1,2);
        Pair<Integer,String> pair2 = new Pair<>(1,"Hello");

        @Test
        public void testGetSwapped() {
            pair.getSwapped();
            Assertions.assertEquals( 2 ,pair.getOne());
            Assertions.assertEquals( 1 ,pair.getTwo());
        }

        @Test
        public void testSwap() {
            Pair.swap(pair);
            Assertions.assertEquals(2, pair.getOne());
            Assertions.assertEquals(1, pair.getTwo());
        }
}

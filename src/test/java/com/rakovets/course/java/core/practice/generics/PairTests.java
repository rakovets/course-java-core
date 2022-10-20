package com.rakovets.course.java.core.practice.generics;

import com.rakovets.course.java.core.practice.generics.project_pair.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairTests {
    Pair<String, Integer> pair = new Pair<>("Bob", 100);
    Pair<String, Integer> pair2 = new Pair<>("BobBob", 100000);

    @Test
    public void testGetSwapped() {
        Assertions.assertEquals(100, pair.getSwapped().getName());
        Assertions.assertEquals("Bob", pair.getSwapped().getNum());
        Assertions.assertEquals("BobBob", Pair.swap(pair2).getNum());
        Assertions.assertEquals(100000, Pair.swap(pair2).getName());
    }
}

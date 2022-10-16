package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairTest {

    @Test
    void PairConstructor() {
        Pair<Object, Object> pair = new Pair<>(7, "asd");

        Object actual1 = pair.getFiledTypeK();
        Object actual2 = pair.getFiledTypeV();

        assertEquals(7, actual1);
        assertEquals("asd", actual2);
    }

    @Test
    void PairGetAndSetMethod() {
        Pair<Object, Object> pair = new Pair<>(7, "asd");

        pair.setFiledTypeK("Hi!");
        pair.setFiledTypeV('c');
        Object actual1 = pair.getFiledTypeK();
        Object actual2 = pair.getFiledTypeV();

        assertEquals("Hi!", actual1);
        assertEquals('c', actual2);
    }

    @Test
    void PairGetSwappedMethod() {
        Pair<Object, Object> pair = new Pair<>("Hi!", 'c');

        Pair<Object, Object> swapped = pair.getSwapped();

        assertEquals('c', swapped.getFiledTypeK());
        assertEquals("Hi!", swapped.getFiledTypeV());
    }

    @Test
    void PairSwapMethod() {
        Pair<Object, Object> pair = new Pair<>("Hi!", 92);

        Pair<Object, Object> swap = Pair.swap(pair);

        assertEquals(92, swap.getFiledTypeK());
        assertEquals("Hi!", swap.getFiledTypeV());
    }
}

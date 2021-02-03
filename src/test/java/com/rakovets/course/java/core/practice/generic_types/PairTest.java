package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    void swap() {
        //Given
        Pair<String, Integer> pair = new Pair<>("cat",33);
        //When
        Pair<String, Integer> swappedPair = Pair.swap(pair);
        //Then
        Assertions.assertEquals("33cat", "33cat");


    }

    @Test
    void getSwapped() {
    }
}

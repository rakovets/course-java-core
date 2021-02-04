package com.rakovets.course.java.core.practice.generic_types.pair;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    void swap() {

        //Given
        Pair<String, Integer> expectedPair = new Pair<>("E",46);

        //When
        Pair <String, Integer> actualPair = Pair.swap(46,"E");
        String actualStr = actualPair.toString();
        String expectedStr = expectedPair.toString();

        //Than
        Assertions.assertEquals(expectedStr,actualStr);
    }

    @Test
    void getSwapped() {

        //Given
        Pair<String, Integer> expectedPair = new Pair<>("E",36);

        //When
        Pair<Integer, String> actualPair = new Pair<>(36,"E");
        String actualStr = actualPair.getSwapped().toString();
        String expectedStr = expectedPair.toString();

        //Than
        Assertions.assertEquals(expectedStr,actualStr);
    }
}

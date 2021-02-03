package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    void swap() {
        Pair<String, Double> testObj = new Pair<>("hello", 14.22);

        Pair<Double, String> changedObj = Pair.swap(testObj);
        String actual = changedObj.getTwo() + changedObj.getOne().toString();
        String expected = testObj.getOne() + testObj.getTwo().toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSwapped() {
        Pair<String, Double> testObj = new Pair<>("hello", 14.22);

        Pair<Double, String> changedObj = testObj.getSwapped();
        String actual = changedObj.getTwo() + changedObj.getOne().toString();
        String expected = testObj.getOne() + testObj.getTwo().toString();

        Assertions.assertEquals(expected, actual);
    }
}

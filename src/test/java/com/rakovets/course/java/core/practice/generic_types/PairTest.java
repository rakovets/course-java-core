package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    void swap() {
        Pair<String, Double> testObj = new Pair<>("trtrtr", 55.55);

        Pair<Double, String> changedObj = Pair.swap(testObj);
        String actual = changedObj.getTwo() + changedObj.getOne().toString();
        String expected = testObj.getOne() + testObj.getTwo().toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSwapped() {
        Pair<String, Double> testObj = new Pair<>("trtrtr", 55.55);
        String expected1 = testObj.getOne() + testObj.getTwo().toString();
        String expected2 = testObj.getTwo().toString();

        Pair<Double, String> changedObj = testObj.getSwapped();
        String actual1 = changedObj.getTwo() + changedObj.getOne().toString();
        String actual2 = changedObj.getOne().toString();


        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }
}

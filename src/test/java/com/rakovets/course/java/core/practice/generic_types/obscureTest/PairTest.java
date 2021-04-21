package com.rakovets.course.java.core.practice.generic_types.obscureTest;

import com.rakovets.course.java.core.practice.generic_types.Obscure;
import com.rakovets.course.java.core.practice.generic_types.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PairTest<T> {

    @Test
    void swap() {
        Pair<String, Integer> pairExpected = new Pair<>("Java", 1995);
        Pair<Integer, String> pairActual = Pair.swap(pairExpected);
        String actualString = pairActual.getFieldV() + pairActual.getFieldK().toString();
        String expectedString = pairExpected.getFieldK() + pairExpected.getFieldV().toString();

        Assertions.assertEquals(actualString, expectedString);
    }

    @Test
    void getSwapped() {
        Pair<String, Integer> pairExpected = new Pair<>("Java", 1995);
        Pair<Integer, String> pairActual = pairExpected.getSwapped();
        String actualString = pairActual.getFieldV() + pairActual.getFieldK().toString();
        String expectedString = pairExpected.getFieldK() + pairExpected.getFieldV().toString();

        Assertions.assertEquals(actualString, expectedString);
    }
}

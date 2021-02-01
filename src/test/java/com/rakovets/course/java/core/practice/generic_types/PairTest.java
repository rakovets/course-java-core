package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Locale;
import java.util.stream.Stream;

public class PairTest {
    @Test
    void swap() {
        // GIVEN
        Pair<String, Integer> given = new Pair<>("Generic", 1234);
        // WHEN
        Pair<Integer, String> then = Pair.swap(given);
        String actualFirst = then.getFirstField().toString();
        String actualSecond = then.getSecondField().toString();

        String expectedFirst = given.getSecondField().toString();
        String expectedSecond = given.getFirstField().toString();

        Assertions.assertEquals(expectedFirst, actualFirst);
        Assertions.assertEquals(expectedSecond, actualSecond);
    }
}

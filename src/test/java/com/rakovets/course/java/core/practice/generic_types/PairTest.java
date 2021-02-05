package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class PairTest {
    @Test
    void swap() {
        // GIVEN
        Pair<String, Integer> given = new Pair<>("Generic", 1234);

        // WHEN
        Pair<Integer, String> then = Pair.swap(given);

        // THEN
        Assertions.assertEquals(given.getFirstField(), then.getSecondField());
        Assertions.assertEquals(given.getSecondField(), then.getFirstField());
    }

    @Test
    void getSwapped() {
        // GIVEN
        Pair<Boolean, Double[]> given = new Pair<>(true, new Double[] {1.0, 2.0, 3.4});

        // WHEN
        Pair<Double[], Boolean> test = given.getSwapped();
        String actualString = test.getSecondField() + Arrays.toString(test.getFirstField());
        String expectedString = given.getFirstField() + Arrays.toString(given.getSecondField());

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }
}

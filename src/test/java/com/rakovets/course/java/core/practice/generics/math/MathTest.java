package com.rakovets.course.java.core.practice.generics.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathTest {
    static Number[] array;
    Number result;
    Number expected;

    @BeforeAll
    static void init() {
        array = new Number[]{4.0, 2.0, 3.0, 4.0, 5.0};
    }

    @DisplayName("Test maxOfThree(), returns max of three arguments")
    @Test
    void maxOfThreeTest() {
        result = Math.maxOfThree(1, 3, 4);
        expected = 4;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test minOfFive(), returns min of five arguments")
    @Test
    void minOfFiveTest() {
        result = Math.minOfFive(1, 3, 4, 6, 9);
        expected = 1;

        Assertions.assertEquals(expected, result);
    }
}

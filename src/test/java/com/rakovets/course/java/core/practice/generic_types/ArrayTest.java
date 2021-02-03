package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    static Stream<Arguments> provideArgumentsForGetAverageMethod() {
        return Stream.of(
                Arguments.of(2, new Integer[] {1, 2, 3}),
                Arguments.of(3.675, new Number[] {1.4, 2.5, 3.6, 7.2}),
                Arguments.of(3.675, new Double[] {1.4, 2.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAverageMethod")
    void getAverage(double expected, Number[] myArray) {

        double actual = Array.getAverage(myArray);

        Assertions.assertEquals(expected, actual);
    }
}

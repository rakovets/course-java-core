package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPoint {
    static Stream<Arguments> provideArgumentsForDistancePoint() {
        return Stream.of(
                Arguments.of(5, 20, 19, 13, 15.65),
                Arguments.of(2, 9, 19, 91, 83.74),
                Arguments.of(25, 4, 20, 14, 11.18)
        );
    }

    @ParameterizedTest(name = "Result: {0}.")
    @MethodSource("provideArgumentsForDistancePoint")
    void test(int x, int y, int x1, int y1, double expected) {

        Point point = new Point(x, y);
        Point second = new Point(x1, y1);

        double actual = point.getDistance(second);
        assertEquals(expected, actual);
    }
}

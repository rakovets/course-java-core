package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.practice.oop_classes_and_objects.Point;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPoint {
    static Stream<Arguments> provideArgumentsForDistancePoint() {
        return Stream.of(
                Arguments.of(100, 20, 24, -30, 90.97),
                Arguments.of(0, 0, 0, 0, 0),
                Arguments.of(10, 3, 3, 2, 7.07),
                Arguments.of(3, 2, 10, 3, 7.07),
                Arguments.of(-57, 11, -4, -21, 61.91)
        );
    }

    @ParameterizedTest(name = "Distance between points: {0}.")
    @MethodSource("provideArgumentsForDistancePoint")
    void test(int x1, int y1, int x2, int y2, double expected) {

        Point point = new Point(x1, y1);
        Point move = new Point(x2, y2);

        double actual = point.getDistance(move);

        assertEquals(expected, actual);
    }
}

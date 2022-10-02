package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dzmitry Krasiuk
 */
@DisplayName("Point")
public class PointTest {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(1, 1, 2, 2, 1.41),
                Arguments.of(11, 21, 44, 44, 40.22),
                Arguments.of(-1, -1, -2, -2, 1.41)
        );
    }

    @ParameterizedTest(name = "Distance between: {0}")
    @MethodSource("provideArguments")
    @DisplayName("Distance")
    void getDistanceTest(int x, int y, int a, int b, double expected) {
        Point test = new Point(x, y);
        Point target = new Point(a, b);
        double actual = test.getDistance(target);

        assertEquals(expected, actual);
    }
}

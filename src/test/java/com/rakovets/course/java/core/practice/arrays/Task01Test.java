package com.rakovets.course.java.core.practice.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Marks")
class Task01Test {
    static Stream<Arguments> provideArgumentsForAverageMark() {
        return Stream.of(
                Arguments.of(new int[]{5, 4, 5, 4, 9, 4, 9, 4, 5, 4}, 5.3),
                Arguments.of(new int[]{6, 4, 8, 9, 6, 2, 1, 4, 5, 9, 9}, 5.73),
                Arguments.of(new int[]{7, 7, 9, 3, 6, 9, 2, 5, 6, 9}, 6.3),
                Arguments.of(new int[]{70, 46, 100, 33, 68, 25, 17, 49}, 51.0),
                Arguments.of(new int[]{6, 4, 7, 0, 1, 2, 1, 4, 4, 4, 4, 5, 10}, 4.0)
        );
    }

    static Stream<Arguments> provideArgumentsForMinMark() {
        return Stream.of(
                Arguments.of(new int[]{5, 4, 5, 4, 9, 4, 9, 4, 5, 4}, 4),
                Arguments.of(new int[]{6, 4, 8, 9, 6, 2, 1, 4, 5, 9, 9}, 1),
                Arguments.of(new int[]{7, 7, 9, 3, 6, 9, 2, 5, 6, 9}, 2),
                Arguments.of(new int[]{70, 46, 100, 33, 68, 25, 17, 49}, 17),
                Arguments.of(new int[]{6, 4, 7, 0, 1, 2, 1, 4, 4, 4, 4, 5, 10}, 0)
        );
    }

    static Stream<Arguments> provideArgumentsForMaxMark() {
        return Stream.of(
                Arguments.of(new int[]{5, 4, 5, 4, 9, 4, 9, 4, 5, 4}, 9),
                Arguments.of(new int[]{6, 4, 8, 9, 6, 2, 1, 4, 5, 9, 9}, 9),
                Arguments.of(new int[]{7, 7, 9, 3, 6, 9, 2, 5, 6, 9}, 9),
                Arguments.of(new int[]{70, 46, 100, 33, 68, 25, 17, 49}, 100),
                Arguments.of(new int[]{6, 4, 7, 0, 1, 2, 1, 4, 4, 4, 4, 5, 10}, 10)
        );
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("provideArgumentsForAverageMark")
    @DisplayName("Average mark")
    void getAverageMarkTest(int[] marks, double expected) {
        double actual = Task01.getAverageMark(marks);

        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("provideArgumentsForMinMark")
    @DisplayName("Min mark")
    void getMinMarkTest(int[] marks, int expected) {
        int actual = Task01.getMinMark(marks);

        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("provideArgumentsForMaxMark")
    @DisplayName("Max mark")
    void getMaxMarkTest(int[] marks, int expected) {
        int actual = Task01.getMaxMark(marks);

        assertEquals(expected, actual);
    }
}

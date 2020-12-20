package com.rakovets.course.javabasics.practice.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 * @version 1.0
 */
class Task02Test {
    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{5, 4, 5}, {4, 9, 4}, {9, 4, 5}}, Map.of("average", 5.44, "min", 4, "max", 9)),
                Arguments.of(new int[][]{{6, 4, 8}, {9, 6, 2}, {1, 4, 5}}, Map.of("average", 5.0, "min", 1, "max", 9)),
                Arguments.of(new int[][]{{7, 7, 9}, {3, 6, 9}, {2, 5, 6}}, Map.of("average", 6.0, "min", 2, "max", 9)),
                Arguments.of(new int[][]{{70, 46, 100}, {33, 68, 25}, {17, 49, 67}}, Map.of("average", 52.78, "min", 17, "max", 100)),
                Arguments.of(new int[][]{{6, 4, 7}, {0, 1, 2}, {1, 4, 4}, {4, 4, 5}}, Map.of("average", 3.5, "min", 0, "max", 7))
        );
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("testProvider")
    @DisplayName("Average for all marks")
    void getAverageMarkTest(int[][] marks, Map actual) {
        assertEquals(Task02.getAverageMark(marks), actual.get("average"));
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("testProvider")
    @DisplayName("Min for all marks")
    void getMinMarkTest(int[][] marks, Map actual) {
        assertEquals(Task02.getMinMark(marks), actual.get("min"));
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("testProvider")
    @DisplayName("Max for all marks")
    void getMaxMarkTest(int[][] marks, Map actual) {
        assertEquals(Task02.getMaxMark(marks), actual.get("max"));
    }
}

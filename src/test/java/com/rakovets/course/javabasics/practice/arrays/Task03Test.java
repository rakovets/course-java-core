package com.rakovets.course.javabasics.practice.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Dmitry Rakovets
 * @version 1.0
 */
class Task03Test {
    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{5, 4, 5}, {4, 9, 4}, {9, 4, 5}}, Map.of("average", new double[]{4.67, 5.67, 6.0}, "min", new int[]{4, 4, 4}, "max", new int[]{5, 9, 9})),
                Arguments.of(new int[][]{{6, 4, 8}, {9, 6, 2}, {1, 4, 5}}, Map.of("average", new double[]{6.0, 5.67, 3.33}, "min", new int[]{4, 2, 1}, "max", new int[]{8, 9, 5})),
                Arguments.of(new int[][]{{7, 7, 9}, {3, 6, 9}, {2, 5, 6}}, Map.of("average", new double[]{7.67, 6.0, 4.33}, "min", new int[]{7, 3, 2}, "max", new int[]{9, 9, 6})),
                Arguments.of(new int[][]{{70, 46, 100}, {33, 68, 25}, {17, 49, 67}}, Map.of("average", new double[]{72.0, 42.0, 44.33}, "min", new int[]{46, 25, 17}, "max", new int[]{100, 68, 67})),
                Arguments.of(new int[][]{{6, 4, 7}, {0, 1, 2}, {1, 4, 4}, {4, 4, 5}}, Map.of("average", new double[]{5.67, 1.0, 3.0, 4.33}, "min", new int[]{4, 0, 1, 4}, "max", new int[]{7, 2, 4, 5}))
        );
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("testProvider")
    @DisplayName("Average mark for subject")
    void getAverageMarkTest(int[][] marks, Map actual) {
        assertArrayEquals(Task03.getAverageMark(marks), (double[]) actual.get("average"));
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("testProvider")
    @DisplayName("Min mark for subject")
    void getMinMarkTest(int[][] marks, Map actual) {
        assertArrayEquals(Task03.getMinMark(marks), (int[]) actual.get("min"));
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("testProvider")
    @DisplayName("Max mark for subject")
    void getMaxMarkTest(int[][] marks, Map actual) {
        assertArrayEquals(Task03.getMaxMark(marks), (int[]) actual.get("max"));
    }
}

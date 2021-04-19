package com.rakovets.course.java.core.practice.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Marks for subjects")
class Task03Test {
    static Stream<Arguments> provideArgumentsForAverageMarks() {
        return Stream.of(
                Arguments.of(new int[][]{{5, 4, 5}, {4, 9, 4}, {9, 4, 5}}, new double[]{4.67, 5.67, 6.0}),
                Arguments.of(new int[][]{{6, 4, 8}, {9, 6, 2}, {1, 4, 5}}, new double[]{6.0, 5.67, 3.33}),
                Arguments.of(new int[][]{{7, 7, 9}, {3, 6, 9}, {2, 5, 6}}, new double[]{7.67, 6.0, 4.33}),
                Arguments.of(new int[][]{{70, 46, 100}, {33, 68, 25}, {17, 49, 67}}, new double[]{72.0, 42.0, 44.33}),
                Arguments.of(new int[][]{{6, 4, 7}, {0, 1, 2}, {1, 4, 4}, {4, 4, 5}}, new double[]{5.67, 1.0, 3.0, 4.33})
        );
    }

    static Stream<Arguments> provideArgumentsForMinMarks() {
        return Stream.of(
                Arguments.of(new int[][]{{5, 4, 5}, {4, 9, 4}, {9, 4, 5}}, new int[]{4, 4, 4}),
                Arguments.of(new int[][]{{6, 4, 8}, {9, 6, 2}, {1, 4, 5}}, new int[]{4, 2, 1}),
                Arguments.of(new int[][]{{7, 7, 9}, {3, 6, 9}, {2, 5, 6}}, new int[]{7, 3, 2}),
                Arguments.of(new int[][]{{70, 46, 100}, {33, 68, 25}, {17, 49, 67}}, new int[]{46, 25, 17}),
                Arguments.of(new int[][]{{6, 4, 7}, {0, 1, 2}, {1, 4, 4}, {4, 4, 5}}, new int[]{4, 0, 1, 4})
        );
    }

    static Stream<Arguments> provideArgumentsForMaxMarks() {
        return Stream.of(
                Arguments.of(new int[][]{{5, 4, 5}, {4, 9, 4}, {9, 4, 5}}, new int[]{5, 9, 9}),
                Arguments.of(new int[][]{{6, 4, 8}, {9, 6, 2}, {1, 4, 5}}, new int[]{8, 9, 5}),
                Arguments.of(new int[][]{{7, 7, 9}, {3, 6, 9}, {2, 5, 6}}, new int[]{9, 9, 6}),
                Arguments.of(new int[][]{{70, 46, 100}, {33, 68, 25}, {17, 49, 67}}, new int[]{100, 68, 67}),
                Arguments.of(new int[][]{{6, 4, 7}, {0, 1, 2}, {1, 4, 4}, {4, 4, 5}}, new int[]{7, 2, 4, 5})
        );
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("provideArgumentsForAverageMarks")
    @DisplayName("Average mark for subject")
    void getAverageMarkTest(int[][] marks, double[] expected) {
        double[] actual = Task03.getAverageMarks(marks);

        assertArrayEquals(actual, expected);
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("provideArgumentsForMinMarks")
    @DisplayName("Min mark for subject")
    void getMinMarkTest(int[][] marks, int[] expected) {
        int[] actual = Task03.getMinMarks(marks);

        assertArrayEquals(actual, expected);
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("provideArgumentsForMaxMarks")
    @DisplayName("Max mark for subject")
    void getMaxMarkTest(int[][] marks, int[] expected) {
        int[] actual = Task03.getMaxMarks(marks);

        assertArrayEquals(actual, expected);
    }
}

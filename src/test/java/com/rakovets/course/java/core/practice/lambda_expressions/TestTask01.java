package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask01 {
    Task01 task01 = new Task01();

    static Stream<Arguments> provideArgumentsConvertArrayToMap() {
        return Stream.of(
                Arguments.of(new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"},
                        (Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsConvertArrayToMap")
    void testConvertArrayToMap(String[] args, Map<String, String> expected) {
        Map<String, String> actual = task01.convertArrayToMap(args);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsConvertMapToArrayArguments() {
        return Stream.of(
                Arguments.of((Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt")),
                        new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsConvertMapToArrayArguments")
    public void testConvertMapToArray(Map<String, String> map, String[] expected) {
        String[] actual = task01.convertMapToArray(map);
        Arrays.sort(expected);
        Arrays.sort(actual);

        Assertions.assertArrayEquals(expected, actual);
    }
}

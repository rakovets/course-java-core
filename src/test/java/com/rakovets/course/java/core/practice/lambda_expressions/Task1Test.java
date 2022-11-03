package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    Task1 task1 = new Task1();

    static Stream<Arguments> provideArgumentsConvertToMap() {
        return Stream.of(
                Arguments.of(new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "-out.txt"},
                        (Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "-out.txt"))),
                Arguments.of(new String[]{"1", "Nik", "2", "Jim", "3", "Tom", "4", "Ann", "5", "Elif"},
                        (Map.of("1", "Nik", "2", "Jim", "3", "Tom", "4", "Ann", "5", "Elif")))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsConvertToMap")
    public void testConvertArrayToMap(String[] args, Map<String, String> expected) {
        Map<String, String> actual = task1.convertToMap(args);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsConvertFromMapToArray() {
        return Stream.of(
                Arguments.of((Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "-out.txt")),
                        new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "-out.txt"}),
                Arguments.of((Map.of("1", "Nik", "2", "Jim", "3", "Tom", "4", "Ann", "5", "Elif")),
                        new String[]{"1", "Nik", "2", "Jim", "3", "Tom", "4", "Ann", "5", "Elif"})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsConvertFromMapToArray")
    public void testConvertMapToArray(Map<String, String> map, String[] expected) {
        Arrays.sort(expected);

        String[] actual = task1.convertToArray(map);

        Arrays.sort(actual);

        Assertions.assertArrayEquals(expected, actual);
    }
}

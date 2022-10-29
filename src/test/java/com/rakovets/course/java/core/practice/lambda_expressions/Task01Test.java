package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task01Test {
    static Stream<Arguments> provideArgumentsForGetToMap() {
        return Stream.of(
                Arguments.of(new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"},
                        (Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"))),
                Arguments.of(new String[]{"hello", "привет", "fine", "хорошо", "map", "карта", "task", "задание"},
                        (Map.of("hello", "привет", "fine", "хорошо", "map", "карта", "task", "задание")))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetToMap")
    void getToMap(String[] args, Map<String, String> expected) {
        Task01 task = new Task01();

        Map<String, String> actual = task.getToMap(args);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> ConvertMapToArrayArguments() {
        return Stream.of(
                Arguments.of( (Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt")),
                        new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"})
        );
    }

    @ParameterizedTest
    @MethodSource("ConvertMapToArrayArguments")
    public void convertMapToArray(Map<String, String> map, String[] expected) {
        Task01 task1 = new Task01();

        String[] actual = task1.mapToArray(map);

        Assertions.assertEquals(expected, actual);
    }
}

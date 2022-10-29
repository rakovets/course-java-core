package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class Task1Test {
    static Stream<Arguments> ConvertArrayToMapArguments() {
        return Stream.of(
                Arguments.of(new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"},
                        (Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt")))
        );
    }

    @ParameterizedTest
    @MethodSource("ConvertArrayToMapArguments")
    public void convertArrayToMap(String[] lines, Map<String, Integer> expected) {
        Task1 task1 = new Task1();

        Map<String, String> actual = task1.convertArrayToMap(lines);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ConvertMapToArrayArguments() {
        return Stream.of(
                Arguments.of( (Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt")),
                        new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"})
        );
    }

    @ParameterizedTest
    @MethodSource("ConvertMapToArrayArguments")
    public void convertMapToArray(TreeMap<String, String> map, String[] expected) {
        Task1 task1 = new Task1();

        String[] actual = task1.convertMapToArray(map);

        Assertions.assertEquals(expected, actual);
    }
}

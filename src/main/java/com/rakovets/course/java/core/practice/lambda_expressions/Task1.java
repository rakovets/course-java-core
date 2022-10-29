package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public Map<String, String> convertArrayToMap(String[] lines) {
        return Stream.iterate(0, x -> x < lines.length, x -> x + 2)
                .collect(Collectors.toMap(
                        x -> lines[x],
                        x -> lines[x + 1]));

    }

    public String[] convertMapToArray(Map<String, String> string) {
        return string.entrySet()
                .stream()
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
    }
}

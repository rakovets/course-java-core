package com.rakovets.course.java.core.practice.lambda_expressions.tasks;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task01 {
    public Map<String, String> arrayToMap(String[] strings) {
        return Stream.iterate(1, x -> x < strings.length, x -> x + 2)
                .collect(Collectors.toMap(
                        x -> strings[x - 1],
                        x -> strings[x]));
    }

    public String[] mapToStringArray(Map<String, String> map) {
        return map.entrySet().stream()
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
    }
}

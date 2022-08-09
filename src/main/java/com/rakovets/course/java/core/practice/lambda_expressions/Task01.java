package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task01 {
    public Map<String, String> keysAndValuesSorted(String[] strings) {
        return Stream.iterate(0, x -> x < strings.length, x -> x + 2)
                .collect(Collectors.toMap(
                        x -> strings[x],
                        x -> strings[x + 1]));
    }

    public String[] convertMapToString(Map<String, String> map) {
        return map.entrySet()
                .stream()
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
    }
}

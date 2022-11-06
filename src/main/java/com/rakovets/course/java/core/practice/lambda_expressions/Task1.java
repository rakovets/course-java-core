package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public Map<String, String> getKeyAndValue(String[] str) {
        return Stream.iterate(0, x -> x < str.length, x -> x + 2)
                .collect(Collectors.toMap(
                        x -> str[x],
                        x -> str[x + 1]));
    }

    public String[] convertToString(Map<String, String> map) {
        return map.entrySet()
                .stream()
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
    }
}

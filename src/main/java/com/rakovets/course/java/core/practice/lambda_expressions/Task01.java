package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task01 {
    public Map<String, String> getToMap(String[] args) {
        return Stream.iterate(0, x -> x < args.length, x -> x + 2)
                .collect(Collectors.toMap(
                        x -> args[x],
                        x -> args[x + 1]));
    }

    public String[] mapToArray(Map<String, String> map) {
        return map.entrySet()
                .stream()
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
    }
}

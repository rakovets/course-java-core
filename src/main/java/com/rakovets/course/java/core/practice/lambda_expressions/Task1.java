package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public Map<String, String> getMap(String[] array) {
        return Stream.iterate(0, x -> x < array.length, x -> x + 2)
                .collect(Collectors.toMap(
                        x -> array[x],
                        x -> array[x + 1]
                ));
    }

    public String[] getArrayString(Map<String, String> map) {
        return map.entrySet().stream()
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
    }
}


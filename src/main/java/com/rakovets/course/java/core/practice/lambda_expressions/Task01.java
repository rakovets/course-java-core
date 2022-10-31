package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task01 {
    public Map<String, String> convertArrayInMap(String[] array) {
        return Stream.iterate(0, a -> a < array.length, a -> a + 2)
                .collect(Collectors.toMap(a -> array[a], a -> array[a + 1]));
    }

    public String[] convertMapInArray(Map<String, String> map) {
        return map.entrySet().stream()
                .flatMap(m -> Stream.of(m.getKey(), m.getValue())).toArray(String[]::new);
    }
}

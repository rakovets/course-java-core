package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task01 {
    private String[] array;
    private Map<String, String> map;

    public Task01(Map<String, String> map) {
        this.map = map;
    }

    public Task01(String[] array) {
        this.array = array;
    }

    public Map<String, String> getMapFromArray(String[] array) {
        return Stream.iterate(0, (x) -> x < array.length, (x) -> x + 2)
                .collect(Collectors.toMap(
                        (x) -> array[x],
                        (x) -> array[x + 1]));
    }

    public String[] getArrayFromMap(Map<String, String> map) {
        return map.entrySet()
                .stream()
                .flatMap((x) -> Stream.of(x.getKey(), x.getValue()))
                .toArray(String[]::new);
    }
}

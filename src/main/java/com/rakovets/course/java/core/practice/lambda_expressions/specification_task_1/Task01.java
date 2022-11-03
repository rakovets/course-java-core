package com.rakovets.course.java.core.practice.lambda_expressions.specification_task_1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task01 {
    public Map<String, String> getMapFromStringArray(String[] text) {
        return Stream.iterate(0, x -> x < text.length, x -> x + 2)
                .collect(Collectors.toMap(x -> text[x], x -> text[x + 1]));
    }

    public String[] getStringArrayFromMap(Map<String, String> map) {
        return map.entrySet()
                .stream()
                .flatMap(x -> Stream.of(x.getKey(), x.getValue()))
                .toArray(String[]::new);
    }
}

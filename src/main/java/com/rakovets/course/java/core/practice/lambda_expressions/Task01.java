package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task01 {
    public static Map<String, String> getMap(String[] keyValue) {
        keyValue[0] = keyValue[0].substring(1);
        String[] str = String.join(" ", keyValue).split(" -");
        return Stream.of(str)
                .map(e -> e.split(" "))
                .collect(Collectors.toMap(e -> "-" + e[0], e -> e[1]));
    }
}

package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static Map<String, String> getMap(String[] arr) {
        String[] strings = String.join(" ", arr).split(" -");
        return Stream.of(strings)
                .map(s -> s.split(" "))
                .collect(Collectors.toMap(k -> "-" + k[0], v -> v[1]));
    }

    public static List<String> getList(Map<String, String> getMap) {
        return getMap.entrySet()
                .stream()
                .map(m -> m.getKey() + " = " + m.getValue())
                .collect(Collectors.toList());
    }
}

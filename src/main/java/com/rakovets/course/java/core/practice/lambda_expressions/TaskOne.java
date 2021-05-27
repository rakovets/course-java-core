package com.rakovets.course.java.core.practice.lambda_expressions;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskOne {
    public static Map<String, String> getArrayToMap(String[] array) {
        String[] strings = String.join(" ", array).split(" -");
        return Stream.of(strings)
                .map(string -> string.split(" "))
                .collect(Collectors.toMap(k -> "-" + k[0], v -> v[1]));
    }

    public static List<String> getString(Map<String, String> getMap) {
        return getMap.entrySet()
                .stream()
                .map(m -> m.getKey() + " = " + m.getValue())
                .collect(Collectors.toList());
    }
}

package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static Map<String, String> getMap(String[] array) {
        String[] strings = String.join(" ",array).split(" -");
        return Stream.of(strings)
                .map(str -> str.split(" "))
                .collect(Collectors.toMap(k -> "-" + k[0], v -> v[1]));
    }

    public static List<String> getArray(Map <String, String> map) {
        return map.entrySet().stream().
                collect(
                        ArrayList::new,
                        (list, str) -> list.add(str.getKey() + "=" + str.getValue()),
                        ArrayList::addAll);
    }
}

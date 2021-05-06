package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayToMap {
    private static final Mappable HELPER = (x, y) -> Arrays.stream(x)
            .filter(e -> !e.startsWith("-"))
            .skip(y)
            .limit(1)
            .collect(Collectors.joining());

    public static void putStringToMap(String[] strings, Map<String,String> map) {
        Arrays.stream(strings)
                .filter(e -> e.startsWith("-"))
                .forEach(e -> map.put(e, HELPER.helpToAddValueToMap(strings,map.size())));
    }

    public static String[] mapToArray(Map<String,String> map) {
        return  map.entrySet()
                .stream()
                .map(e -> e.getKey() + "=" + e.getValue())
                .toArray(String[]::new);
    }
}


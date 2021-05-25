package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task01 {
    public static Map<String, String> convertArrayToMap(String[] keysAndValuesList) {
        Map<String, String> map = new HashMap<>();
        map = IntStream.range(0, keysAndValuesList.length / 2)
                .boxed()
                .collect(Collectors.toMap(
                        i -> keysAndValuesList[i * 2],
                        i -> keysAndValuesList[i * 2 + 1]));
        return map;
    }

    public static String[] convertMapToArray(Map<String, String> map) {
        return map.entrySet()
                .stream()
                .map(e -> e.getKey() + "=" + e.getValue())
                .toArray(String[]::new);
    }
}

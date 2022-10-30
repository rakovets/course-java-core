package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Task1 {
    public Map<String, String> getMap(String[] array) {
        Map<String, String> argsMap = new LinkedHashMap<>(array.length / 2);
        for (int i = 0; i < array.length; i += 2) {
            argsMap.put(array[i], array[i + 1]);
        }
        return argsMap;
    }

    public String[] getArrayString(Map<String, String> map) {
        String[] argsArray = map.entrySet().stream()
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
        return argsArray;
    }
}


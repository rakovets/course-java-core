package com.rakovets.course.java.core.practice.lambda_expressions.lambda_expressions;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaExpressions {
    public static Map<String, String> makeMapFromArray(String[] array) {
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i + 1 <= array.length; i += 2) {
            map.put(array[i], array[i + 1]);
        }
        return map;
    }

    public static String[] makeArrayFromMap(Map<String, String> map) {
        return map.entrySet().stream()
                .map(x -> x.getKey() + " - " + x.getValue())
                .collect(Collectors.toList())
                .toArray(new String[0]);
    }
}

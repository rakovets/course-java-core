package com.rakovets.course.java.core.practice.lambda_expressions.lambda_expressions;

import java.util.*;

public class LambdaExpressions {
    public static Map<String, String> makeMapFromArray(String[] array) {
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i + 1 <= array.length; i += 2) {
            map.put(array[i], array[i + 1]);
        }
        return map;
    }

    public static String[] makeArrayFromMap(Map<String, String> map) {
        Set<Map.Entry<String, String>> set = map.entrySet();
        Set<String> setString = new HashSet<>();
        set.stream().forEach(s -> setString.add(s.getKey() + " - " + s.getValue()));
        Object[] array1 = setString.toArray();
        String[] array = Arrays.copyOf(array1, array1.length, String[].class);
        return array;
    }
}

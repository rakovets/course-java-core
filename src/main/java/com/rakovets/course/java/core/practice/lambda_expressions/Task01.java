package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task01 {
    public static Map<String, String> getMap(String[] strings) {
        String delimiter = " ";
        String str = "-";

        String[] newString = String.join(delimiter, strings)
                .split(delimiter + str);
        return Arrays.stream(newString)
                .collect(Collectors.toMap(k ->str + k.split(delimiter)[0], v -> v.split(delimiter)[1]));
    }

    public static String[] getArrayStrings(Map<String, String> map) {
        return map.entrySet()
                .stream()
                .map(k -> k.getKey() + ", " + k.getValue() )
                .toArray(String[]::new);
    }
}

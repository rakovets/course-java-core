package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static Map<String, String> map(String[] incomingString) {
        String s = " ";
        String[] str = String.join(s,incomingString)
                .split(s + "-");
        return Arrays.stream(str)
                .collect(Collectors.toMap(e ->"-" +e.split(s)[0], e -> e.split(s)[1]));
    }

    public static List<String> mapToArray(Map<String, String> map) {
        return  map.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .collect(Collectors.toList());
    }
}

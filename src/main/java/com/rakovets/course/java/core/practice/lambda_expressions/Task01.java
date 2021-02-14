package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task01 {
    public static void main(String[] args) {
        String[] str = new String[] {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        System.out.println(Arrays.toString(getArray(getMap(str))));
    }

    public static Map<String, String> getMap(String[] keyValue) {
        keyValue[0] = keyValue[0].substring(1);
        String[] str = String.join(" ", keyValue).split(" -");
        return Stream.of(str)
                .map(e -> e.split(" "))
                .collect(Collectors.toMap(e -> "-" + e[0], e -> e[1]));
    }

    public static String[] getArray(Map<String, String> mapOfString) {
        return mapOfString.entrySet().stream()
                .map(e -> e.getKey() + " : " + e.getValue())
                .toArray(String[]::new);
    }
}

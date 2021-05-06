package com.rakovets.course.java.core.practice.lambda_expressions.task01;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Task01 {
    public Map<String, String> getMap(String[] array) {
        String[] text = String.join("  ", array).replace(" -", "--").split(" -");
        return Arrays.stream(text)
                .collect(Collectors.toMap(x -> x.split(" ")[0], x -> x.replace("  ", " ")
                        .split(" ")[1]));
    }

    public String[] getString(Map<String, String> map) {
        return map.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .toArray(String[]::new);
    }
}

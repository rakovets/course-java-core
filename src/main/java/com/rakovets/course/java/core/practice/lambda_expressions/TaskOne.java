package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskOne {
    public Map<String, String> getMap(String[] array) {
        String[] str = String.join("  ", array).replace(" -", "--")
                .split(" -");
        return Arrays.stream(str)
                .collect(Collectors.toMap(x -> x.split(" ")[0], x -> x.replace("  "," ").split(" ")[1]));
    }

    public String[] getString(Map<String, String> map) {
        return map.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .collect(Collectors.toList()).toArray(new String[0]);
    }
}

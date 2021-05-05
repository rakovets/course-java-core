package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskOne {
    public Map<String, String> getMap(String[] array) {
        String[] str = String.join(" ", array)
                .split(" -");
        return Arrays.stream(str)
                .collect(Collectors.toMap(x -> "-" + x.split(" ")[0], x -> x.split(" ")[1]));
    }

    public List<String> getString(Map<String, String> map) {
        return map.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .collect(Collectors.toList());
    }

}

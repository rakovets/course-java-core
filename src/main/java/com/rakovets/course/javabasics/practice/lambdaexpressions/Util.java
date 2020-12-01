package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Util {
    private String[] array;

    public Util(String[] array) {
        this.array = array;
    }

    public Map<String, String> toMap() {
        String spliterator = "spliterator";
        String string = Arrays.stream(array)
                .collect(Collectors.joining(spliterator));
        String[] arr = string.split(spliterator + "-");
        return Arrays.stream(arr)
                .collect(Collectors.toMap(s -> "-" + s.split(spliterator)[0], s -> s.split(spliterator)[1]));
    }

    public static Object[] mapToArray(Map<String, String> map) {
        return map.entrySet().toArray();
    }
}

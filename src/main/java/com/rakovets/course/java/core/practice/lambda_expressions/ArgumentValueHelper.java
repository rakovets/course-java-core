package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArgumentValueHelper {
    public Map<String, String> getMapFromStringArray(String[] array) {
        Map<String, String> map = IntStream.range(0, array.length / 2)
                .boxed()
                .collect(Collectors.toMap(i -> array[i * 2], i -> array[i * 2 + 1]));
        if (array.length % 2 != 0) {
            map.put(array[array.length - 1], "");
        }
        return map;
    }

    public String[] getStringArrayFromMap(Map<String, String> map) {
        return map.entrySet().stream()
                        .flatMap(c-> Stream.of(c.getKey(),c.getValue()))
                        .toArray(String []::new);
    }
}

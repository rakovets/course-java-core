package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.iterate;

public class MapToArray {
    /**
     * Makes an array-to-map conversion.
     *
     * @param array to convert.
     * @return converted array to map.
     */
    public Map<String, String> generateMap(String[] array) {
        return iterate(0, i -> i + 1 <= array.length, i -> i + 2)
                .boxed()
                .collect(Collectors.toMap(i -> array[i], i -> array[i + 1], (a, b) -> b));
    }

    /**
     * Does a map-to-array conversion.
     *
     * @param map array to convert.
     * @return converted map to array.
     */
    public String[] mapToArray(Map<String, String> map) {
        return map
                .entrySet()
                .stream()
                .map(e -> e.getKey() + ", " + e.getValue())
                .toArray(String[]::new);
    }
}

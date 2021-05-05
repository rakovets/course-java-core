package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task01 {
    private static Map<String, String> map = new HashMap<>();
    private static final String[] keysAndValuesList = new String[] {
            "-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"
    };

    public static Map<String, String> convertArrayToMap() {
        map = IntStream.range(0, keysAndValuesList.length / 2)
                .boxed()
                .collect(Collectors.toMap(
                        i -> keysAndValuesList[i * 2],
                        i -> keysAndValuesList[i * 2 + 1]));
        return map;
    }

    public static String[] convertMapToArray() {
        /*String[] array = new String[map.size()];
        String[] keys = map.keySet().toArray(new String[0]);
        String[] values = map.values().toArray(new String[0]);

        for (int i = 0; i < array.length; i++) {
            array[i] = keys[i] + "=" + values[i];
        }
        return array;*/
        return map.entrySet()
                .stream()
                .map(e -> e.getKey() + "=" + e.getValue())
                .toArray(String[]::new);
    }
}

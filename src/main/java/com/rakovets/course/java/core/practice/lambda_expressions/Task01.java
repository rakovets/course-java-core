package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Task01 {
    public static Map<String, String> createMap(String[] array) {
        return Arrays.stream(getEntries(array))
                .collect(Collectors.toMap(key -> key.split(" ")[0], value -> value.split(" ")[1]));
    }

    public static List<String> convertMapToList(Map<String, String> map) {
        return map.entrySet().stream()
                .collect(
                        ArrayList::new,
                        (list, item) -> list.add(item.getKey() + ": " + item.getValue()),
                        ArrayList::addAll);
    }

    private static String[] getEntries(String[] array) {
        String[] work = new String[array.length / 2];
        int i = 0;
        int j = 0;

        while (i <= array.length - 1) {
            work[j] = String.join(" ", array[i], array[i + 1]);
            i += 2;
            j++;
        }
        return work;
    }
}

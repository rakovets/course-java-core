package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Task1 {
    public static Map<String, String> generateMap(String[] array) {
        return Arrays.stream(getEntries(array))
                .collect(Collectors.toMap(key -> key.split(" ")[0], value -> value.split(" ")[1]));
    }

    public static List<String> transformMapToList(Map<String, String> map) {
        return map.entrySet().stream()
                .collect(
                        ArrayList::new,
                        (list, item) -> list.add(item.getKey() + ": " + item.getValue()),
                        ArrayList::addAll);
    }

    private static String[] getEntries(String[] array) {
        String[] work = new String[array.length/2];
        int y = 0;

        for (int x = 0; x <= array.length - 1;) {
            work[y] = String.join(" ", array[x], array[x + 1]);
            x += 2;
            y++;
        }
        return work;
    }
}

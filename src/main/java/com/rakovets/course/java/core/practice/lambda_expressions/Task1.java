package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task1 {
    private final String[] array;
    private final String[] entries;

    public Task1(String[] array) {
        this.array = array;
        this.entries = getEntries();
    }

    private String[] getEntries() {
        String[] work = new String[array.length/2];
        int y = 0;

        for (int x = 0; x <= array.length - 1;) {
            work[y] = String.join(" ", array[x], array[x + 1]);
            x += 2;
            y++;
        }
        return work;
    }

    public Map<String, String> generateMap() {
        return Arrays.stream(entries)
                .collect(Collectors.toMap(p -> p.split(" ")[0], t -> t.split(" ")[1]));
    }

    public List<String> transformMapToList(Map<String, String> map) {
        return map.entrySet().stream()
                .collect(
                        ArrayList::new,
                        (list, item) -> list.add(item.getKey() + ": " + item.getValue()),
                        ArrayList::addAll);
    }
}

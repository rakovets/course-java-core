package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    private String[] array;

    public Task1(String[] array) {
        this.array = array;
    }

     public Map<String, String> getMap() {
        Map<String, String> map = new LinkedHashMap<>(array.length / 2);
        for (int i = 0; i < array.length; i += 2) {
            map.put(array[i], array[i + 1]);
        }
        return map;
    }

    public List<String> mapToList(Map<String, String> map) {
        return map.entrySet().stream()
                .collect(
                        ArrayList::new,
                        (list, item) -> list.add(item.getKey() + ": " + item.getValue()),
                        ArrayList::addAll);
    }
}

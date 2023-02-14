package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static Map<String, String> createMapFromList(List<String> list) {
        return list.stream().collect(Collectors.toMap((str) -> "argument_" + (list.indexOf(str) + 1), str -> str));
    }

    public static Collection<String> createListFromMap(Map<String, String> map) {
        return new ArrayList<>(map.values());
    }

    /*public static Map<String, String> createMapFromArray(Collection<String> collection) {
        String argument = "argument_";
        Iterator<String> iterator = collection.iterator();
        Map<String, String> resultMap = new LinkedHashMap<>();
        for (int i = 1; i <= collection.size(); i++) {
            resultMap.put(argument + i, iterator.next());
        }
        return resultMap;
    }*/
}

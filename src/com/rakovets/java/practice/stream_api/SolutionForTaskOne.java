package com.rakovets.java.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SolutionForTaskOne {
    public static void main(String[] args) {
        String[] arguments = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};

        Map<String, String> resultMapping = new HashMap<>();

        for (int i = 0; i < arguments.length; i = i + 2) {
            resultMapping.put(arguments[i], arguments[i + 1]);
        }

        resultMapping.entrySet().stream()
                .forEach(entry -> System.out.printf("key:%s, value:%s\n", entry.getKey(), entry.getValue()));

        // Way 1
        String[] objects = (String[]) resultMapping.entrySet().stream()
                .flatMap(entry -> Stream.of(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList())
                .toArray();

        // Way 2
        String[] revertResult = new String[resultMapping.size() * 2];
        int index = 0;
        for (Iterator<Map.Entry<String, String>> it = resultMapping.entrySet().iterator(); it.hasNext(); index += 2) {
            Map.Entry<String, String> mapItem = it.next();
            revertResult[index] = mapItem.getKey();
            revertResult[index + 1] = mapItem.getValue();
        }

    }
}

package com.rakovets.course.java.core.practice.lambda_expressions.task_01;

import java.util.*;
import java.util.stream.Stream;

public class DemoTask01 {
    public static void main(String[] args) {
        String ARGUMENTS_NAME = "Arg_";

        String[] arrayArguments = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Map<String, String> mapArguments = new LinkedHashMap<>();
        Stream.of(arrayArguments).forEach(s -> mapArguments.put(ARGUMENTS_NAME + (mapArguments.size() + 1), s));
        System.out.println(mapArguments.entrySet());
        List<String> listValuesFromMap = new ArrayList<>();
        mapArguments.values()
                .forEach(s -> {
                    System.out.print(s + "\t");
                    listValuesFromMap.add(s);
                });
        System.out.println();
        String[] stringArrayBackFromMap = new String[listValuesFromMap.size()];
        listValuesFromMap.toArray(stringArrayBackFromMap);
        for (String s : stringArrayBackFromMap) {
            System.out.print(s + "\t");
        }
        System.out.println();
        for (String s : arrayArguments) {
            System.out.print(s + "\t");
        }
    }
}

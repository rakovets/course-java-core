package com.rakovets.course.java.core.practice.lambda_expressions.task_01;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoTask01 {
    public static void main(String[] args) {
        String[] arrayArguments = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Stream.of(arrayArguments)
                .sequential()
                .forEach(x -> System.out.printf(x));
        System.out.println();

        ArgumentsConverter argumentsConverter = new ArgumentsConverter();
        Map<String, String> mapArguments = argumentsConverter.convertArgumentsToMap(arrayArguments);
        System.out.println(mapArguments.entrySet());

        List<String> stringList = mapArguments.values().stream().collect(Collectors.toList());
        String[] strings = new String[stringList.size()];
        stringList.toArray(strings);
        String actual = String.join("", strings);
        String expected = String.join("", arrayArguments);
        System.out.println(actual);
        System.out.println(expected);
        System.out.println();

        String[] stringArrayFromMap = argumentsConverter.convertArgumentsFromMap(mapArguments);
        Stream.of(stringArrayFromMap)
                .sequential()
                .forEach(x -> System.out.printf(x));
        System.out.println();
        String stringActual = String.join("", stringArrayFromMap);
        String stringExpected = String.join("", arrayArguments);
        System.out.println(stringActual);
        System.out.println(stringExpected);
    }
}

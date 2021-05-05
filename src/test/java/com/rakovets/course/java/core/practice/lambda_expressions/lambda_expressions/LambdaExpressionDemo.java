package com.rakovets.course.java.core.practice.lambda_expressions.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.lambda_expressions.LambdaExpressions;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        String[] array = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Map<String, String> map = LambdaExpressions.makeMapFromArray(array);
        Set<Map.Entry<String, String>> argumentsWithValue = map.entrySet();
        argumentsWithValue.stream().forEach(s -> System.out.printf("Argument: %s, value: %s\n", s.getKey(), s.getValue()));

        String[] array1 = LambdaExpressions.makeArrayFromMap(map);
        System.out.println("\nThis is array from Map:");
        Arrays.stream(array1).forEach(System.out::println);
    }
}

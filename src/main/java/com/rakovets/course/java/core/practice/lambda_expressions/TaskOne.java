package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskOne {
    public static Map<String, String> putArrayToMap(String[] array) {
        return Arrays.stream(getString(array))
                .collect(Collectors.toMap(key -> key.split(" ")[0], value -> value.split(" ")[1]));
    }

    private static String[] getString(String[] array) {
        String[] str = new String[array.length / 2];
        int i = 0;
        int j = 0;

        while (i <= array.length - 1) {
            str[j] = String.join(" ", array[i], array[i + 1]);
            i += 2;
            j++;
        }
        return str;
    }
}

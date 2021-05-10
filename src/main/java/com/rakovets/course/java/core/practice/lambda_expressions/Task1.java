package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static Map<String, String> map(String[] array) {
        return Arrays.stream(stringArray(array))
                .collect(Collectors.toMap(key -> key.split(" ")[0], value -> value.split(" ")[1]));
    }


    private static String[] stringArray(String[] array) {
        String[] work = new String[array.length / 2];
        int i = 0;
        int j = 0;

        while (i <= array.length - 1) {
            work[j] = String.join(" ", array[i], array[i + 1]);
            j++;
            i += 2;
        }
        return work;
    }
}

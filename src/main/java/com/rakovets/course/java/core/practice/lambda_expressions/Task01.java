package com.rakovets.course.java.core.practice.lambda_expressions;
import java.util.*;
import java.util.stream.Collectors;

public class Task01 {
    public static Map<String, String> getArrayToMap(String[] array) {
        return Arrays.stream(getString(array))
                .collect(Collectors.toMap(key -> key.split(" ")[0], value -> value.split(" ")[1]));
    }

    private static String[] getString(String[] array) {
        String[] work = new String[array.length / 2];
        int i = 0;
        int j = 0;

        while (i <= array.length - 1) {
            work[j] = String.join(" ", array[i], array[i + 1]);
            i += 2;
            j++;
        }
        return work;
    }
}

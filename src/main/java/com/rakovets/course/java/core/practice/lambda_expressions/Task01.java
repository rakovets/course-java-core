package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task01 {
    private static String[] keysAndValuesList = new String[] {
            "-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"
    };

    public static Map<String, String> convertArrayToMap() {
        return IntStream.range(0, keysAndValuesList.length / 2)
                .boxed()
                .collect(Collectors.toMap(
                        i -> keysAndValuesList[i * 2],
                        i -> keysAndValuesList[i * 2 + 1]));
    }

    public static List<String> convertMapToList() {
        return Arrays.stream(keysAndValuesList).collect(Collectors.toList());
    }
}

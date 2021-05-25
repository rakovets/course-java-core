package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task01Demo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(Map.of(
                "a", "1",
                "b", "2",
                "c", "3",
                "d", "4"
        ));
        String[] keysAndValuesList = new String[] {
                "-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"
        };
        System.out.println(Task01.convertArrayToMap(keysAndValuesList));
        System.out.println(Arrays.toString(Task01.convertMapToArray(map)));
    }
}

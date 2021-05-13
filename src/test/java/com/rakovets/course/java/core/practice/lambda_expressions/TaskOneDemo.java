package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.HashMap;
import java.util.Map;

public class TaskOneDemo {
    public static void main(String[] args) {
        String[] strings = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Map<String, String> map = new HashMap<>();
        System.out.println(TaskOne.putArrayToMap(strings));

    }
}

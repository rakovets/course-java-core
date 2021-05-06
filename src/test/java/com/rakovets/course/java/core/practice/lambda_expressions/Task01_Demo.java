package com.rakovets.course.java.core.practice.lambda_expressions;
import java.util.HashMap;
import java.util.Map;

public class Task01_Demo {
    public static void main(String[] args) {
        String[] strings = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Map<String, String> map = new HashMap<>();
        System.out.println(Task01.getArrayToMap(strings));

    }
}

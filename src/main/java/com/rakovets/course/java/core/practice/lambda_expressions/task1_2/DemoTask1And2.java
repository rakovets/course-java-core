package com.rakovets.course.java.core.practice.lambda_expressions.task1_2;

import java.util.HashMap;
import java.util.Map;

public class DemoTask1And2 {
    public static void main(String[] args) {
        String[] text = new String[] {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        System.out.println(Task1.getMap(text));

        Map<String, String> map = new HashMap<>();
        map.putAll(Task1.getMap(text));
        System.out.println(Task1.convertToString(map));

        Task2.getMultiplicationTableColumn();
        Task2.getMultiplicationTable5Column();
    }
}

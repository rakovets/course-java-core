package com.rakovets.course.java.core.practice.lambda_expressions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class Task1Demo {
    public static void main(String[] args) {
        String[] strings = new String[] {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};

        System.out.println(Arrays.toString(strings));
        System.out.println(Task1.getMap(strings).toString());
        System.out.println(Task1.getList(Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt")).toString());
    }
}

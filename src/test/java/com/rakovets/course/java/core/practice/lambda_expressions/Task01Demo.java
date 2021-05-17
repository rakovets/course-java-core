package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;

public class Task01Demo {
    public static void main(String[] args) {
        String[] elements = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};

        System.out.println(Task01.getMap(elements));
        System.out.println(Arrays.toString(Task01.getArrayStrings(Task01.getMap(elements))));
    }
}

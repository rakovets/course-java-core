package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;

public class Task01Demo {
    public static void main(String[] args) {
        String[] strings = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Task01 t = new Task01();
        System.out.println(t.keysAndValuesSorted(strings));
        System.out.println(Arrays.toString(t.convertMapToString(t.keysAndValuesSorted(strings))));
    }
}

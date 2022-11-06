package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;

public class Task1Demo {
    public static void main(String[] args) {
        String[] stringsTest = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Task1 str = new Task1();
        System.out.println(str.getKeyAndValue(stringsTest));
        System.out.println(Arrays.toString(str.convertToString(str.getKeyAndValue(stringsTest))));
    }
}

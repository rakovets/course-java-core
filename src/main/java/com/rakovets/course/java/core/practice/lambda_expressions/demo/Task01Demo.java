package com.rakovets.course.java.core.practice.lambda_expressions.demo;

import com.rakovets.course.java.core.practice.lambda_expressions.tasks.Task01;

import java.util.Arrays;
import java.util.Map;

public class Task01Demo {
    public static void main(String[] args) {
        String[] strings = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Task01 converter = new Task01();

        Map<String, String> mapFromStringArray = converter.arrayToMap(strings);
        System.out.println(mapFromStringArray);

        String[] stringArrayFromMap = converter.mapToStringArray(mapFromStringArray);
        System.out.println(Arrays.toString(stringArrayFromMap));
    }
}

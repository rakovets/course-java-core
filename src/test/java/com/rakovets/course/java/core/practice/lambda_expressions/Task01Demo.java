package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Map;

public class Task01Demo {
    public static void main(String[] args) {
        String[] strings = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Task01 converter = new Task01();

        Map<String, String> mapFromStringArray = converter.convertArrayToMap(strings);
        System.out.println(mapFromStringArray);

        String[] stringArrayFromMap = converter.convertMapToStringArray(mapFromStringArray);
        System.out.println(Arrays.toString(stringArrayFromMap));
    }
}

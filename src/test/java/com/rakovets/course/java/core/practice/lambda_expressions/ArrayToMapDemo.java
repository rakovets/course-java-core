package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayToMapDemo {
    public static void main(String[] args) {
        String[] strings = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Map<String,String> map = new HashMap<>();
        ArrayToMap.putStringToMap(strings, map);
        System.out.println(map);
        System.out.println(Arrays.toString(ArrayToMap.mapToArray(map)));
    }
}
